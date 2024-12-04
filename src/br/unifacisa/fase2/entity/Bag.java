package br.unifacisa.fase2.entity;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    public double capacity;
    public List<Item> itemList;

    public Bag(double capacity) {
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    public double calculateItemWeight() {
        double weight = 0;
        for (Item item : itemList) {
            weight += item.weight;
        }
        return weight;
    }

    public double calculateItemValue() {
        double value = 0;
        for (Item item: itemList) {
            value += item.value;
        }
        return value;
    }

    @Override
    public String toString() {
        String msg = "Bag{" +
                "capacity=" + capacity +
                " itemList{"
                ;

        for (Item item: itemList) {
            msg += item.toString() + ", ";
        }
        msg += "}";

        return msg;
    }
}
