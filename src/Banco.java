public class Banco {
    public static void main(String[] args) {
        Cliente jandira = new Cliente("Jandira Silva",2500.00);
        Cliente sandra = new Cliente("Sandra Rodriguez",1800.00);
        Cliente luciana = new Cliente("Luciana Teixeira",5000.00);

        jandira.imprimirDados();
        sandra.imprimirDados();
        luciana.imprimirDados();

        jandira.retirar(1000);
        jandira.imprimirDados();
        sandra.retirar(2000);
        sandra.depositar(500);
        sandra.imprimirDados();
        sandra.retirar(2000);
        sandra.imprimirDados();
        luciana.depositar(1000);
        luciana.imprimirDados();


    }
}
