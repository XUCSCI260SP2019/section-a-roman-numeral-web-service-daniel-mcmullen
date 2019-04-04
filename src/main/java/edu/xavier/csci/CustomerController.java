package edu.xavier.csci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    RomanNumeralApplication rna = new RomanNumeralApplication();

    @GetMapping("/")
    public String root(){
        return "n/a";
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

        response.setRomanNumeral(rna.encode(roNum));

        return response;
    }
}