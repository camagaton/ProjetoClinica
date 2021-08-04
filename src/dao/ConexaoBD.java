
package dao;
// @author Clayton A. Magaton
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.sqlite.JDBC";
    private String caminho = "jdbc:sqlite:bd/pjtClinica.db";
    public Connection con;
//função para conexao com o banco de dados;
    public void conexao(){
        try {
            Class.forName("org.sqlite.JDBC");
            this.con = DriverManager.getConnection(caminho);
            //JOptionPane.showMessageDialog(null, "conectou");
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "falhou "+ex.getMessage());
        }
    }
    
    public void executeSQL(String sql){
        try {
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falhou "+ex.getMessage());
        }
    }
// função para desconecta o banco de dados;
    public void desconecta(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "desconcentou");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "falha"+ex.getMessage());
        }
    }
}
