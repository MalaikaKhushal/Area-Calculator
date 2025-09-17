import java.util.Scanner;

public class AreaCalculator {

 
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

  
    public static double area(double length, double width) {
        return length * width;
    }


    public static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle: " + area(radius));

    
        System.out.print("Enter length and width of rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle: " + area(length, width));

       
        System.out.print("Enter side of square: ");
        int side = scanner.nextInt();
        System.out.println("Area of square: " + area(side));
    }
}

