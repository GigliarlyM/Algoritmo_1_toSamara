package br.unifacisa.fase2.entity;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    public int capacity;
    public List<Item> itemList;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    // Calcula capacidade restante
    public int calculateRemainingCapacity() {
        return capacity - calculateItemWeight();
    }

    public int calculateItemWeight() {
        int weight = 0;
        for (Item item : itemList) {
            weight += item.weight;
        }
        return weight;
    }

    public int calculateItemValue() {
        int value = 0;
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
