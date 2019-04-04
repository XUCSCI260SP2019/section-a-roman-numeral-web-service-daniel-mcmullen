package edu.xavier.csci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class RomanNumeralServiceApplication {
	RomanNumeralApplication rna = new RomanNumeralApplication();
	public static void main(String[] args) {
		SpringApplication.run(RomanNumeralServiceApplication.class, args);
	}

	@GetMapping("/decode/{id}")

	public ResponseSingleDecode encode(@PathVariable("id") String num) {
		ResponseSingleDecode response = new ResponseSingleDecode();

		response.setNumber(rna.decode(num));

		return response;
	}
	@GetMapping("/encode/{id}")

	public ResponseSingleEncode decode(@PathVariable("id") String roNum) {
		ResponseSingleEncode response = new ResponseSingleEncode();

		response.setNumber(rna.encode(roNum));

		return response;
	}
}
