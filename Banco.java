import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        contas = new ArrayList<Conta>();
    }

    public void addConta(Conta contaQueSeraAdicionada){
        this.contas.add(contaQueSeraAdicionada);
    }

    public void listarClientes(){
        if(contas.isEmpty()){
            System.out.println("O banco " + this.nome + " não possui nenhum cliente.");
        }else{
           for(Conta conta: contas){
                System.out.println(conta.getCliente().getNome());
           }
        }
    }
}
