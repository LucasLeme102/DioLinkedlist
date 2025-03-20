package SET.Ordenacao;

public class mainOrdenacao {
    public static void main(String[] args) {
        CadastrosDeProdutos cadastro = new CadastrosDeProdutos();
        cadastro.adicionarProduto(1l,"Prego", 0.50,10);
        cadastro.adicionarProduto(2l,"tabua", 10.50,5);
        cadastro.adicionarProduto(3l,"chave", 10.50,2);
        cadastro.adicionarProduto(4l,"Parafuso", 1.00,100);
        cadastro.adicionarProduto(5l,"martelo", 20.50,1);
        cadastro.adicionarProduto(6l,"telha", 2.99,1000);
        cadastro.exibirCadastro();
        //System.out.println(cadastro.exibirProdutosPornome());
        System.out.println(cadastro.exibirProdutosPrecos());

    }

}
