package Nivel_Intermediario.Desafio5_BancoKonoha;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo){
        super(saldo); //chamada ao construtor da classe pai
    }

    @Override
    public void consultarSaldo(){
        super.consultarSaldo(); // Chama o metodo da classe pai
    }

    @Override
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Foi adicionado o valor de: " + valor + ", e o saldo atual da conta corrente agora é: " + saldo);
        } else {
            System.out.println("Valor para saldo indisponível");
        }
    }
}
