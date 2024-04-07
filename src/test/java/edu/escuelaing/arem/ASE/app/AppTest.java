package edu.escuelaing.arem.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public void testApp()
    {
        assertTrue( true );
    }


    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int expectedIndex = 2;
        assertEquals(expectedIndex, MathServices.binarySearch(arr, target));
    }

    public void testLinealSearch() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;
        int expectedIndex = 3;
        assertEquals(expectedIndex, MathServices.linealSearch(arr, target));
    }

    public void testBinarySearchWithEmptyArray() {
        int[] arr = {};
        int target = 5;
        int expectedIndex = -1; // No debería encontrar el elemento en un arreglo vacío
        assertEquals(expectedIndex, MathServices.binarySearch(arr, target));
    }

    public void testLinealSearchWithTargetNotPresent() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 10; // El elemento 10 no está en el arreglo
        int expectedIndex = -1;
        assertEquals(expectedIndex, MathServices.linealSearch(arr, target));
    }

    public void testBinarySearchWithDuplicateValues() {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6};
        int target = 2; // Hay duplicados del valor 2 en el arreglo
        int expectedIndex = 1;
        assertEquals(expectedIndex, MathServices.binarySearch(arr, target));
    }
}
