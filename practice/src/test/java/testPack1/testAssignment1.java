package testPack1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pack1.StringConcat;
import LogicalThinking.Assignment1;

/*
Useful Links:
	https://www.javatpoint.com/junit-tutorial

*/

class testAssignment1 {

	@Test
	void testMain() {
		
		Assignment1 a1 = new Assignment1();
		a1.returnMonth(4);
		assertEquals("January", a1.returnMonth(1), "Testcase for Jan passed");
		
	}

}
