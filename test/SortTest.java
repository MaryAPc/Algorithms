import com.maryapc.algorithms.sortings.BubbleSort;
import com.maryapc.algorithms.sortings.InsertionSort;
import com.maryapc.algorithms.sortings.MergeSort;
import com.maryapc.algorithms.sortings.SelectionSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static junit.framework.TestCase.fail;

public class SortTest {

    private int[] array;
    private int[] tempArray;
    private final static int ARRAY_SIZE = 1500;
    private final static int MAX_NUMBER = 2000;

    @Before
    public void setUpArray() {
        array = new int[ARRAY_SIZE];
        tempArray = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_NUMBER);
        }
        System.arraycopy(array, 0, tempArray, 0, ARRAY_SIZE);
    }

    @Test
    public void testBubbleSort() {
        printTestResult(BubbleSort.class.getSimpleName(), BubbleSort.sort(tempArray));
    }

    @Test
    public void testInsertionSort() {
        printTestResult(InsertionSort.class.getSimpleName(), InsertionSort.sort(tempArray));
    }

    @Test
    public void testSelectionSort() {
        printTestResult(SelectionSort.class.getSimpleName(), SelectionSort.sort(tempArray));
    }

    @Test
    public void testMergeSort() {
        printTestResult(MergeSort.class.getSimpleName(), MergeSort.sort(tempArray));
    }

    private void printTestResult(String sortName, int[] sortArray) {
        System.out.println("Array before " + sortName + ":\n" + Arrays.toString(array));
        System.out.println("Array after " + sortName + ":\n" + Arrays.toString(sortArray) + "\n");
        checkError(sortArray);
    }

    private void checkError(int[] sortArray) {
        for (int i = 0; i < sortArray.length - 1; i++) {
            if (sortArray[i] > sortArray[i + 1]) {
                fail("error!");
            }
        }
    }
}
