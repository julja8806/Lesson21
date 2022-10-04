package by.itstep.julja8806.model.logic;

import org.junit.*;

import static org.junit.Assert.*;
public class ArraySorterTest {
    private static int[] array;
    @BeforeClass
    public static void initGlobal(){
        array =  new int[]{7, 5, 6, 4, 5, 3, 4, 2, 3, 1};
    }
    @AfterClass
    public static void destroyedGlobal(){
        array = null;
    }
    @Before
    public void init(){
        array =  new int[]{7, 5, 6, 4, 5, 3, 4, 2, 3, 1};

    }
    @After
    public void destroyed() {
        array = null;
    }
    @Test
    public void testBubbleSortAsc() {
        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.bubbleSortAsc(array);
        assertArrayEquals(expected, array);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != expected[i]) {
//                fail();
//            }
//        }

    }

    @Test
    public void testBubbleSortDesc() {

        int[] expected = {7,6,5,5,4,4,3,3,2,1};

        ArraySorter.bubbleSortDesc(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();

            }
        }
    }
    @Test(expected = RuntimeException.class)
    public void testBubbleSortAscWithNull() {


        ArraySorter.bubbleSortAsc(null);
    }
    @Test
    public void testBubbleSortAscWithEmptyObject() {


        ArraySorter.bubbleSortAsc(new int[0]);
    }
    @Test
    public void testSelectedSortAsc() {

        int[] expected = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7};

        ArraySorter.SelectedSortAsc(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();

            }
        }
    }
    @Test
    public void testSelectedSortDesc() {

        int[] expected = {7,6,5,5,4,4,3,3,2,1};

        ArraySorter.SelectedSortDesc(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();

            }
        }
    }
}