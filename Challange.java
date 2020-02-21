
public class Challange {

    public String findOrder(int n){
        String answer = null;
        //converting int to string
        String asString = Integer.toString(n);
        int lengthOfNumber = asString.length();
        if (n == 10){
             answer ="ten";
        };
       //taking care of values 1 to 9
        if (lengthOfNumber == 1){
           answer = convertToString(n);
        } else if (lengthOfNumber == 2){
            char[] ch = asString.toCharArray();
            if (ch[1] == '0'){

                int firstdigit = ch[0];
                if (firstdigit == 4 || firstdigit == 6 || firstdigit == 8 || firstdigit == 9 || firstdigit == 7) {
                    String ans1 = convertToString(firstdigit);
                     answer = ans1 + "ty";
                }
            }

        }
        return answer;

    }


    public String convertToString(int n) {
        String ans = null;
        if (n <= 10) {
            if (n == 1) {
                ans = "One";
            } else if (n == 2) {
                ans = "Two";
            } else if (n == 3) {
                ans = "Three";
            } else if (n == 4) {
                ans = "Four";
            } else if (n == 5) {
                ans = "Five";
            } else if (n == 6) {
                ans = "Six";
            } else if (n == 7) {
                ans = "Seven";
            } else if (n == 8) {
                ans = "Eight";
            } else if (n == 9) {
                ans = "Nine";
            }
        } else {
            ans = "Ten";
        }
        return ans;

    }

    public static void main(String[] args){
        Challange ch = new Challange();
        //System.out.print(ch.findOrder(60));

        System.out.println("i" +  'i');

    }
}
