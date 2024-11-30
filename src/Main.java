import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first line ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the coordinates of the second line ");
        int x2 =sc.nextInt();
        int y2 = sc.nextInt();
        LineComparison lineComparison = new LineComparison();
        int i =1;
        do{
            System.out.println("Press 1 to Calculate the length\n");
            int input = sc.nextInt();
            switch (input){
                case 1: lineComparison.lengthCalculate(x1,y1,x2,y2);
                        break;
                default:
                    System.out.println("nothing ");
                    break;
            }
            System.out.println("Press 0 to exit \nTo continue press 1");
            i = sc.nextInt();
        }while (i!=0);
        System.out.println("Thank you");
    }
}