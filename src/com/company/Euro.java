package com.company;

/**
 * Created by lperez on 1/29/15.
 */
public class Euro {

    private int amount;


    public Euro(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Euro)) {
            return false;
        }
        Euro euro = (Euro) obj;
        if (obj != null && this.amount == euro.amount) {
            return true;
        }
        return false;
    }

    public Euro add(Euro euro) {
        return new Euro(this.amount + euro.amount);
    }
}
