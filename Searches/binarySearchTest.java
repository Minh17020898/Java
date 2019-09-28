import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class binarySearchTest {
    binarySearch b = new binarySearch();
    public Integer[] arr(){
        Integer[] arr = new Integer[7];
        arr[0] = 12;
        arr[1] = 35;
        arr[2] = 64;
        arr[3] = 68;
        arr[4] = 74;
        arr[5] = 91;
        arr[6] = 100;
        return  arr;
    }

    @Test
    public void BST1() {
        Integer[] arr = this.arr();
        assertEquals(3, b.search(arr, 68, 0, 6));
    }

    @Test
    public void BST2() {
        Integer[] arr = this.arr();
        assertEquals(0, b.search(arr, 12, 0, 6));
    }

    @Test
    public void BST3() {
        Integer[] arr = this.arr();
        assertEquals(1, b.search(arr, 35, 0, 6));
    }
    @Test
    public void BST4() {
        Integer[] arr = this.arr();
        assertEquals(2, b.search(arr, 64, 0, 6));
    }
    @Test
    public void BST5() {
        Integer[] arr = this.arr();
        assertEquals(4, b.search(arr, 74, 0, 6));
    }
    @Test
    public void BST6() {
        Integer[] arr = this.arr();
        assertEquals(5, b.search(arr, 91, 0, 6));
    }
    @Test
    public void BST7() {
        Integer[] arr = this.arr();
        assertEquals(6, b.search(arr, 100, 0, 6));
    }

}