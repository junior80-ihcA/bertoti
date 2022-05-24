package eng.strategy.standard.strategies;

public class Contato 
{
 protected String nome; //protected sobre herança  //private
 public String ddd;
 public String numero;
 public String data;
 public String mes;
 public String ano;
 public String genero;	
 
 public int compareTo(Contato o) 
 {
  return nome.compareTo(o.nome);
 }
 public Contato(String texto) 
 {
  nome = texto;
  ddd = texto;
  numero = texto;
  data = texto;
  mes = texto;
  ano = texto;
  genero = texto;  
 }	
 public String getNome() 
 {
  return nome;			
 }		
 public void setNome(String nome) 
 {
  this.nome = nome;			
 } 
 public String getDDD()
 {
  return ddd; 
 } 
 public void setDDD(String ddd)
 {
  this.ddd = ddd;	 
 } 
 public String getNumero()
 {
  return numero; 
 } 
 public void setNumero(String numero)
 {
  this.numero = numero;	 
 } 
 public String getData()
 {
  return data; 
 } 
 public void setData(String data)
 {
  this.data = data;	 
 } 
 public String getMes()
 {
  return mes; 
 } 
 public void setMes(String mes)
 {
  this.mes = mes;	 
 } 
 public String getAno()
 {
  return ano;	 
 }
 public void setAno(String ano)
 {
  this.ano = ano;	 
 } 
 public String getGenero()
 {
  return genero;	 
 }
 public void setGenero(String genero)
 {
  this.genero = genero;	 
 } 	
}