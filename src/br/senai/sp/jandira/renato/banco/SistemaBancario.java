package br.senai.sp.jandira.renato.banco;
import br.senai.sp.jandira.renato.banco.model.Agencia;
import br.senai.sp.jandira.renato.banco.model.Cliente;
import br.senai.sp.jandira.renato.banco.model.Conta;
import br.senai.sp.jandira.renato.banco.model.TipoConta;

public class SistemaBancario {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente();
        Conta   conta01 = new Conta();
        Agencia agencia01 = new Agencia();

        agencia01.setNumero("11111111");
        agencia01.setEndereco("Av brasil, 500 - jandira/sp");
        agencia01.setGerente("Silvio santos");

        cliente01.setNome("Renato");
        cliente01.setTelefone("(11) 97854-5555");
        cliente01.setCpf("111.1111.111-11");

        conta01.setCliente(cliente01);
        conta01.setAgencia(agencia01);

        conta01.setTipoConta(TipoConta.CORRENTE);

        //Sacar 100 da conta01

        conta01.Sacar(100);

        //Mostrar saldo da conta01
        System.out.println(conta01.getSaldo());

        //Depositar 200 reais na conta

        conta01.Depositar(-50);

        //Mostra o saldo na conta01

        System.out.println(conta01.getSaldo());
    }
}
