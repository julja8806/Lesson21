package by.itstep.julja8806.model.logic;

public class ArraySorter {

    public static void bubbleSortAsc(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                count ++;
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;

                }
            }
        }
        System.out.println("count = " + count);

    }

//    public static void testBubbleSortAscWithNull(int[] array) {
//        if (array == null) {
//            throw new RuntimeException();
//        }
//        for (int j = 0; j < array.length - 1; j++) {
//            for (int i = 0; i < array.length - 1; i++) {
//               ;
//                if (array[i] > array[i + 1]) {
//                    int t = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = t;
//
//                }
//
//            }
//        }

    public static void bubbleSortDesc(int[] array) {
        int count = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                count ++;
                if (array[i] < array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;

                }
            }
        }
        System.out.println("count = " + count);

    }
}