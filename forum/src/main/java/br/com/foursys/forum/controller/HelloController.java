/**
 * 
 */
package br.com.foursys.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * classe hello para dar sorte no spring boot
 *
 * @author Elisson Machado
 * @since 17/05/2021
 * @version 1.0
 */

@Controller
public class HelloController {
	
	@RequestMapping("/")//anotação para mapeamento da requisição do navegador
	@ResponseBody
	public String hello() {
		
		return "hello world";
	}

}
