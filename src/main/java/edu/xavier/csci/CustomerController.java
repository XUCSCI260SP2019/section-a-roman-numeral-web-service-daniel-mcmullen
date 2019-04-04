package edu.xavier.csci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

    @GetMapping("/")
    public String root(){
        return "n/a";
    }

    @GetMapping("/decode/{id}")

    public ResponseSingleDecode encode(@PathVariable("id") String num) {
        ResponseSingleDecode response = new ResponseSingleDecode();

        response.setNumber(romanNumeralConverter.decode(num));

        return response;
    }

    @GetMapping("/encode/{id}")

    public ResponseSingleEncode decode(@PathVariable("id") int roNum) {
        ResponseSingleEncode response = new ResponseSingleEncode();

        response.setRomanNumeral(romanNumeralConverter.encode(roNum));

        return response;
    }

/*    @PostMapping("/encode")

    public ResponseMultiEncode decode(@PathVariable("id") int[] roNumArr) {
        ResponseMultiEncode response = new ResponseMultiEncode();

        response.setRomanNumeral(romanNumeralConverter.encode(roNumArr));

        return response;
    }

    @PostMapping("/decode")

    public ResponseMultiEncode encode(@PathVariable("id") int[] numArr) {
        ResponseMultiEncode response = new ResponseMultiEncode();

        response.setRomanNumeral(romanNumeralConverter.encode(numArr));

        return response;
    }*/
}