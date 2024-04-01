package noDI;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeMakerTest {
    @Test
    public void testBrew() {
        // Setup to capture stdout
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brew();
        // Testing this way does not isolate CoffeeMaker from its dependencies

        // Assert
        String output = outContent.toString();
        assertTrue(output.contains("Coffee brewing"));
        assertTrue(output.contains("Heating with electricity"));
        assertTrue(output.contains("Pumping..."));

        // Clean up by resetting System.out
        System.setOut(System.out);
    }
}