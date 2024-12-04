package br.unifacisa.fase2;


/* Resolver o problema da mochila de capacidade de 50KG
* */

import br.unifacisa.fase2.entity.Bag;
import br.unifacisa.fase2.entity.Item;

import java.util.ArrayList;

public class Main {
	/** @author Gigliarly */
    public static void main(String[] args) {
        System.out.println("Inicio do codigo");

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(new Item(60, 10));
        itemList.add(new Item(100, 20));
        itemList.add(new Item(120, 30));

        Bag bag = new Bag(50);


        System.out.println(bag.toString());
        
        System.out.println();

        // Ordenação usando BubbleSort
        /** @author Luiz Carlos */
        boolean houveTroca;
        int tamanho = itemList.size();

        for (int i = 0; i < tamanho - 1; i++) {
            houveTroca = false;
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (itemList.get(j).value < itemList.get(j + 1).value) {
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
        
        // Codigo da mochila gulosa
        /** @author Ademario; Lincoln
         * */
        for (Item item : itemList) {
            if (bag.capacity > 0 && item.weight <= bag.capacity) {
                bag.capacity -= item.weight;

                bag.itemList.add(item);
            } else {
                double percent = ( bag.capacity / item.weight);
                double newValue = item.value * percent;

                Item newItem = new Item(newValue, bag.capacity);

                bag.itemList.add(newItem);

                bag.capacity = 0;
            }
        }

        System.out.println("Valor total: "
                        + bag.calculateItemValue()
                        + "\nItens que estão na bolsa:\n"
                        + bag.toString()
                );

    }
}