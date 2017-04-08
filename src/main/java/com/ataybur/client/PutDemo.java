package com.ataybur.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.ataybur.pojo.Address;

public class PutDemo {
	 public static void main(String args[]) {
	        RestTemplate restTemplate = new RestTemplate();
	        String url = "http://localhost:8080/spring-rest/data/putdata/{id}/{name}";
	        Map<String, String> map = new HashMap<String, String>();
	        map.put("id", "100");
	        map.put("name", "Ram");
	        Address address = new Address("Dhananjaypur", "Varanasi","UP");
	        restTemplate.put(url, address, map);
	    }
}
