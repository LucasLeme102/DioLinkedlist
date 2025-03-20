package SET.Basicos;

public class MainBasicos {
    public static void main(String[] args) {
        ConjuntoConvidados convidado1 = new ConjuntoConvidados();
        convidado1.adicionarConvidado("Lucas",001);
        convidado1.adicionarConvidado("Adriana",002);
        convidado1.adicionarConvidado("Lucas",003);
        convidado1.adicionarConvidado("Irineu",003);
        System.out.println(convidado1.contarConvidados());
        convidado1.exibirConvidados();

        convidado1.removerConvidadoPorCodigo(003);
        System.out.println(convidado1.contarConvidados());
        convidado1.exibirConvidados();












    }
}
