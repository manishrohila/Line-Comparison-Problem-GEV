import java.util.Scanner;

public class CheckEqualLines {
    public void equalLines(int x1, int y1, int x2 ,int y2) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the two coordinates of the second line ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        double diff1 = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double length1 = Math.sqrt(diff1);
        double diff2 = Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2);
        double length2 = Math.sqrt(diff2);
        if (length1 == length2) {
            System.out.println("The two lines are equal in length.");
        } else {
            System.out.println("The two lines are not equal in length.");
        }
    }
}
