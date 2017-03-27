package test;

import main.java.com.text.Text;

import org.junit.Assert;
import org.junit.Test;

public class TextTest {
	
	@Test
	 public void textPass() {
		Text obj = new Text();
		 String s = obj.getText("env1");
	  Assert.assertEquals(s, s);
	}
	 @Test
	 public void textFail() {
		 Text obj = new Text();
		 String s = obj.getText("QA");
	  Assert.assertEquals("PROD", s);
	}

}
