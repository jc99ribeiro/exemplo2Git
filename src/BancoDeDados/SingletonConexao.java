
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SingletonConexao {
    private static Connection conexao=null;
    public static Connection getConexao() throws SQLException{
        if (conexao == null){  //
        String url= "jdbc:mysql://localhost:3306/empresa?user=root";
        conexao = DriverManager.getConnection(url);
        }
        return conexao;
    }
        
}
