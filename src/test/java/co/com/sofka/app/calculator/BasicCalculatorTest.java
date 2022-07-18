package co.com.sofka.app.calculator;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    @Test
    @DisplayName("Testing sum: 1+2=3")
    public void sum(){
        //Arrange
        Long number1= 1L;
        Long number2= 2L;
        Long expectedValue = 3L;

        //Act
        Long result = basicCalculator.sum(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }

    /*@DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    @Test
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
*/
    @Test
    @DisplayName("Testing rest: 5-2=3")
    public void rest(){
        //Arrange
        Long number1= 5L;
        Long number2= 2L;
        Long expectedValue = 3L;

        //Act
        Long result = basicCalculator.rest(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiplication: 5*2=10")
    public void multiplication(){
        //Arrange
        Long number1= 5L;
        Long number2= 2L;
        Long expectedValue = 10L;

        //Act
        Long result = basicCalculator.multiplication(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing division: 10/2=5")
    public void division(){
        //Arrange
        Long number1= 10L;
        Long number2= 2L;
        String expectedValue = "5";

        //Act
        String result = basicCalculator.division(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing division with zero: 10/0= ")
    public void divisionWithZero(){
        //Arrange
        Long number1= 10L;
        Long number2= 0L;
        String expectedValue = "No se puede dividir entre cero";

        //Act
        String result = basicCalculator.division(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }
}
