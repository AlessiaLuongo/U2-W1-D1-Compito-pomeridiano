package alessia.U2W1D1.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;


@Getter
@Setter

public class Tavolo {
    @Setter(AccessLevel.NONE)
    private int id;
    private int numeroMassimoCoperti;

    private boolean statoDelTavolo;

    public Tavolo() {
    }

    public Tavolo(int numeroMassimoCoperti, boolean statoDelTavolo) {
        this.id = generateRandomId();
        this.numeroMassimoCoperti = numeroMassimoCoperti;
        this.statoDelTavolo = false;
    }


    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(20);
    }
    @Override
    public String toString() {
        return "Tavolo{" +
                "id=" + id +
                ", numeroMassimoCoperti=" + numeroMassimoCoperti +
                ", statoDelTavolo=" + statoDelTavolo +
                '}';
    }
}
