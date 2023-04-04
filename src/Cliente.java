public class Cliente {
    String nome;
    double saldoConta;

    public Cliente(String nome, double saldoConta) {
        this.nome = nome;
        this.saldoConta = saldoConta;
    }

    public void depositar(double valorDep) {
        saldoConta = saldoConta + valorDep;
    }

    public void retirar(double valorRet) {
        if (saldoConta > valorRet) {
            saldoConta = saldoConta - valorRet;
        }
    }

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.saldoConta);
    }
}
