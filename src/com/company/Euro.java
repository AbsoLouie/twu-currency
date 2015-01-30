package com.company;

public class Euro {

    private int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dollar) {
            return (this.amount * 1.35) == ((Dollar) obj).getAmount();
        } else if (obj instanceof Euro) {
            return this.amount == ((Euro) obj).amount;
        } else {
            return false;
        }
    }

    public Euro add(Euro euro) {
        return new Euro(this.amount + euro.amount);
    }
}
