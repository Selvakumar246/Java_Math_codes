import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("enter the radius of the circle:");
       double rad=input.nextInt();
       double Per=2* (Math.PI)*rad;
       System.out.printf("the Perimeter of the Circle is:%.2f units",Per);


       System.out.println("enter the side of an triangle");
       double side = input.nextInt();
       double Perimeter = 3 * side;
       System.out.printf("the Perimeter of the Equilateral triangle is:%.2f cm", Perimeter);
    }
}
