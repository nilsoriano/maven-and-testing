import org.example.MathLibrary;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathLibraryTest {

    /*
    @BeforeEach // executes before each test
    void setUp() {

    }

    @AfterEach // executes after each test
    void tearDown() {

    } */
    MathLibrary ml1 = new MathLibrary();
    @Test
    @DisplayName("Dado un array, retornar la resta de todos sus números")
    void subtractTestPositiveNums() {
        int[] arr = new int[]{1,2,3,4,5};
        int number = ml1.subtract(arr);
        assertEquals(-15,number);
    }
    @Test
    @DisplayName("Dado un array de negativos, retornar la resta de todos sus números")
    void subtractTestNegativeNums(){
        int[] arr = new int[]{-1,-2,-3,-4,-5};
        int number = ml1.subtract(arr);
        assertEquals(15,number);
    }

    @Test
    @DisplayName("Dado un array mixto, retornar la resta")
    void subtractTestMixedNums(){
        int[] arr = new int[]{1,-2,3,-4,5};
        int number = ml1.subtract(arr);
        assertEquals(-3, number);
    }

    @Test
    @DisplayName("Dado un array vacío, retorna 0")
    void subtractTestEmptyArray(){
        int[] arr = new int[10];
        int number= ml1.subtract(arr);
        assertEquals(0,number);
    }
}
