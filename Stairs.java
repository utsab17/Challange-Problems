public class Stairs {

    public static void ladders(int n) {
        for(int i = 0; i < n; i++) {
            int j;
            for(j = 0; j<n-i-1; j++)
                System.out.print(" ");
            for(; j<n; j++)
                System.out.print("#");
                System.out.print('\n');
        }
    }



    public static void main (String[] args){

        Stairs s = new Stairs();
        s.ladders(4);

        }
    }
