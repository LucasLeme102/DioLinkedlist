package Listas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));

    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }

        }
        return livrosAutor;

    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaDeIntervalos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao()<=anoFinal){
                    listaDeIntervalos.add(livro);
                }
            }



        }


        return listaDeIntervalos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro porTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro x : livroList){
                if(x.getTitulo().equalsIgnoreCase(titulo)){
                    porTitulo = x;
                    break;
                }
            }
        }
        return porTitulo;
    }
}




