/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package merge.sort;

import org.junit.jupiter.api.Test;

import static merge.sort.App.mergeSort;
import static merge.sort.App.quickSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AppTest {
    @Test
    void mergeSortTest() {
        int[] expectedArr = {1,2,3,4,5};
        int[] testedArr ={2,4,3,5,1};

        assertArrayEquals(expectedArr,mergeSort(testedArr));
    }

    @Test
    void mergeSortSortedArrTest() {
        int[] expectedArr = {1,2,3,4,5};
        int[] testedArr ={1,2,3,4,5};

        assertArrayEquals(expectedArr,mergeSort(testedArr));
    }

    @Test
    void mergeSortEmptyArrTest() {
        int[] expectedArr = {};
        int[] testedArr ={};

        assertArrayEquals(expectedArr,mergeSort(testedArr));
    }

}
