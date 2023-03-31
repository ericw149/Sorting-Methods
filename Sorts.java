public class Sorts{

    public static void bubbleSort(int[] array){
        System.out.print("Unsorted Array: [ ");
        for (int x : array)
            System.out.print(x + ", ");
        System.out.print("]");
        System.out.println();
        for(int i = 0; i < array.length - 1; ++i){
            System.out.print("Step " + i + ":");
            for(int j = 0; j < array.length - 1 - i; ++j){
                int savedIn = array[j + 1];
                if (array[j] > array[j + 1]){
                    array[j + 1] = array[j];
                    array[j] = savedIn;
                }
            }
            System.out.print("[ ");
            for (int x : array)
                System.out.print(x +", ");
            System.out.print("]");
            System.out.println();
        }
    }

    public static void insertionSort(int[] array){
        System.out.print("Unsorted Array: [ ");
        for (int x : array)
            System.out.print(x + ", ");
        System.out.print("]");
        System.out.println();
        for(int i = 1; i < array.length; ++i){
            System.out.print("Step " + (i -1) + ":");
            int key = array[i];
            for(int j = i; j >= 0; j--){
                if (array[j] > key){
                    array[j + 1] = array[j];
                    array[j] = key;
                }
            }
            System.out.print("[ ");
            for (int x : array)
                System.out.print(x +", ");
            System.out.print("]");
            System.out.println();
        }
    }

    public static void selectionSort(int[] array){
        System.out.print("Unsorted Array: [ ");
        for (int x : array)
            System.out.print(x + ", ");
        System.out.print("]");
        System.out.println();
        for(int i = 0; i < array.length; ++i){
            System.out.print("Step " + i + ":");
            int min = array[i];
            int indexToSwap = i;
            for(int j = i; j < array.length; ++j) {
                if(array[j] < min){
                    min = array[j];
                    indexToSwap = j;
                }
            }
            array[indexToSwap] = array[i];
            array[i] = min;
            System.out.print("[ ");
            for (int x : array)
                System.out.print(x +", ");
            System.out.print("]");
            System.out.println();
        }
    }
}
