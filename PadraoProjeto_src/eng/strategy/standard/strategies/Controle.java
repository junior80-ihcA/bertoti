package eng.strategy.standard.strategies;
import java.util.Scanner;

public class Controle 
{
 public Scanner scanner;	
 public Controle() 
 {
  scanner = new Scanner(System.in);	  
 }	
 public int opcao() 
 {
  int op = scanner.nextInt();
  return op;
 }	
 public String texto()
 {
  String t = scanner.nextLine();
  return t;
 } 
 @Override//metodo especial que executa antes de ser destruido
 protected void finalize() throws Throwable 
 {
  scanner.close();		
 }	
}