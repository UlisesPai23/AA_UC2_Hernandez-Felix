/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 *
 * @author PC WHITE WOLF
 */
public class Ordenamientos {
  
    
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Recorremos el arreglo varias veces
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Comparamos elementos adyacentes
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiamos si están desordenados
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) break;
        }
    }

    // Complejidad: O(n^2) en el peor caso
}
