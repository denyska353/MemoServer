package com.example.MemoServer;

import com.example.MemoServer.Repository.MemoHashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MemoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoServerApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "MemoBot") String name) {

		return String.format("%s!", memoHashRepository.findAll().toString());

	}

	@Autowired
	private MemoHashRepository memoHashRepository;

}
