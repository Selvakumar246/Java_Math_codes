import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     System.out.println("enter the radius and height of an cone:");
    double radius = input.nextInt();
    double height= input.nextInt();
    double vol =(0.333*Math.PI*radius*radius*height);
        System.out.printf("the Volume of the cone is:%.2f cm", vol);
}}
