package br.unifacisa.fase2.entity;

public class Item {
    public double value;
    public double weight;

    public Item(double value, double weight) {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }
}
