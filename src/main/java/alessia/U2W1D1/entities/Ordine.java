package alessia.U2W1D1.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Ordine {
    @Setter(AccessLevel.NONE)
    private int id;
    private StatoDellOrdine statoDellOrdine;
    private int numeroDeiCoperti;
    private int coperto;
    private LocalDate oraDellOrdine;
    private double costoDellOrdine;
    private List<IMenu> ordinazione;
    private Tavolo tavolo;

    public Ordine() {
    }

    public Ordine(StatoDellOrdine statoDellOrdine, int numeroDeiCoperti, int coperto, LocalDate oraDellOrdine, double costoDellOrdine, List<IMenu> ordinazione, Tavolo tavolo) {
        this.statoDellOrdine = statoDellOrdine;
        this.numeroDeiCoperti = numeroDeiCoperti;
        this.coperto = coperto;
        this.oraDellOrdine = oraDellOrdine;
        this.costoDellOrdine = costoDellOrdine;
        this.ordinazione = ordinazione;
        this.tavolo = tavolo;
    }

    public void aggiungiAllOrdinazione(IMenu IMenu) {
        this.ordinazione.add(IMenu);
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", statoDellOrdine=" + statoDellOrdine +
                ", numeroDeiCoperti=" + numeroDeiCoperti +
                ", coperto=" + coperto +
                ", oraDellOrdine=" + oraDellOrdine +
                ", costoDellOrdine=" + costoDellOrdine +
                ", ordinazione=" + ordinazione +
                ", tavolo=" + tavolo +
                '}';
    }
}
