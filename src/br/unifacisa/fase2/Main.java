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

        boolean houveTroca;
        int tamanho = bag.itemList.size();

        for (int i = 0; i < tamanho - 1; i++) {
            houveTroca = false;
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (bag.itemList.get(j).value > bag.itemList.get(j + 1).value) {
                    Item temp = bag.itemList.get(j);
                    bag.itemList.set(j, bag.itemList.get(j + 1));
                    bag.itemList.set(j + 1, temp);
                    houveTroca = true;
                }
            }
            if (!houveTroca) {
                break;
            }
        }

        System.out.println("Mochila após ordenar por valor:");
        System.out.println(bag);
    }
}