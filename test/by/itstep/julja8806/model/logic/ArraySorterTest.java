package by.itstep.julja8806.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;
public class ArraySorterTest {
    @Test
    public void testBubbleSortAsc() {
        int[] array = {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.bubbleSortAsc(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }

    }

    @Test
    public void testBubbleSortDesc() {
        int[] array = {7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
        int[] expected = {7,6,5,5,4,4,3,3,2,1};

        ArraySorter.bubbleSortDesc(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();

            }
        }
    }
}