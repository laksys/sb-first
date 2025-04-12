package org.example.sb_first;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/hi")
	public Map<String, String> sayHello(){
		Map<String, String> map = new HashMap<>();
		map.put("message", "hello, world!");
		return map;
	}
}
