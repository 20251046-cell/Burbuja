package com.uthh.edd.burbuja;


public class Burbuja {

    // Burbuja normal
    public static void ordenamientoBurbuja(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            for (int j = 0; j < arreglo.length - 1; j++)  {

                if (arreglo[j] > arreglo[j + 1]) {

                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;

                }
            }
        }
    }

    // Burbuja mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {

        for (int i = 0; i < arreglo.length - 1; i++) {

            boolean cambio = false;

            for (int j = 0; j < arreglo.length - 1 - i; j++) {

                if (arreglo[j] > arreglo[j + 1]) {

                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;

                    cambio = true;
                }
            }

            if (cambio == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] desordenado1 = {5, 2, 8, 1, 9, 3};
        int[] desordenado2 = desordenado1.clone();

        System.out.println("Arreglo original:");
        int[] numeros = null;

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        ordenamientoBurbujaMejorado(numeros);

        System.out.println("\nArreglo ordenado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
