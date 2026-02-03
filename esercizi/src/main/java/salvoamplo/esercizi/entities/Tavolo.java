package salvoamplo.esercizi.entities;

public class Tavolo {

    private int numero;
    private int copertiMassimi;
    private boolean occupato;

    public Tavolo(int numero, int copertiMassimi) {
        this.numero = numero;
        this.copertiMassimi = copertiMassimi;
        this.occupato = false;
    }

    public int getNumero() {
        return numero;
    }

    public int getCopertiMassimi() {
        return copertiMassimi;
    }

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }
}
