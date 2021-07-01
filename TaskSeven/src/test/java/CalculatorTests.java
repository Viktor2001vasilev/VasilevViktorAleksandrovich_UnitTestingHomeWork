import org.testng.Assert;
import org.testng.annotations.*;


public class CalculatorTests {
    //---------------------------------Позитивные проверки сложения и вычитания--------------------------------
    @DataProvider
    public Object[][] positiveAdditionSubtractionData() {
        return new Object[][] {
                {4, 2, 2},
                {5, 2, 3},
                {6, 4, 2},
                {-3, 5, -8}
        };
    }
    @Test(dataProvider = "positiveAdditionSubtractionData")
    public void positiveAdditionTest(int calculatorResult, int firstNum, int secondNum) {
        Assert.assertEquals( calculatorResult, new Calculator().addition(firstNum, secondNum), "Значения не равны!");
    }
    @Test(dataProvider = "positiveAdditionSubtractionData")
    public void positiveSubtractionTest(int firstNum, int secondNum, int calculatorResult) {
        Assert.assertEquals(calculatorResult, new Calculator().subtraction(firstNum, secondNum), "Значения не равны!");
    }
    //---------------------------------------------------------------------------------------------------------
    //---------------------------------Позитивные проверки умножения и деления---------------------------------
    @DataProvider
    public Object[][] positiveMultiplicationDivisionData() {
        return new Object[][] {
                {4, 2, 2},
                {10, 2, 5},
                {6, 3, 2},
                {-20, 5, -4}
        };
    }
    @Test(dataProvider = "positiveMultiplicationDivisionData")
    public void positiveMultiplicationTest(int calculatorResult, int firstNum, int secondNum) {
        Assert.assertEquals( calculatorResult, new Calculator().multiplication(firstNum, secondNum), "Значения не равны!");
    }
    @Test(dataProvider = "positiveMultiplicationDivisionData")
    public void positiveDivisionTest(int firstNum, int secondNum, int calculatorResult) {
        Assert.assertEquals(calculatorResult, new Calculator().division(firstNum, secondNum), "Значения не равны!");
    }
    //---------------------------------------------------------------------------------------------------------
    //------------------------Негативные проверки сложения, вычитания, умножения и деления---------------------
    @DataProvider
    public Object[][] negativeOperationsData() {
        return new Object[][] {
                {4, 1, 2},
                {3, 2, 5},
                {60, 3, 2},
                {20, 5, -4}
        };
    }
    @Test(dataProvider = "negativeOperationsData")
    public void negativeAdditionTest(int calculatorResult, int firstNum, int secondNum) {
        Assert.assertNotEquals( calculatorResult, new Calculator().addition(firstNum, secondNum), "Значения равны!");
    }
    @Test(dataProvider = "negativeOperationsData")
    public void negativeSubtractionTest(int firstNum, int secondNum, int calculatorResult) {
        Assert.assertNotEquals(calculatorResult, new Calculator().subtraction(firstNum, secondNum), "Значения равны!");
    }
    @Test(dataProvider = "negativeOperationsData")
    public void negativeMultiplicationTest(int calculatorResult, int firstNum, int secondNum) {
        Assert.assertNotEquals( calculatorResult, new Calculator().multiplication(firstNum, secondNum), "Значения равны!");
    }
    @Test(dataProvider = "negativeOperationsData")
    public void negativeDivisionTest(int firstNum, int secondNum, int calculatorResult) {
        Assert.assertNotEquals(calculatorResult, new Calculator().division(firstNum, secondNum), "Значения равны!");
    }
    //---------------------------------------------------------------------------------------------------------
    //----------------Проверки граничных значений сложения, вычитания, умножения и деления---------------------
    @DataProvider
    public Object[][] boundaryOperations() {
        return new Object[][] {
                {4, "two", 2},
                {5, 2, "three"},
                {null, 4, 2},
                {-3, null, "four"}
        };
    }
    @Test(dataProvider = "boundaryOperations", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void boundaryAdditionTest(Object calculatorResult, Object firstNum, Object secondNum) {
        Assert.assertEquals( calculatorResult, new Calculator().addition(firstNum, secondNum), "Значения не равны!");
    }
    @Test(dataProvider = "boundaryOperations", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void boundarySubtractionTest(Object firstNum, Object secondNum, Object calculatorResult) {
        Assert.assertEquals(calculatorResult, new Calculator().subtraction(firstNum, secondNum), "Значения не равны!");
    }
    @Test(dataProvider = "boundaryOperations", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void boundaryMultiplicationTest(Object calculatorResult, Object firstNum, Object secondNum) {
        Assert.assertEquals( calculatorResult, new Calculator().multiplication(firstNum, secondNum), "Значения не равны!");
    }
    @Test(dataProvider = "boundaryOperations", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void boundaryDivisionTest(Object firstNum, Object secondNum, Object calculatorResult) {
        Assert.assertEquals(calculatorResult, new Calculator().division(firstNum, secondNum), "Значения не равны!");
    }
    //---------------------------------------------------------------------------------------------------------

}
