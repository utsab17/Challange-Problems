import java.util.ArrayList;
import java.util.List;

//Given a list of scores, this program will round each score to the nearest multiple of five if the difference between them is less than three
//if the actual value after rounding - is less than 40, no rounding is done.

public class Grade {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newList = new ArrayList<Integer>();
        int roundedGrade = 0;
        for (int i : grades){
            int addNum = i % 5;
            if (addNum == 3){
                roundedGrade = i + 2;
                if (roundedGrade < 40){
                    newList.add(i);
                } else {
                    newList.add(roundedGrade);
                }
            } else if (addNum == 4){
                roundedGrade = i + 1;
                if (roundedGrade < 40){
                    newList.add(i);
                } else {
                    newList.add(roundedGrade);
                }
            } else {
                newList.add(i);
            }
        }
        return newList;
    }

    public static void main(String[] args){
        Grade g = new Grade();
        List<Integer> n = new ArrayList<Integer>();
        n.add(73);
        n.add(67);
        n.add(38);
        n.add(33);
        System.out.println(g.gradingStudents(n));

    }


}
