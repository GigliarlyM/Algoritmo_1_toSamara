package br.unifacisa.fase2.entity;

/** @author Gigliarly */
public class Item {
    public double value;
    public double weight;
    
    /** @param value: preço do item
     * @param weight: peso do item */
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
