package Nivel_Intermediario.Desafio5_BancoKonoha;

public abstract class ContaBancaria implements Conta{

    // declarando atributos
    double saldo;

    // Construtor que recebe o saldo
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

     // Construtor que recebe saldo
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void consultarSaldo(){
        if (saldo > 0){
            System.out.println("O Saldo disponível é: " + saldo);
        }else {
            System.out.println("Saldo inserido é negativo. Inválido");
        }
    }
}
