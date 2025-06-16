
package conecçãojavacomsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usiariodao {
   
    
    public boolean autenticar(String usuario, String senha) {
        String sql = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?";
        
        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, usuario);
            ps.setString(2, senha);
            
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao autenticar: " + e.getMessage());
            return false;
        }
    }
}