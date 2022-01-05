package com.bogdan.flota.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class EDX extends AbstractEntity {

    @OneToOne
    private Banat banat;

    @OneToOne
    private Dobrogea dobrogea;

    @OneToOne
    private Muntenia muntenia;

    public Banat getBanat() {
        return banat;
    }

    public void setBanat(Banat banat) {
        this.banat = banat;
    }

    public Dobrogea getDobrogea() {
        return dobrogea;
    }

    public void setDobrogea(Dobrogea dobrogea) {
        this.dobrogea = dobrogea;
    }

    public Muntenia getMuntenia() {
        return muntenia;
    }

    public void setMuntenia(Muntenia muntenia) {
        this.muntenia = muntenia;
    }
}
