package mx.unam.fi.poo.g1.p8;

import mx.unam.fi.poo.g1.p8.*;

/**
 * Clase Practica81
 * @author Axel Cote
 * @version Octubre-2024
**/

public class Practica81 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/
  public static void main(String[] args) {
    int[] arr1 = {4, 2, 0, 3, 1, 6, 8, 12, 23, 11};
    int[] arr2 = {5, 14, 6, 12, 7, 9, 2, 23, 11, 3};

    Ordenamiento ordenamiento;

    System.out.println("Arreglo 1: [4, 2, 0, 3, 1, 6, 8, 12, 23, 11]");
    ordenamiento = new QuickSort();
    ordenamiento.ordenar(arr1);
    System.out.println("Arreglo ordenado:");
    imprime(arr1);

    System.out.println("Arreglo 2: [5, 14, 6, 12, 7, 9, 2, 23, 11, 3]" );
    ordenamiento = new MergeSort();
    ordenamiento.ordenar(arr2);
    System.out.println("Arreglo ordenado:");
    imprime(arr2);
  }

  /**
   * Metodo imprime
   * Imprime en pantalla cada elemento de un arreglo dado
  **/
  public static void imprime(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
      System.out.println();
  }
}
