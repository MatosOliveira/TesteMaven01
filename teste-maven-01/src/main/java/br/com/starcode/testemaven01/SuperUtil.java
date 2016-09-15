/**
 * 
 */
package br.com.starcode.testemaven01;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Possibilita exibir um texto contendo HTML no navegador sem ataques XSS.
 * 
 * @param html 
 * 		Entrada do usuário (pode ter HTML, mas não deve ser renderizado, somente exibido)
 * @return 
 * 		Texto sem posíveis tags HTML
 * 
 * @author matao01
 *
 */
public class SuperUtil {

	
   public static String escapeHTML(String html) {
       return StringEscapeUtils.escapeHtml4(html);
   }
}
