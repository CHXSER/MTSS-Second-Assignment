////////////////////////////////////////////////////////////////////
// Bilal El Moutaren 2053470
// Anton Ricardo Rupi 2054304
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test
    public void testInit() {
        RomanPrinter test = new RomanPrinter();
        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)) {
            integerToRomanMockedStatic.when(() -> IntegerToRoman.convert(1)).thenReturn("I");
            assertEquals(null, test.print(1));
        }
    }
}