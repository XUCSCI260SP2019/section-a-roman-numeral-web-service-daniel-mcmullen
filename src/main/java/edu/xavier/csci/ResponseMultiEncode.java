package edu.xavier.csci;

public class ResponseMultiEncode {

    private int[] romanNumeral;
    public int[] getRomanNumeral() {return romanNumeral; }

    public void setRomanNumeral(int[] numArr) {
        for(int i = 0; i < numArr.length; i++ ){
            romanNumeral = numArr;
            i++;
        }
    }
}
