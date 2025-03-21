package Map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
            estoqueMap.put(cod, new Produto(nome,preco,quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }
    public double calcularEstoque(){
        double valorTotal = 0;
        if (!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }
    public Produto obterProduto(){
        Produto produtoMaisCaro = null;

        if(!estoqueMap.isEmpty()){
            for(Produto px : estoqueMap.values()){
                double maiorPreco = Double.MIN_VALUE;
                if(px.getPreco() > maiorPreco);{
                    produtoMaisCaro = px;
                }
            }

        }
        return produtoMaisCaro;

    }
}
