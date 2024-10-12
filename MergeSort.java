package mx.unam.fi.poo.g1.p8;

import mx.unam.fi.poo.g1.p8.*;

/**
 * Clase MergeSort con la interfaz Ordenamiento.
 * @author Axel Cote
 * @version Octubre-2024
**/

public class MergeSort implements Ordenamiento {
  /**
   * Metodo mergeSortAplicado
   * @param A -> el arreglo que sera ordenado
   * @param p -> indice del primer elemento del subarreglo
   * @param r -> indice del ultimo elemento del subarreglo
  **/
  private static void mergeSortAplicado(int[] A, int p, int r) {
    if (p < r) {
      int q = (p + r) / 2;
      mergeSortAplicado(A, p, q);
      mergeSortAplicado(A, q + 1, r);
      Mezcla(A, p, q, r);
    }
  }

  /**
   * Metodo Mezcla
   * @param A -> el arreglo que contiene los subarreglos a mezclar
   * @param p -> indice del primer elemento del primer subarreglo
   * @param q -> indice que divide los dos subarreglos
   * @param r -> indice del ultimo elemento del segundo subarreglo
  **/
  private static void Mezcla(int[] A, int p, int q, int r) {
    int[] izq = new int[q - p + 1];
    int[] der = new int[r - q];
    for (int i = 0; i < izq.length; i++) {
      izq[i] = A[p + i];
    }
    for (int j = 0; j < der.length; j++) {
      der[j] = A[q + 1 + j];
    }

    int i = 0, j = 0;
    int k = p;

    while (i < izq.length && j < der.length) {
      if (izq[i] <= der[j]) {
        A[k] = izq[i];
        i++;
      } else {
        A[k] = der[j];
        j++;
      }
      k++;
    }
    while (i < izq.length) {
      A[k] = izq[i];
      i++;
      k++;
    }
    while (j < der.length) {
      A[k] = der[j];
      j++;
      k++;
    }
  }

  /**
   * Metodo ordenar
   * @param arr -> el arreglo que sera ordenado usando el algoritmo MergeSort
  **/
  public void ordenar(int[] arr) {
    if (arr != null && arr.length > 0) {
      mergeSortAplicado(arr, 0, arr.length - 1);
    }
  }
}
