package br.unifacisa.fase2;

public class bubblesort {
    public void bubbleSort(int[] array) {
        int tamanho = array.length;
        boolean houveTroca;
        for(int i= 0; i < tamanho - 1; i++) {
            houveTroca = false;
            for(int j = 0; j < tamanho - 1; j++) {
                // Se o elemento atual é maior que o próximo, é trocado
                if(array[j] > array[j + 1]) {
                    int temporaria = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaria;
                    houveTroca = true;
                }
            }
            // Se não houve trocas na passada, a lista já está ordenada
            if(!houveTroca) {
                break;
            }
        }
    }

    public void imprimirArray(int[] array) {
        for(int elemento : array) {
            System.out.println(elemento + " ");
        }
        System.out.println();
    }

    // Testando
    public static void main(String[] args) {
        bubblesort ordenador = new bubblesort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original:");
        ordenador.imprimirArray(array);

        ordenador.bubbleSort(array);

        System.out.println("Array ordenado:");
        ordenador.imprimirArray(array);
    }
}
