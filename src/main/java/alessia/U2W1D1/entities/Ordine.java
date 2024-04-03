package alessia.U2W1D1.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;


import java.time.LocalDate;

@Getter
@Setter
public class Ordine {
    private Menu menu;
    @Setter(AccessLevel.NONE)
    private int id;
    private StatoDellOrdine statoDellOrdine;
    private int numeroDeiCoperti;
    private int coperto;
    private LocalDate oraDellOrdine;
    private double costoDellOrdine;

    public Ordine() {
    }


    public Ordine(Menu menu, StatoDellOrdine statoDellOrdine, int numeroDeiCoperti, int coperto, LocalDate oraDellOrdine, double costoDellOrdine) {

        this.menu = menu;
        this.statoDellOrdine = statoDellOrdine;
        this.numeroDeiCoperti = numeroDeiCoperti;
        this.coperto = coperto;
        this.oraDellOrdine = LocalDate.now();
        this.costoDellOrdine = costoDellOrdine;


    }


    @Override
    public String toString() {
        return "Ordine{" +
                "menu=" + menu +
                ", id=" + id +
                ", statoDellOrdine=" + statoDellOrdine +
                ", numeroDeiCoperti=" + numeroDeiCoperti +
                ", coperto=" + coperto +
                ", oraDellOrdine=" + oraDellOrdine +
                ", costoDellOrdine=" + costoDellOrdine +
                '}';
    }
}
