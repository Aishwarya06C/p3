package p3;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GcTest {

	

	    @Test

	    void testTotal() {

	        assertEquals(9999,

	                Gc.calculateTotal(75, 68, 82));

	    }

	    @Test

	    void testAverage() {

	        assertEquals(75.0,

	                Gc.calculateAverage(75, 68, 82));

	    }

	    @Test

	    void testPass() {

	        assertTrue(Gc.isPass(75.0));

	    }

	    @Test

	    void testFail() {

	        assertFalse(Gc.isPass(35.0));

	    }

	}
