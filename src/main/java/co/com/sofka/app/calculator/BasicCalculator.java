package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {} ", number1, number2);
        return number1 + number2;
    }

    public Long rest(Long number1, Long number2) {
        logger.info("Resting {} - {} ", number1, number2);
        return number1 - number2;
    }

    public Long multiplication(Long number1, Long number2) {
        logger.info("Multiplication {} * {} ", number1, number2);
        return number1 * number2;
    }

    public String division(Long number1, Long number2) {
        logger.info("Division {} / {} ", number1, number2);
        if (number2 != 0) {
            return String.valueOf(number1 / number2);
        }
        return "No se puede dividir entre cero";
    }

}

