package SET.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContatos(String nome,int numero){
        contatoSet.add(new Contato(nome,numero));

    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> setPesquisaNome = new HashSet<>();
        for(Contato c :contatoSet){
            if(c.getNome().startsWith(nome)){
                setPesquisaNome.add(c);
            }
        }
        return setPesquisaNome;
    }
    public Contato atualizarNumeroDeContato(String nome,int novoNumero){
        Contato contatoAtualizado =  null;
        for(Contato c:contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
