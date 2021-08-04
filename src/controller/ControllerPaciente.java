
package controller;
// @author Clayton A. Magaton
import dao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelPaciente;

public class ControllerPaciente {
    ConexaoBD conex = new ConexaoBD();    
    //METODO PARA CADASTRAR PACIENTE NO BANCO DE DADOS:
    public void cadastrarPac(ModelPaciente modCad){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO tb_paciente (pac_nome, pac_nascimento, pac_mae, pac_pai,"
                    + "pac_sexo, pac_cpf,pac_cns,pac_rg,pac_tel,pac_cel,pac_contato,pac_email,"
                    + "pac_cep,pac_ibge,pac_endereco,pac_numero,pac_complemento,pac_bairro,pac_cidade,pac_uf,pac_status) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, modCad.getNome());
            pst.setString(2, modCad.getNascimento());
            pst.setString(3, modCad.getMae());
            pst.setString(4, modCad.getPai());
            pst.setString(5, modCad.getSexo());
            pst.setString(6, modCad.getCpf());
            pst.setInt(7, modCad.getCns());
            pst.setString(8, modCad.getRg());
            pst.setString(9, modCad.getTelefone());
            pst.setString(10, modCad.getCelular());
            pst.setString(11, modCad.getContato());
            pst.setString(12, modCad.getEmail());
            pst.setString(13, modCad.getCep());
            pst.setInt(14, modCad.getIbge());
            pst.setString(15, modCad.getEndereco());
            pst.setString(16, modCad.getNumero());
            pst.setString(17, modCad.getComplemento());
            pst.setString(18, modCad.getBairro());
            pst.setString(19, modCad.getCidade());
            pst.setString(20, modCad.getUf());
            pst.setInt(21, modCad.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Paciente cadastrado com sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o Paciente: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();        
    }
    
    // METODO PARA ATUALIZAR DADOS DO PACIENTE NO BANCO DE DADOS:
    public void atualizaPac(ModelPaciente modAtu){
        conex.conexao();
        try {
            PreparedStatement pstAtu = conex.con.prepareStatement("UPDATE tb_paciente"
                    + " SET"
                    + " pac_nome = ?,"
                    + " pac_nascimento = ?,"
                    + " pac_mae = ?,"
                    + " pac_pai = ?,"
                    + " pac_sexo = ?,"
                    + " pac_cpf = ?,"
                    + " pac_cns = ?,"
                    + " pac_rg = ?,"
                    + " pac_tel = ?,"
                    + " pac_cel = ?,"
                    + " pac_contato = ?,"
                    + " pac_email = ?,"
                    + " pac_cep = ?,"
                    + " pac_ibge = ?,"
                    + " pac_endereco = ?,"
                    + " pac_numero = ?,"
                    + " pac_complemento = ?,"
                    + " pac_bairro = ?,"
                    + " pac_cidade = ?,"
                    + " pac_uf = ?,"
                    + " pac_status = ?"                    
                    + " WHERE id_paciente = "+modAtu.getIdPaciente());
            pstAtu.setString(1, modAtu.getNome());
            pstAtu.setString(2, modAtu.getNascimento());
            pstAtu.setString(3, modAtu.getMae());
            pstAtu.setString(4, modAtu.getPai());
            pstAtu.setString(5, modAtu.getSexo());
            pstAtu.setString(6, modAtu.getCpf());
            pstAtu.setInt(7, modAtu.getCns());
            pstAtu.setString(8, modAtu.getRg());
            pstAtu.setString(9, modAtu.getTelefone());
            pstAtu.setString(10, modAtu.getCelular());
            pstAtu.setString(11, modAtu.getContato());
            pstAtu.setString(12, modAtu.getEmail());
            pstAtu.setString(13, modAtu.getCep());
            pstAtu.setInt(14, modAtu.getIbge());
            pstAtu.setString(15, modAtu.getEndereco());
            pstAtu.setString(16, modAtu.getNumero());
            pstAtu.setString(17, modAtu.getComplemento());
            pstAtu.setString(18, modAtu.getBairro());
            pstAtu.setString(19, modAtu.getCidade());
            pstAtu.setString(20, modAtu.getUf());
            pstAtu.setInt(21, modAtu.getStatus());
            pstAtu.execute();
            JOptionPane.showMessageDialog(null,"Paciente alterado com sucesso","Confirmação",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar o cadastro do Paciente: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
    }
    
    //METODO PARA EXCLUIR UM PACIENTE DO BANCO DE DADOS:
    public void excluirPac(Integer pac){
        conex.conexao();
        try {
            PreparedStatement pstEx = conex.con.prepareStatement("DELETE FROM tb_paciente WHERE id_paciente="+pac);
            pstEx.execute();
            JOptionPane.showMessageDialog(null, "Paciente excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir o Paciente: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
    }
    
    //METODO PARA LISTAR DADOS DO PACIENTE NA TABELA:
    public ArrayList<ModelPaciente> listarPac(String pesq){
        ModelPaciente modPac = new ModelPaciente();
        ArrayList<ModelPaciente> listaModPac = new ArrayList<>();
        conex.conexao();
        conex.executeSQL("SELECT id_paciente,pac_nome,pac_rg,pac_cpf,pac_mae,pac_nascimento,pac_cns FROM tb_paciente WHERE pac_nome LIKE '%"+pesq+"%'");
        try {
            while (this.conex.rs.next()) {
                modPac = new ModelPaciente();
                modPac.setIdPaciente(this.conex.rs.getInt(1));
                modPac.setNome(this.conex.rs.getString(2));
                modPac.setRg(this.conex.rs.getString(3));
                modPac.setCpf(this.conex.rs.getString(4));
                modPac.setMae(this.conex.rs.getString(5));
                modPac.setNascimento(this.conex.rs.getString(6));
                modPac.setCns(this.conex.rs.getInt(7));
                listaModPac.add(modPac);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao listar pacientes: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
        return listaModPac;
    }
    
    //METODO PARA RECUPERAR DADOS DE UM PACIENTE E RETORNAR PARA O FORMULARIO:
    public ModelPaciente pesqPac(Integer selecionado){
        ModelPaciente modPesq = new ModelPaciente();
        conex.conexao();
        conex.executeSQL("SELECT * FROM tb_paciente WHERE id_paciente="+selecionado);
        try {
            this.conex.rs.next();
            modPesq.setIdPaciente(this.conex.rs.getInt("id_paciente"));
            modPesq.setNome(this.conex.rs.getString("pac_nome"));
            modPesq.setNascimento(this.conex.rs.getString("pac_nascimento"));
            modPesq.setMae(this.conex.rs.getString("pac_mae"));
            modPesq.setPai(this.conex.rs.getString("pac_pai"));
            modPesq.setSexo(this.conex.rs.getString("pac_sexo"));
            modPesq.setCpf(this.conex.rs.getString("pac_cpf"));
            modPesq.setCns(this.conex.rs.getInt("pac_cns"));
            modPesq.setRg(this.conex.rs.getString("pac_rg"));
            modPesq.setTelefone(this.conex.rs.getString("pac_tel"));
            modPesq.setCelular(this.conex.rs.getString("pac_cel"));
            modPesq.setContato(this.conex.rs.getString("pac_contato"));
            modPesq.setEmail(this.conex.rs.getString("pac_email"));
            modPesq.setCep(this.conex.rs.getString("pac_cep"));
            modPesq.setIbge(this.conex.rs.getInt("pac_ibge"));
            modPesq.setEndereco(this.conex.rs.getString("pac_endereco"));
            modPesq.setNumero(this.conex.rs.getString("pac_numero"));
            modPesq.setComplemento(this.conex.rs.getString("pac_complemento"));
            modPesq.setBairro(this.conex.rs.getString("pac_bairro"));
            modPesq.setCidade(this.conex.rs.getString("pac_cidade"));
            modPesq.setUf(this.conex.rs.getString("pac_uf"));
            modPesq.setStatus(this.conex.rs.getInt("pac_status"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao recuperar dados do pacientes: "+ex,"Erro",JOptionPane.ERROR_MESSAGE);
        }
        conex.desconecta();
        return modPesq;
    }    
}
