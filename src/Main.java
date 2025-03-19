import Listas.operacoesBasicas.CarrinhoDeCompras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Banana",2.99, 5);
        carrinho.adicionarItem("Pão",1.20,9 );
        carrinho.adicionarItem("macarrao",5.99, 2);
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
        carrinho.removerItem("Banana");
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());

    }
}