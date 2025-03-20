package SET.Pesquisa;

public class MainPesquisa {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionarContatos("Lucas",1234);
        contatos.adicionarContatos("adriana",1235);
        contatos.adicionarContatos("Lucas",1234);
        contatos.exibirContatos();

        System.out.println("Contato atualizado: "+ contatos.atualizarNumeroDeContato("Lucas",1236));
        contatos.exibirContatos();
        System.out.println(contatos.pesquisarPorNome("Lucas"));
        contatos.exibirContatos();

    }
}
