package salvoamplo.esercizi.entities;

import java.time.LocalTime;
import java.util.List;

public class Ordine {

    private int numeroOrdine;
    private Tavolo tavolo;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private List<MenuItem> elementi;
    private double costoCoperto;

    public Ordine(int numeroOrdine, Tavolo tavolo, int numeroCoperti,
                  List<MenuItem> elementi, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.numeroCoperti = numeroCoperti;
        this.elementi = elementi;
        this.costoCoperto = costoCoperto;
        this.stato = StatoOrdine.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        tavolo.setOccupato(true);
    }

    public double getTotale() {
        double totaleElementi = elementi.stream()
                .mapToDouble(MenuItem::getPrezzo)
                .sum();

        return totaleElementi + (numeroCoperti * costoCoperto);
    }

    @Override
    public String toString() {
        return "Ordine #" + numeroOrdine +
                "\nTavolo: " + tavolo.getNumero() +
                "\nCoperti: " + numeroCoperti +
                "\nStato: " + stato +
                "\nOra: " + oraAcquisizione +
                "\nTotale: " + getTotale() + "€";
    }
}
