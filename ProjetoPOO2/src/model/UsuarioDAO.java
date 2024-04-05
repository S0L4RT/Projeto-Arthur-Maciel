
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    public boolean autenticar(String email, String senha){
        String sql = "SELECT * from TBUSUARIO WHERE email = ? and senha = ? and ativo = true";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally{
            gerenciador.closeConnection(stmt, rs);
        }
        return false;
    }
    
    public boolean adicionarUsuario(Usuario u){
        String sql = "INSERT into TBUSUARIO (nome, email, senha, dataNasc, ativo) VALUES (?,?,?,?,?)";
        
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setDate(4, new java.sql.Date(u.getDataNasc().getTime()));
            stmt.setBoolean(5, u.isAtivo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário: " + u.getNome() + " inserido com sucesso!");
            return true;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage());
        }finally{
            gerenciador.closeConnection(stmt);
        }
        return false;
    }
}
