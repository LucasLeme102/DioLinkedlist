package Map.ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class MainOrdenacao {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionareventos(LocalDate.of(2025, Month.JULY,15), "Evento1", "Atracao1");
        agendaEventos.adicionareventos(LocalDate.of(2025, Month.MARCH,10), "Evento2", "Atracao2");
        agendaEventos.adicionareventos(LocalDate.of(2025, Month.MAY,12), "Evento3", "Atracao3");
        agendaEventos.adicionareventos(LocalDate.of(2025, Month.MARCH,22), "Evento3", "Atracao3");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
