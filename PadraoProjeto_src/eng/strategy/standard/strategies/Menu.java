package eng.strategy.standard.strategies;

public class Menu 
{
 public void inicio()
 {
  System.out.println("\t\t\t\tBem - vindo ao Sistema de Gerenciamento de Dados");
 }
 public void menu() 
 {	 
  System.out.println("\t\t######################################################################");		
  System.out.println("\t\t#\t1 - Inserir dados.                                           #");
  System.out.println("\t\t#\t2 - Lista dos dados em ordem alfabética.                     #");  
  System.out.println("\t\t#\t3 - Sair                                                     #");
  System.out.println("\t\t######################################################################");
  System.out.println("\n\t\t\tDigite a opção:");
 }	
}