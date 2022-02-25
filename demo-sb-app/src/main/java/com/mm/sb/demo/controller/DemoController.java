/**
 * 
 */
package com.mm.sb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lalitha
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	//@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "<h1>Welcome</h1>";
	}
	
}
