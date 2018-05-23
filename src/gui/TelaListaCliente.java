
package gui;

import java.awt.BorderLayout;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class TelaListaCliente extends JFrame{
    
    public static void main(String[] args) {
     String colunas [] = {"Nome","CPF"};
     String valores[][]={//matris de string
         {"Carlos","1 "},
         {"Adriano","2"},
         {"Daniel","3"},
         {"José","4"},
         {"Pestana","5"},
         {"Jacozino","6"}
     };
     TelaListaCliente tela = new TelaListaCliente();
     tela.setVisible(true);//deixar a tela visivel
     tela.setSize(500,500);//TAMANHO DA TELA EM PX
     JTable tabela = new JTable(valores,colunas);
     JPanel painel = new JPanel();
     painel.add(tabela.getTableHeader(),BorderLayout.PAGE_START);//cabeçalho
     painel.setLayout(new BorderLayout());//LAYOUT DA TABELA
     painel.add(tabela,BorderLayout.CENTER);//PAINEL NO CENTRO
     tela.setContentPane(painel);//
//     JScrollPane scroll = new JScrollPane();
     tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//AO FECHAR A TELA FEHAR O PROGRAMA
     
     
    }
    
    
}
