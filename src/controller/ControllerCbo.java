package controller;
// @author Clayton A. Magaton
import dao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelCbo;

public class ControllerCbo {
    ConexaoBD conex = new ConexaoBD();
    //METODO PARA SALVAR DADOS NO BANCO DE DADOS;
    public void salvarCbo(ModelCbo modSave){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO tb_cbo (cbo, descricao, status) VALUES (?,?,?)");
            pst.setInt(1, modSave.getCodigo());
            pst.setString(2, modSave.getDescricao());
            pst.setInt(3, modSave.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null,"CBO cadastrado com sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o CBO: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }        
        conex.desconecta();
    }
   //METODO PARA EDITAR DADOS DO BANCO DE DADOS;
    public void alterarCbo(ModelCbo modAtu){
        conex.conexao();
        try {
            PreparedStatement pstAtu = conex.con.prepareCall("UPDATE tb_cbo SET descricao=?,status=? WHERE cbo ="+modAtu.getCodigo());
            pstAtu.setString(1, modAtu.getDescricao());
            pstAtu.setInt(2, modAtu.getStatus());
            pstAtu.execute();
            JOptionPane.showMessageDialog(null,"CBO alterado com sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar o CBO: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
    }
    //METODO PARA EXCLUIR CBO DO BANCO DE DADOS;
    public void excluirCbo(Integer Pesq){
        conex.conexao();
        try {
            PreparedStatement pstExc = conex.con.prepareStatement("DELETE FROM tb_cbo WHERE cbo ="+Pesq);
            pstExc.execute();
            JOptionPane.showMessageDialog(null,"CBO excluido com sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao exclir o CBO: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
    }
    //METODO PARA LISTAR CBOS CADASTRADO NO BANCO E ENVIA PARA TABELA;
    public ArrayList<ModelCbo> listaCbo(ModelCbo modList){
        ModelCbo modCbo = new ModelCbo();
        ArrayList<ModelCbo> listaModCbo = new ArrayList<>();
        conex.conexao();
        conex.executeSQL("SELECT * FROM tb_cbo WHERE descricao LIKE '%"+modList.getPesquisa()+"%'");
        try {
            while (conex.rs.next()) {
                modCbo = new ModelCbo();
                modCbo.setCodigo(this.conex.rs.getInt(1));
                modCbo.setDescricao(this.conex.rs.getString(2));
                modCbo.setStatus(this.conex.rs.getInt(3));
                listaModCbo.add(modCbo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Nenhum cbo encontrado: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
        return listaModCbo;
    }
    //METODO PARA RECUPERAR DADO DE UM CBO E PREENCHER FORMULARIO;
    public ModelCbo retoraCbo(Integer codCbo){
        ModelCbo modRet = new ModelCbo();
        conex.conexao();
        conex.executeSQL("SELECT * FROM tb_cbo WHERE cbo ="+codCbo);
        try {
            conex.rs.next();
            modRet.setCodigo(conex.rs.getInt("cbo"));
            modRet.setDescricao(conex.rs.getString("descricao"));
            modRet.setStatus(conex.rs.getInt("status"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel listar cbo: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
        return modRet;
    }    
}
