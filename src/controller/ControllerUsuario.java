
package controller;
// @author Clayton A. Magaton
import dao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelUsuario;


public class ControllerUsuario {
    ConexaoBD conex = new ConexaoBD();
    ModelUsuario mod = new ModelUsuario();
    // METODO: GRAVA DADOS DO USUSARIO NO BANCO DE DADOS;
    public void SalvarUsuario(ModelUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO tb_usuario (ususenha, usuperfil, usunome, usulogin,usuativo)VALUES(?,?,?,?,?)");
            pst.setString(1, mod.getSenha());
            pst.setString(2, mod.getPerfil());
            pst.setString(3, mod.getNome());
            pst.setString(4, mod.getLogin());
            pst.setInt(5, mod.getAtivo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar usuário"+ex.getMessage());
        }        
        conex.desconecta();
    }
    //METODO: ALTERA DADOS DO USUARIO NO BANCO DE DADOS;
    public void atualizaUsuario(ModelUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE tb_usuario SET usunome=?, ususenha=?, usuperfil=?, usuativo=? WHERE idusuario="+mod.getCodigo());
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getPerfil());
            pst.setInt(4, mod.getAtivo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao editar dados do usuário"+ex.getMessage());
        }       
        conex.desconecta();
    }
    //METODO: EXCLUI USUARIO DO BANCO DE DADOS;
    public void excluirUsuario(ModelUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM tb_usuario WHERE idusuario="+mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir usuário"+ex.getMessage());
        }        
        conex.desconecta();
    }
    //METODO: PESQUISA USURIO NO BANCO DE DADOS PELO NOME;
    public ModelUsuario pesquisaUser(ModelUsuario mod){        
        try {
            conex.conexao();
            conex.executeSQL("SELECT * FROM tb_usuario WHERE usunome LIKE '%"+mod.getPesquisa()+"%'");
            conex.rs.next();
            mod.setCodigo(conex.rs.getInt("idusuario"));
            mod.setNome(conex.rs.getString("usunome"));
            mod.setLogin(conex.rs.getString("usulogin"));
            mod.setSenha(conex.rs.getString("ususenha"));
            mod.setPerfil(conex.rs.getString("usuperfil"));
            mod.setAtivo(conex.rs.getInt("usuativo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum usuario encontrado com esse nome"+ex.getMessage(), "Error",JOptionPane.ERROR);
        }
        conex.desconecta();
        return mod;
    }
    // METODO: LISTA USUARIO DO BANCO DE DADOS PARA PREENCHER A TABELA
    public ArrayList<ModelUsuario> listaUsuario(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try{
            conex.conexao();
            conex.executeSQL("SELECT idusuario, usunome, usulogin,usuperfil,usuativo FROM tb_usuario ORDER BY idusuario");
            while(this.conex.rs.next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setCodigo(this.conex.rs.getInt(1));
                modelUsuario.setNome(this.conex.rs.getString(2));
                modelUsuario.setLogin(this.conex.rs.getString(3));
                modelUsuario.setPerfil(this.conex.rs.getString(4));
                modelUsuario.setAtivo(this.conex.rs.getInt(5));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Nenhum usuario encontrado\n"+ex.getMessage(), "Error",JOptionPane.ERROR);
        }
        conex.desconecta();
        return listamodelUsuario;
    }
    
    // METODO: LISTA USUARIO DO BANCO DE DADOS PARA PREENCHER A TABELA
    public ArrayList<ModelUsuario> listaUsuarioNome(ModelUsuario mod){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try{
            conex.conexao();
            conex.executeSQL("SELECT idusuario, usunome, usulogin,usuperfil,usuativo FROM tb_usuario WHERE usunome LIKE '%"+mod.getPesquisa()+"%' ORDER BY idusuario");
            while(this.conex.rs.next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setCodigo(this.conex.rs.getInt(1));
                modelUsuario.setNome(this.conex.rs.getString(2));
                modelUsuario.setLogin(this.conex.rs.getString(3));
                modelUsuario.setPerfil(this.conex.rs.getString(4));
                modelUsuario.setAtivo(this.conex.rs.getInt(5));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Nenhum usuario encontrado\n"+ex.getMessage(), "Error",JOptionPane.ERROR);
        }
        conex.desconecta();
        return listamodelUsuario;
    }
    
    public boolean acessoUsuario(String user, String senha){
        boolean acesso  = false;
        try {
            conex.conexao();
            conex.executeSQL("SELECT * FROM tb_usuario WHERE usulogin = '"+user+"' AND ususenha = '"+senha+"'");
            if(conex.rs.next()){
                acesso = true;
            }else{
                acesso = false;
            }
             conex.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum usuario encontrado\n"+ex.getMessage(), "Error",JOptionPane.ERROR);
        }
        conex.desconecta();
        return acesso;
    }
}
