public class Main {
    public static void main(String [] args){
        Banco meuBanco = new Banco("Banco SulAmericano");
        Cliente john = new Cliente("John");
        Cliente james = new Cliente("James");

        Conta cc = new CCorrente(john);
        Conta cp = new CPoupanca(james);

        meuBanco.addConta(cc);
        meuBanco.addConta(cp);

        cc.depositar(200);
        cp.depositar(500);

        cp.transferir(200, cc);

        cc.imprimirInfo();
        cp.imprimirInfo();

        meuBanco.listarClientes();
    }
}
