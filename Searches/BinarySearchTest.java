import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    BinarySearch b = new BinarySearch();
    BinarySearchTest btest = new BinarySearchTest();
    public Integer[] arr(){
        Integer a[] = new Integer[5];
        a[0] = 1;
        a[1] = 5;
        a[2] = 6;
        a[3] = 10;
        a[4] = 25;
        return a;
    }


    @Test
    public void BST1() {
        Integer[] arr = btest.arr();
        assertEquals(-1, b.search(arr, 7, 0, 4));
    }

    @Test
    public void BST2() {
        Integer[] arr = btest.arr();
        assertEquals(0, b.search(arr, 1, 0, 4));
    }

    @Test
    public void BST3() {
        Integer[] arr = btest.arr();
        assertEquals(4, b.search(arr, 25, 0, 4));
    }

    @Test
    public void BST4() {
        Integer[] arr = btest.arr();
        assertEquals(3, b.search(arr, 10, 0, 4));
    }

    @Test
    public void BST5() {
        Integer[] arr = btest.arr();
        assertEquals(2, b.search(arr, 6, 0, 4));
    }

}