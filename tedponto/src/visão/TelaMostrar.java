/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;
import javax.swing.JOptionPane;
import modelo.Proprietario;
import modelo.Carro;
import modelo.Endereco;

/**
 *
 * @author ForgeT
 */
public class TelaMostrar {
    public static void main(String []args){
      Carro carro1 = new Carro("Siena","Branco",2006,"FIAT",10111012,"João",135,125,4,false,5,false,25); 
      
      carro1.acelerar();
      carro1.freiar();
      carro1.trocaMarchar();
      carro1.marchaRe();
      carro1.mostrarCoisa();
      carro1.getProprietario();
        System.out.println("-----");
      Proprietario p1 = new Proprietario();
      
      String nome = JOptionPane.showInputDialog("Informe seu nome: ");
      p1.setNome(nome);
      String cpf = JOptionPane.showInputDialog(null,"Informe seu CPF: ");
      p1.setCPF(cpf);
      String rg = JOptionPane.showInputDialog(null,"Informe seu RG");
      p1.setRg(rg);
      //JOptionPane.showInputDialog("Seus dados: "+" Nome: "+p1.getNome()+" CPF: "+p1.getCPF()+" RG: "+p1.getRg());
      p1.mostrarProprietario();
      System.out.println("-----");
      
      Endereco e1 = new Endereco();
      
      String rua = JOptionPane.showInputDialog("Informe a Rua: ");
      e1.setRua(rua);
      
      String bai = JOptionPane.showInputDialog("Informe o Bairro: ");
      e1.setBairro(bai);
      
      
      String cid = JOptionPane.showInputDialog("Informe sua cidade: ");
      e1.setCidade(cid);
      
      String est = JOptionPane.showInputDialog("Informe seu Estado: ");
      e1.setEstado(est);
      

      String cepp = JOptionPane.showInputDialog("Informe seu CEP: ");
      e1.setCep(cepp);
      
      String compl = JOptionPane.showInputDialog("Informe complemento: ");
      e1.setComplemento(compl);
      
      
      e1.mostrarEndereco();
      
      
      
      
      
      
        
    
    
    }
    
    
    
    
}
