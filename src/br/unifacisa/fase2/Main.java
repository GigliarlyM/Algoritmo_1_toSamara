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


        System.out.println(bag.toString());

        // Ordenação usando BubbleSort
        boolean houveTroca;
        int tamanho = itemList.size();

        for (int i = 0; i < tamanho - 1; i++) {
            houveTroca = false;
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (itemList.get(j).value > itemList.get(j + 1).value) {
                    Item temp = itemList.get(j);
                    itemList.set(j, itemList.get(j + 1));
                    itemList.set(j + 1, temp);
                    houveTroca = true;
                }
            }
            if (!houveTroca) {
                break;
            }
        }

        System.out.println("Após ordenar por valor:");
        System.out.println(itemList);
        System.out.println();

        for (Item item : itemList) {
            if (bag.capacity > 0 && item.weight >= bag.capacity) {
                bag.capacity -= item.weight;

                System.out.println(bag.toString());

                bag.itemList.add(item);
            } else if (bag.capacity > 0){
                double percent = ( bag.capacity / item.weight);
                double newValue = item.value * percent;

                Item newItem = new Item(newValue, bag.capacity);

                bag.itemList.add(newItem);

                bag.capacity = 0;
            }
        }

        System.out.println("Valor total: "
                        + bag.calculateItemValue()
                        + "Itens que estão na bolsa:"
                );
        System.out.println(bag.toString());

    }
}