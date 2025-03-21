package Map.Basicos;

public class MainBasicos {
    public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();
    agenda.adicionarContato("Lucas",120003);
    agenda.adicionarContato("Adriana",130002);
    agenda.adicionarContato("Karina",110001);
    agenda.adicionarContato("Irineu",110221);
    agenda.exibirContatos();
    System.out.println(agenda.pesquisarPorNome("Adriana"));
    agenda.remocerContato("Karina");
    agenda.exibirContatos();

    }
}
