package Nivel_Intermediario.Desafio5_BancoKonoha;

public class Main {
    public static void main(String[] args) {

        // Conta corrente
        ContaCorrente contaCorrente = new ContaCorrente(100);
        contaCorrente.depositar(200);
        contaCorrente.consultarSaldo();

        // Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(1200);
        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();











    }



}
