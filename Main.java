import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String args[]) {


        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        String input = "VII";
        int preValue = 0;
        int result = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(input.charAt(i));

          
            if (currValue < preValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            preValue = currValue;
        }

        System.out.println("The integer value of " + input + " is: " + result);
    }
}
