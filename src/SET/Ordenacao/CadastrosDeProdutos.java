package SET.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastrosDeProdutos {
    private Set<Produto> produtoSet;

    public CadastrosDeProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void exibirCadastro(){
        System.out.println(produtoSet);
    }
    public void adicionarProduto(long codigo, String nome,double preco,int quantidade){
        produtoSet.add(new Produto(nome,codigo,preco,quantidade));

    }
    public Set<Produto> exibirProdutosPornome(){
        Set<Produto> exibirNomes = new TreeSet<>(produtoSet);
        return exibirNomes;

    }
    public Set<Produto> exibirProdutosPrecos(){
        Set<Produto> produtosPorpreco = new TreeSet<>(new ComparatorPrecos());
       produtosPorpreco.addAll(produtoSet);
        return produtosPorpreco;
    }


}
