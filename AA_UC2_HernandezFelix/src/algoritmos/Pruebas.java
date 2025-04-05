/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos;

import java.util.Arrays;

/**
 *
 * @author PC WHITE WOLF
 */
public class Pruebas {
public static void main(String[] args) {
        // Instancias
        Ordenamientos ordenar = new Ordenamientos();
        Busqueda buscar = new Busqueda();

        // Arreglo original
        int[] arreglo = {5, 2, 9, 1, 3};

        // Mostrar arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        // Prueba de ordenamiento
        ordenar.bubbleSort(arreglo);
        System.out.println("Ordenado con Bubble Sort: " + Arrays.toString(arreglo));

        // Prueba de búsqueda lineal
        int valor = 3;
        int indice = buscar.busquedaLineal(arreglo, valor);
        System.out.println("Índice de " + valor + ": " + indice);
    }
    
}
