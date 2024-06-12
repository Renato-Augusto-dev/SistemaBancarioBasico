package br.senai.sp.jandira.renato.banco.model;

public class Conta {
    private String numero;
    private double saldo;
    private Agencia agencia;
    private Cliente cliente;
    private TipoConta tipoConta;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void Sacar(double valor){
        if(saldo > valor ){
            System.out.println("Saque realizado com sucesso");
            saldo = saldo - valor;
        }else {
            System.out.println("Não é possivel sacar");
        }

    }
    public void Depositar(double valor){
        if(valor > 0){
            System.out.println("Deposito realizado com sucesso");
            saldo = saldo + valor;
        }else {
            System.out.println("Não é possivel depositar");
        }
    }

    public void Tranferir(){

    }

}
