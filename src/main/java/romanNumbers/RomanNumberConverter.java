package romanNumbers;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RomanNumberConverter {

    

    public int convertRomanToInt(String romanNumber){
        if( !isValidRomanString(romanNumber)){
            throw new IllegalArgumentException("not a valid roman number !");
        }
        int sum = 0;
        int tmp = 0;
        int currentNumber;
        for (int i=(romanNumber.length()-1); i>=0 ; i--){
            currentNumber = convertBasicLetterToNumber(romanNumber.toCharArray()[i]);
            if(currentNumber >= tmp){
                sum = sum + currentNumber;
            }
            else{
                sum = sum - currentNumber;
            }
            tmp = currentNumber;
        }
        return sum;
    }
    

    public String convertIntToRoman(int number) {
        return null;
    }

    public int convertBasicLetterToNumber(char c) {
        int convert;
        switch(c){
            case 'I':
                convert = 1;
                break;
            case 'V':
                convert = 5;
                break;
            case 'X':
                convert = 10;
                break;
            case 'L':
                convert =  50;
                break;
            case 'C':
                convert = 100;
                break;
            case 'D':
                convert = 500;
                break;
            case 'M':
                convert = 1000;
                break;
            default :
                throw new IllegalArgumentException("not a roman char !");
        }
        return convert;
    }

    public boolean isValidRomanString(String s){
        Pattern pattern = Pattern.compile("^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

}