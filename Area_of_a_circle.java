import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int radius=in.nextInt();
        double circle=3.14*radius*radius;
        System.out.format("%.2f",circle);
    }
}