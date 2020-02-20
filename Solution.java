import java.util.Arrays;

public class Solution {

    static String timeConversion(String s) {
        char[] charArr = s.toCharArray();

        for (char c : charArr){
            System.out.println(c);
        }
        String answer = "";


        if (charArr[s.length() - 2 ] == 'P'){
            char a = charArr[0];
            char b = charArr[1];
            // char mix = a + b;
            //int num = mix;
            String that = new StringBuilder().append(a).append(b).toString();

            int newNum = convertIt(that);
            String  st = Integer.toString(newNum);
            char[] newArr = st.toCharArray();
            charArr[0] = newArr[0];
            charArr[1] = newArr[1];
            char[] newOne = Arrays.copyOfRange(charArr, 0, s.length()-2);
            answer = String.valueOf(newOne);
        } else if (charArr[s.length() - 2] == 'A') {

            System.out.println("here");
            if (charArr[0] == '1' && charArr[1] == '2' && charArr[2] == ':' && charArr[3] == '0' && charArr[4] == '0' && charArr[5] == ':' && charArr[6] == '0' && charArr[7] == '0') {
                answer = new StringBuilder().append('0').append('0').append(':').append('0').append('0').append(':').append('0').append('0').toString();
            } else if((charArr[0] == '1' && charArr[1] == '2')  && (charArr[3] != 0 || charArr[4] != 0))
            {
                answer = new StringBuilder().append('0').append('0').append(':').append(charArr[3]).append(charArr[4]).append(':').append(charArr[6]).append(charArr[7]).toString();

            }
            else {
                char[] oldOne = Arrays.copyOfRange(charArr, 0, s.length() - 2);
                answer = String.valueOf(oldOne);
            }
        }
        return answer;
    }

    static int convertIt(String g){
        int answer1 = 0;
        switch(g){
            case "01":    answer1 = 13;
                break;
            case "02":    answer1 = 14;
                break;
            case "03":    answer1 = 15;
                break;
            case "04":    answer1 = 16;
                break;
            case "05":    answer1 = 17;
                break;
            case "06":    answer1 = 18;
                break;
            case "07":    answer1 = 19;
                break;
            case "08":    answer1 = 20;
                break;
            case "09":    answer1 = 21;
                break;
            case "10":    answer1 = 22;
                break;
            case "11":    answer1 = 23;
                break;
            case "12":    answer1 = 12;
                break;
        }
        return answer1;

    }

    public static void main(String[] args){
        Solution a = new Solution();
        System.out.println(a.timeConversion("12:05:39AM"));
    }
}
