////////////////////////////////////////////////////////////////////
// Bilal El Moutaren 2053470
// Anton Ricardo Rupi 2054304
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testInit(){
        IntegerToRoman test = new IntegerToRoman();
        assertEquals(null, test.convert(0));
    }
}