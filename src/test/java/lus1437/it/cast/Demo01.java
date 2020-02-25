package lus1437.it.cast;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Demo01 {
	@Test
	public void test01() {
		try {
			assertEquals("1","1");
		} catch (Exception e) {
			// TODO: handle exception
			  fail("test01 failed.");
		}
		  
	}
	
	@Test
	public void test02() {
		try {
			assertEquals("1","2");
		} catch (Exception e) {
			// TODO: handle exception
			  fail("test02 failed.");
		}
		  
	}
}
