package Listas.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }
    public void adicionarPessoas(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);


        return pessoasIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasAltura,new ComparatorAltura());
        return pessoasAltura;
    }
}
