package by.itstep.julja8806.model.logic;

public class ArraySorter {

    public static void bubbleSortAsc(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                count++;
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;

                }
            }
        }
        System.out.println("count = " + count);

    }

    public static void testBubbleSortAscWithNull(int[] array) {
        if (array == null) {
            throw new RuntimeException();
        }

    }

    public static void bubbleSortDesc(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                count++;
                if (array[i] < array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;

                }
            }
        }
        System.out.println("count = " + count);

    }

    public static void SelectedSortAsc(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {


            int indexMinElement = 0;

                for (int i = j + 1; i < array.length; i++) {
                    count++;
                    if (array[indexMinElement] > array[i]) {
                        indexMinElement = j;

                    }
                }

            int t = array[j];
            array[j] = array[indexMinElement];
            array[indexMinElement] = t;


        }
        System.out.println("count = " + count);
    }
    public static void SelectedSortDesc(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {


            int indexMaxElement = 0;

            for (int i = j + 1; i < array.length; i++) {
                count++;
                if (array[indexMaxElement] < array[i]) {
                    indexMaxElement = j;

                }
            }

            int t = array[j];
            array[j] = array[indexMaxElement];
            array[indexMaxElement] = t;


        }
        System.out.println("count = " + count);
    }
}
