package br.unifacisa.fase2.entity;

import java.util.ArrayList;
import java.util.List;

/** @author Gigliarly */
public class Bag {
    public double capacity;
    public List<Item> itemList;

    /** capacity da bag colocando o maximo (50 capacidade maxima) */
    /** itemList: o que está dentro da mochila */
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
        		"valor guardado" + calculateItemValue() +
                "capacity=" + capacity +
                " itemList{" + itemList +
                "}";

        return msg;
    }
}
