package br.senai.sp.jandira.renato.banco.model;

public class Agencia {
   private String numero;
   private String endereco;
   private String gerente;

   public String getNumero(){
       return numero;
   }
   public void setNumero(String numero){
       this.numero = numero;
   }
   public String getEndereco(){
       return endereco;
   }
   public void setEndereco(String endereco){
       this.endereco = endereco;
   }
   public String getGerente(){
       return gerente;
   }
   public void setGerente(String gerente){
       this.gerente = gerente;
   }

}
