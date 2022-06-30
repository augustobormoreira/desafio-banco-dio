public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato: " + saldo);
    }

    public void imprimirInfo(){
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Dono: " + this.cliente.getNome());
        System.out.println("Numero conta: " + this.numero);
        this.imprimirExtrato();
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }


    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
}