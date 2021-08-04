package controller;
// @author Clayton A. Magaton
import dao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelEnfermargem;

public class ControllerEnfermagem {
    ConexaoBD conex = new ConexaoBD();
    //ModelEnfermargem modEnf = new ModelEnfermargem();
    
    //METODO PARA SALVAR DADOS DA ENFERMEGEM NO BANCO DE DADOS:
    public void salvarEnf(ModelEnfermargem modEnf){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO tb_enfermagem "
                    + "(enf_nome,enf_nascimento,enf_civil, enf_telefone, enf_celular,"
                    + " enf_contato, enf_email, enf_coren, enf_tipo, enf_status) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modEnf.getNome());
            pst.setString(2, modEnf.getNascimento());
            pst.setString(3, modEnf.getCivil());
            pst.setString(4, modEnf.getTelefone());
            pst.setString(5, modEnf.getCelular());
            pst.setString(6, modEnf.getContato());
            pst.setString(7, modEnf.getEmail());
            pst.setString(8, modEnf.getCoren());
            pst.setString(9, modEnf.getTipo());
            pst.setInt(10, modEnf.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Enfermeiro(a) cadastrado com sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o Enfermeiro(a): "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }        
        conex.desconecta();
    }    
    //METODO PARA ALTERAR DADOS DO BANCO DE DADOS;
    public void atualizarEnf(ModelEnfermargem modAtu){
        conex.conexao();
        try {        
            PreparedStatement pstAtu = conex.con.prepareStatement("UPDATE tb_enfermagem SET enf_nome=?,enf_nascimento=?,enf_civil=?,"
                    + "enf_telefone=?,enf_celular=?,enf_contato=?,enf_email=?,enf_coren=?,enf_tipo=?,enf_status=? WHERE idenf="+modAtu.getCod());
            pstAtu.setString(1, modAtu.getNome());
            pstAtu.setString(2, modAtu.getNascimento());
            pstAtu.setString(3, modAtu.getCivil());
            pstAtu.setString(4, modAtu.getTelefone());
            pstAtu.setString(5, modAtu.getCelular());
            pstAtu.setString(6, modAtu.getContato());
            pstAtu.setString(7, modAtu.getEmail());
            pstAtu.setString(8, modAtu.getCoren());
            pstAtu.setString(9, modAtu.getTipo());
            pstAtu.setInt(10, modAtu.getStatus());
            pstAtu.execute();
            JOptionPane.showMessageDialog(null, "Enfermeiro(a) alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao editar dados do enfermeiro(a):"+ex.getMessage());
        }
        conex.desconecta();
    }    
    //METODO PARA EXCLUIR ENFERMAGEM DO BANCO DE DADOS;
    public void excluirEnf(ModelEnfermargem mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("DELETE FROM tb_enfermagem WHERE idenf="+mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Enfermeiro(a) excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir enfermeiro(a)"+ex.getMessage());
        }        
        conex.desconecta();
    }    
    //METODO PARA LISTAR ENFERMEIROS DO BANCO DE DADOS E ENVIA PARA TABELA;
    public ArrayList<ModelEnfermargem> listaEnf (ModelEnfermargem mod){
        ModelEnfermargem modEnf = new ModelEnfermargem();
        ArrayList<ModelEnfermargem> listamodelEnf = new ArrayList<>();
        conex.conexao();
        conex.executeSQL("SELECT idenf, enf_nome,enf_coren,enf_tipo FROM tb_enfermagem WHERE enf_nome LIKE '%"+mod.getPesquisa()+"%' ORDER BY idenf");
        try {
            while (this.conex.rs.next()) {
                modEnf = new ModelEnfermargem();
                modEnf.setCod(this.conex.rs.getInt(1));
                modEnf.setNome(this.conex.rs.getString(2));
                modEnf.setCoren(this.conex.rs.getString(3));
                modEnf.setTipo(this.conex.rs.getString(4));
                listamodelEnf.add(modEnf);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel listar enfermeiros: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }        
        conex.desconecta();
        return listamodelEnf;
    }    
    //METODO PARA PESQUISAR UM ENFERMEIRO E RETORNAR OS SEUS DADOS PARA O FORMULARIO:
    public ModelEnfermargem PesqEnf(Integer pes){
        ModelEnfermargem modPes = new ModelEnfermargem();
        conex.conexao();
        conex.executeSQL("SELECT * FROM tb_enfermagem WHERE idenf = '"+pes+"'");
        try {
            conex.rs.next();
            modPes.setCod(conex.rs.getInt("idenf"));
            modPes.setNome(conex.rs.getString("enf_nome"));
            modPes.setNascimento(conex.rs.getString("enf_nascimento"));
            modPes.setCivil(conex.rs.getString("enf_civil"));
            modPes.setTelefone(conex.rs.getString("enf_telefone"));
            modPes.setCelular(conex.rs.getString("enf_celular"));
            modPes.setContato(conex.rs.getString("enf_contato"));
            modPes.setEmail(conex.rs.getString("enf_email"));
            modPes.setCoren(conex.rs.getString("enf_coren"));
            modPes.setTipo(conex.rs.getString("enf_tipo"));
            modPes.setStatus(conex.rs.getInt("enf_status"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel listar enfermeiros: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
        return modPes;
    }    
}
