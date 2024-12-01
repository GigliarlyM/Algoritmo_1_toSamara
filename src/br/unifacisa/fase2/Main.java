package br.unifacisa.fase2;

/* Resolver o problema da mochila de capacidade de 50KG
* */

import br.unifacisa.fase2.entity.Bag;
import br.unifacisa.fase2.entity.Item;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do codigo");

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(new Item(60, 10));
        itemList.add(new Item(20, 100));
        itemList.add(new Item(30, 120));

        Bag bag = new Bag(50);

        bag.itemList = itemList;

        System.out.println(bag.toString());
    }
}
