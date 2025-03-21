package Map.pesquisa;

public class MainPesquisa {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L,"Produto1",2,23.0);

        estoqueProdutos.adicionarProduto(2L,"Produto3",5,3000.0);
        estoqueProdutos.adicionarProduto(5L,"Produto4",5,43.0);
        estoqueProdutos.adicionarProduto(23L,"PRoduto teste",5,45.0);

        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.calcularEstoque());
        System.out.println(estoqueProdutos.obterProduto());


    }
}
