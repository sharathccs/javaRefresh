package testPack1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pack1.Average;
import pack1.StringConcat;

class TestAverage {

	@Test
	void testMain() {
		StringConcat sc = new StringConcat();
		String val = sc.concat("vv", "v");
		
		assertEquals("vvv", val);
	}

}