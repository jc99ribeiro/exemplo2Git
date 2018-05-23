package controledecliente;

import BancoDeDados.DaoCliente;
import BancoDeDados.SingletonConexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControleDeCliente {

    public static void main(String[] args){
        
        try {
            
            DaoCliente daoCliente = new DaoCliente();
           daoCliente.adicionar("Daniel",555555,"Rua XD , Bairro AD, N º 55 ",'M');//inserindo dados
            
        //    DaoCliente daoCliente = new DaoCliente();
//            ResultSet lista = daoCliente.listar();//listando os dados
//            while(lista.next()){
//                System.out.println(lista.getString("nome"));
//                System.out.println(lista.getLong("cpf"));
//                System.out.println(lista.getString("endereco"));
//                System.out.println(lista.getString("sexo"));
//            }  
        //  daoCliente.atualizar("Adr",505050,"Rua 120, bairro x ",'M');//Atualizando Dados Update
         // daoCliente.excluir("Carlos");
//            Connection c = SingletonConexao.getConexao();
//            System.out.println(c);
//            c = SingletonConexao.getConexao();
//            System.out.println(c);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
