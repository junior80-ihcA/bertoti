package eng.strategy.standard.strategies;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class ClienteComum implements Strategy
{
 public List<Contato> contatos = new ArrayList<Contato>();
 public void inserir() 
 {	  
  System.out.println("Entre com o nome para o contato:");
  Controle ctrl = new Controle();
  Contato c = new Contato(ctrl.texto());  
  System.out.println("Entre com o DDD para contato:");
  c.ddd = ctrl.texto();        
  System.out.println("Entre com o numero para contato:");
  c.numero = ctrl.texto();
  System.out.println("Entre com o dia de nascimento:");
  c.data = ctrl.texto();
  System.out.println("Entre com o mes de nascimento:");
  c.mes = ctrl.texto();
  System.out.println("Entre com o ano de nascimento:");
  c.ano = ctrl.texto();
  System.out.println("Entre com o genero da pessoa:");
  c.genero = ctrl.texto();
  contatos.add(c);
  System.out.println("\nCliente Comum . . .");
  System.out.println("\nContato Adicionado!");
 } 
 public void listarContatosOrdemAlfabetica() 
 { 	 
  for(Contato contato: contatos) 
     {	    
      System.out.println("Nome do cliente: " + contato.getNome());
      System.out.println("Telefone: " + contato.getDDD()+"-"+ contato.getNumero());
      System.out.println("Data de Nascimento: " + contato.getData()+"/"+contato.getMes()+"/"+contato.getAno());
      System.out.println("Genero: " + contato.getGenero());
      System.out.println("\n");     
     }
 }
}