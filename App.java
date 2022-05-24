package eng.strategy.standard.strategies;

import java.io.IOException;

public class App 
{
 public static void main(String[] args) throws IOException 
 {
  //tipo da class,variável para armazenar o objeto
  
  Menu wb = new Menu();  
  ClienteComum cl = new ClienteComum(); 
  ClientePreferencial pf = new ClientePreferencial();
  wb.inicio();
  int opcao = 100;
  while(opcao!=0)
       {
        wb.menu();
        Controle ctrl = new Controle();
        opcao = ctrl.opcao();
        if(opcao == 1) {cl.inserir();}                
        if(opcao == 2) {cl.listarContatosOrdemAlfabetica();}     
        if(opcao == 3) {opcao = 1;break;}	
       
        wb.menu();
        Controle ctrl1 = new Controle();
        opcao = ctrl1.opcao();
        if(opcao == 1) {pf.inserir();}                
        if(opcao == 2) {pf.listarContatosOrdemAlfabetica();}	              
        if(opcao == 3) {opcao = 1;break;}	
       }
 }
}