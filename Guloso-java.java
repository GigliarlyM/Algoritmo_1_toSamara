import java.util.Arrays;
import java.util.Comparator;

class Item {
    double peso;
    double valor;

    public Item(double peso, double valor) {
        this.peso = peso;
        this.valor = valor;
    }
}

public class MochilaFracionaria {

    public static double mochilaGulosa(Item[] itens, double capacidade) {
        Arrays.sort(itens, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double v1 = o1.valor / o1.peso;
                double v2 = o2.valor / o2.peso;
                return Double.compare(v2, v1);
            }
        });

        double valorTotal = 0.0;

        for (Item item : itens) {
            if (capacidade > 0 && item.peso <= capacidade) {
                capacidade -= item.peso;
                valorTotal += item.valor;
            } else {
                valorTotal += item.valor * (capacidade / item.peso);
                capacidade = 0;
                break;
            }
        }

        return valorTotal;
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