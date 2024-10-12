package mx.unam.fi.poo.g1.p8;

import mx.unam.fi.poo.g1.p8.*;

/**
 * Clase QuickSort con la interfaz Ordenamiento.
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class QuickSort implements Ordenamiento {
  /**
   * Metodo intercambia
   * @param A -> el arreglo en el cual se intercambiaran los elementos
   * @param x -> indice del primer elemento a intercambiar
   * @param y -> indice del segundo elemento a intercambiar
  **/
  private static void intercambia(int[] A, int x, int y) {
    int tmp = A[x];
    A[x] = A[y];
    A[y] = tmp;
  }

  /**
   * Metodo particionar
   * @param A -> el arreglo que sera particionado
   * @param p -> indice del primer elemento del subarreglo
   * @param r -> indice del ultimo elemento del subarreglo (pivote)
   * @return el indice del pivote despues de la particion
  **/
  private static int particionar(int[] A, int p, int r) {
    int x = A[r];  
    int i = p - 1;

    for (int j = p; j < r; j++) {
      if (A[j] <= x) {
        i++;
        intercambia(A, i, j);
      }
    }

    intercambia(A, i + 1, r);
    return i + 1;
  }
    
  /**
   * Metodo quickSortAplicado
   * @param A -> el arreglo que sera ordenado
   * @param p -> indice del primer elemento del subarreglo
   * @param r -> indice del último elemento del subarreglo
  **/
  private static void quickSortAplicado(int[] A, int p, int r) {
    if (p < r) {
      int q = particionar(A, p, r);
      quickSortAplicado(A, p, q - 1);
      quickSortAplicado(A, q + 1, r);
    }
  }

  /**
   * Metodo ordenar 
   * @param arr -> el arreglo que sera ordenado usando el algoritmo QuickSort
  **/
  public void ordenar(int[] arr) {
    if (arr != null && arr.length > 0) {
      quickSortAplicado(arr, 0, arr.length - 1);
    }
  }
}
