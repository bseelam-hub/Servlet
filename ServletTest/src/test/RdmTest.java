package test;

import main.java.com.random.RandomTest;

import org.junit.Assert;
import org.junit.Test;

public class RdmTest {

	
	 @Test
	 public void testRandomPass() {
		 RandomTest obj = new RandomTest();
		 String s = obj.getRandom();
	  Assert.assertEquals(s, s);
	}
	 @Test
	 public void testRandomFail() {
		 RandomTest obj = new RandomTest();
		 String s = obj.getRandom();
	  Assert.assertEquals("126", s);
	}
}
