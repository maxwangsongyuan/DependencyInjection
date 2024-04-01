package daggerDI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class CoffeeMakerTest {

    @Mock
    Heater heater;

    @Mock
    Pump pump;

    @InjectMocks
    CoffeeMaker coffeeMaker;

    @BeforeEach
    public void setUp() {
        // Initialize the mocks
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testBrew() {
        // Define behavior
        doNothing().when(heater).heat();
        doNothing().when(pump).pump();

        // Perform action
        coffeeMaker.brew();

        // Verify methods were called
        verify(heater, times(1)).heat();
        verify(pump, times(1)).pump();
    }
}
