package Listas.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeItens;

    public CarrinhoDeCompras(){
        this.listaDeItens = new ArrayList<>();
    }

    //métodos específicos
    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeItens.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> removerItens = new ArrayList<>();
        for (Item i : listaDeItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                removerItens.add(i);
            }

        }
        listaDeItens.removeAll(removerItens);
    }
    public double calcularValorTotal() {
        double total = 0.0;
        if (!listaDeItens.isEmpty()) {
            for (Item j : listaDeItens) {
                double valorItem = j.getPreco() * j.getQuantidade();
                total += valorItem;
                //return total;

            }
        }


        return total;
    }
    public void exibirItens(){
    if(!listaDeItens.isEmpty()){
        System.out.println("tamanho da lista: "+listaDeItens.size());
        System.out.println(listaDeItens);
    }else{
        System.out.println("Lista vazia");
    }

    }














}
