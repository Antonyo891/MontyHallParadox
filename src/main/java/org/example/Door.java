package org.example;

public class Door {
    private final Integer NUMBER;
    private Prize prize;

    public Door(Integer number, Prize prize) {
        this.NUMBER = number;
        this.prize = prize;
    }

    public Door(Integer number) {
        this(number,Prize.GOAT);
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }

    public Integer getNUMBER() {
        return NUMBER;
    }

    public Prize getPrize() {
        return prize;
    }

    @Override
    public String toString() {
        return "Door{" +
                "NUMBER=" + NUMBER +
                ", prize=" + prize +
                '}';
    }
}
