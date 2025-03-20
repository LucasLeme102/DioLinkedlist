import Listas.Ordenacao.OrdenacaoPessoa;
import Listas.Pesquisa.CatalagoLivros;
import Listas.operacoesBasicas.CarrinhoDeCompras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenar = new OrdenacaoPessoa();
        ordenar.adicionarPessoas("Luca",21,1.72);
        ordenar.adicionarPessoas("Ka",29,1.60);
        ordenar.adicionarPessoas("Bru",21,2.00);
        ordenar.adicionarPessoas("Adriana",51,1.50);
        ordenar.adicionarPessoas("Irine",55,1.70);
        System.out.println(ordenar.getPessoaList());
        //System.out.println(ordenar.ordenadoPorIdade());
        System.out.println(ordenar.ordenarPorAltura());


    }
}