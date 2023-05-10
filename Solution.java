/**
* Given a roman numeral, convert it to an integer
* @version: 3.1
* @date: 5/9/23
* @author: Madi T. Clark
*/

class Solution {
    public int romanToInt(String s) {
        //Variables
        int result = 0;
        int prev = 0;
        int curr = 0;

        //Interates through the characters of the String
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            //Set current char value
            switch (c) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }
            //add or sub current value based on roman
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }

            //Update prev char value
            prev = curr;
        }

        return result;

    }
}
