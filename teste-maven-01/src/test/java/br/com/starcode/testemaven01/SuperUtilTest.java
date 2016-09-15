package br.com.starcode.testemaven01;

import org.junit.Test;

import junit.framework.Assert;

/**
 * 
 */

/**
 * @author matao01
 *
 */
@SuppressWarnings("deprecation")
public class SuperUtilTest {

	@Test
	public void escapeHTMLTest(){
		
		String escapedHtml = SuperUtil.escapeHTML("<script>alert(1);</script>");
		
        String expected = "&lt;script&gt;alert(1);&lt;/script&gt;"; 
        
        Assert.assertEquals(expected, escapedHtml); 
        
	}
}
