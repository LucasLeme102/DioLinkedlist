package Map.ordenacao;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;
    public AgendaEventos() {this.eventoMap = new HashMap<>();}
    public void adicionareventos(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoMap1 = new TreeMap<>(eventoMap);
        System.out.println(eventoMap1);

    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoMap1 = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoMap1.entrySet()){
            if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)){
                System.out.println("o proximo evento: "+ entry.getValue()+"Acontecerar na data:"+entry.getKey());
                break;
            }
        }

    }


}
