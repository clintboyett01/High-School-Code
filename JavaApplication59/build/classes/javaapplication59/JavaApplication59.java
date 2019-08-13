
package javaapplication59;

public class JavaApplication59 {

    public static void main(String[] args) {
        selectionSort ss = new selectionSort();
        insertionSort is = new insertionSort();
        int[] arr = {2, 3, 4, 65, 6, 7, 3, 45, 56, 23, 34, 5, 4, 34, 6, 2, 57, 4, 45, 345};
        arr = is.sort(arr);
        System.out.print("{");
        for (int el : arr) {
            System.out.print(el + ",");
        }
        System.out.println("\b}");
    }

}

class insertionSort {

    public int[] sort(int[] a) {
        int insrt, j;
        boolean keepGoing;
        for (int i = 1; i < a.length; i++) {
            insrt = a[i];
            j = i - 1;
            keepGoing = true;
            while ((j >= 0) && keepGoing) {
                if(insrt<a[j]){
                    a[j+1] = a[j];
                    j--;
                    if(j==-1)
                        a[0] = insrt;
                }
                else{
                    keepGoing = false;
                    a[j+1] = insrt;
                }
                   
            }

        }
        return a;
    }

}

class selectionSort {

    public int[] sort(int[] arr) {
        int min, minIndex;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

}
