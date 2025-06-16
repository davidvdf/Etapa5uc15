
package conecçãojavacomsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
public static Connection conectar() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/suporte_tech";
            String usuario = "root";
            String senha = "@David12345";
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
        return conn;
    }
}
