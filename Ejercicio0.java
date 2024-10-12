interface Ordenamiento {
    void ordenar(int[] arr);
}

class BubbleSort implements Ordenamiento {
    public void ordenar(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

class SelectionSort implements Ordenamiento {
    public void ordenar(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}

public class Ejercicio0 {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 0, 3, 1, 6, 8};
        int[] arr2 = {8, 2, 3, 5, 1, 6, 7};

        Ordenamiento bubble = new BubbleSort();
        System.out.println("Arreglo 1: {4, 2, 0, 3, 1, 6, 8}");
        bubble.ordenar(arr1);
        System.out.println("Arreglo ordenado:");
        imprime(arr1);

        Ordenamiento selection = new SelectionSort();
        System.out.println("Arreglo 2: {8, 2, 3, 5, 1, 6, 7}");
        selection.ordenar(arr2);
        System.out.println("Arreglo ordenado:");
        imprime(arr2);
    }

    public static void imprime(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
