package br.unifacisa.fase2;

import br.unifacisa.fase2.entity.Item;

import java.util.Arrays;
import java.util.Comparator;

public class MochilaFracionaria {

    public static double mochilaGulosa(Item[] itens, double capacidade) {
        Arrays.sort(itens, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double v1 = o1.value / o1.weight;
                double v2 = o2.value / o2.weight;
                return Double.compare(v2, v1);
            }
        });


        return capacidade;
    }

    public static void main(String[] args) {
        Item[] itens = {
            new Item(2, 40), 
            new Item(3.14, 50), 
            new Item(1.98, 100), 
            new Item(5, 95), 
            new Item(3, 30)
        };
        double capacidade = 10;

        double resultado = mochilaGulosa(itens, capacidade);
        System.out.println("Valor máximo que pode ser obtido: " + resultado);
    }
}