package TestDay1;

/**
 * Created by ajesh on 1/8/18.
 */
public class IntegerFromString {

    public static void main(String[] args) {
        System.out.println(returnIntegerFromString("i-k42ki59")); //-+ - 5ik  //ik +-4 289ik
    }


    public static int returnIntegerFromString(String s){

        char inputChar[] = s.toCharArray();
        int result =0;
        String sign ="";

        for (int i = 0; i < inputChar.length; i++) {
            if(isDigit(inputChar[i])){
                result = consumeDigit(inputChar, i);
                break;
            }

            if(isSign(inputChar[i])){
                sign = inputChar[i]+"";
            }
        }

        if(sign.equals("-")){
            result = -result;
        }

        return  result;

    }

    private static  int consumeDigit(char[] input , int index ){
        int result=0;
        while(isDigit(input[index]) && index<input.length){
            result = result*10 + Character.getNumericValue(input[index]);
            index++;
        }
        return result;
    }

    private static boolean isSign(char c) {

        if(c=='-' || c=='+'){
            return true;
        }
        return  false;

    }

    private static boolean isDigit(char c) {

        if(c>='0' && c<='9'){
            return true;
        }

        else return  false;
    }
}
