import java.util.Scanner;

public class BasicJavaPrograms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.println("""
                    plz enter
                    'a' for Area Of Circle
                    'b' for Area Of Triangle
                    'c' for Area Of Rectangle
                    'd' for Area Of Isosceles Triangle
                    'e' for Area Of Parallelogram
                    'f' for Area Of Rhombus
                    'g' for Area Of Equilateral Triangle
                    'h' for Perimeter Of Circle
                    'i' for Perimeter Of Equilateral Triangle
                    'j' for Perimeter Of Parallelogram
                    'k' for Perimeter Of Rectangle
                    'l' for Perimeter Of Square
                    'm' for Perimeter Of Rhombus
                    'n' for Volume Of Cone Java Program
                    'o' for Volume Of Prism
                    'p' for Volume Of Cylinder
                    'q' for Volume Of Sphere
                    'r' for Volume Of Pyramid
                    's' for Curved Surface Area Of Cylinder
                    't' for Total Surface Area Of Cube""");

            choice = input.next().charAt(0);

            switch (choice) {
                // Code for option a (finding the area of a Circle)
                case 'a' -> {
                    System.out.println("Enter radius:");
                    double rOfc = input.nextDouble();
                    double areaOfc = 3.14 * rOfc * rOfc;
                    System.out.println("Area of Circle: " + areaOfc);
                }

                // Code for option b (finding the area of a triangle)
                case 'b' -> {
                    System.out.println("Enter base:");
                    double bOft = input.nextDouble();
                    System.out.println("Enter height:");
                    double hOft = input.nextDouble();
                    double areaOfT = (bOft * hOft) / 2;
                    System.out.println("Area of Triangle: " + areaOfT);
                }

                // Code for option c (finding the area of a Rectangle)
                case 'c' -> {
                    System.out.println("Enter length:");
                    double lengthOfRectangle = input.nextDouble();
                    System.out.println("Enter width:");
                    double widthOfRectangle = input.nextDouble();
                    double areaOfRectangle = lengthOfRectangle * widthOfRectangle;
                    System.out.println("Area of Rectangle: " + areaOfRectangle);
                }

                // Code for option d (finding the area of an Isosceles Triangle)
                case 'd' -> {
                    System.out.println("Enter base:");
                    double baseOfIsosceles = input.nextDouble();
                    System.out.println("Enter height:");
                    double heightOfIsosceles = input.nextDouble();
                    double areaOfIsosceles = 0.5 * baseOfIsosceles * heightOfIsosceles;
                    System.out.println("Area of Isosceles Triangle: " + areaOfIsosceles);
                }

                // Code for option e (finding the area of a Parallelogram)
                case 'e' -> {
                    System.out.println("Enter base:");
                    double baseOfParallelogram = input.nextDouble();
                    System.out.println("Enter height:");
                    double heightOfParallelogram = input.nextDouble();
                    double areaOfParallelogram = baseOfParallelogram * heightOfParallelogram;
                    System.out.println("Area of Parallelogram: " + areaOfParallelogram);
                }

                // Code for option f (finding the area of a Rhombus)
                case 'f' -> {
                    System.out.println("Enter diagonals:");
                    double diagonal1 = input.nextDouble();
                    double diagonal2 = input.nextDouble();
                    double areaOfRhombus = (diagonal1 * diagonal2) / 2;
                    System.out.println("Area of Rhombus: " + areaOfRhombus);
                }

                // Code for option g (finding the area of an Equilateral Triangle)
                case 'g' -> {
                    System.out.println("Enter side length:");
                    double sideLength = input.nextDouble();
                    double areaOfEquilateral = (Math.sqrt(3) / 4) * sideLength * sideLength;
                    System.out.println("Area of Equilateral Triangle: " + areaOfEquilateral);
                }

                // Code for option h (finding the perimeter of a Circle)
                case 'h' -> {
                    System.out.println("Enter radius:");
                    double radiusOfCircle = input.nextDouble();
                    double perimeterOfCircle = 2 * 3.14 * radiusOfCircle;
                    System.out.println("Perimeter of Circle: " + perimeterOfCircle);
                }

                // Code for option i (finding the perimeter of an Equilateral Triangle)
                case 'i' -> {
                    System.out.println("Enter side length:");
                    double sideLength = input.nextDouble();
                    double perimeterOfEquilateral = 3 * sideLength;
                    System.out.println("Perimeter of Equilateral Triangle: " + perimeterOfEquilateral);
                }

                // Code for option j (finding the perimeter of a Parallelogram)
                case 'j' -> {
                    System.out.println("Enter length of one side:");
                    double sideLength1 = input.nextDouble();
                    System.out.println("Enter length of adjacent side:");
                    double sideLength2 = input.nextDouble();
                    double perimeterOfParallelogram = 2 * (sideLength1 + sideLength2);
                    System.out.println("Perimeter of Parallelogram: " + perimeterOfParallelogram);
                }

                // Code for option k (finding the perimeter of a Rectangle)
                case 'k' -> {
                    System.out.println("Enter length:");
                    double lengthOfRectangle = input.nextDouble();
                    System.out.println("Enter width:");
                    double widthOfRectangle = input.nextDouble();
                    double perimeterOfRectangle = 2 * (lengthOfRectangle + widthOfRectangle);
                    System.out.println("Perimeter of Rectangle: " + perimeterOfRectangle);
                }

                // Code for option l (finding the perimeter of a Square)
                case 'l' -> {
                    System.out.println("Enter side length:");
                    double sideLength = input.nextDouble();
                    double perimeterOfSquare = 4 * sideLength;
                    System.out.println("Perimeter of Square: " + perimeterOfSquare);
                }

                // Code for option m (finding the perimeter of a Rhombus)
                case 'm' -> {
                    System.out.println("Enter side length:");
                    double sideLength = input.nextDouble();
                    double perimeterOfRhombus = 4 * sideLength;
                    System.out.println("Perimeter of Rhombus: " + perimeterOfRhombus);
                }

                // Code for option n (finding the volume of a Cone)
                case 'n' -> {
                    System.out.println("Enter radius:");
                    double radius = input.nextDouble();
                    System.out.println("Enter height:");
                    double height = input.nextDouble();
                    double volumeOfCone = (1.0 / 3.0) * 3.14 * radius * radius * height;
                    System.out.println("Volume of Cone: " + volumeOfCone);
                }

                // Code for option o (finding the volume of a Prism)
                case 'o' -> {
                    System.out.println("Enter base area:");
                    double baseArea = input.nextDouble();
                    System.out.println("Enter height:");
                    double height = input.nextDouble();
                    double volumeOfPrism = baseArea * height;
                    System.out.println("Volume of Prism: " + volumeOfPrism);
                }

                // Code for option p (finding the volume of a Cylinder)
                case 'p' -> {
                    System.out.println("Enter radius:");
                    double radius = input.nextDouble();
                    System.out.println("Enter height:");
                    double height = input.nextDouble();
                    double volumeOfCylinder = 3.14 * radius * radius * height;
                    System.out.println("Volume of Cylinder: " + volumeOfCylinder);
                }

                // Code for option q (finding the volume of a Sphere)
                case 'q' -> {
                    System.out.println("Enter radius:");
                    double radius = input.nextDouble();
                    double volumeOfSphere = (4.0 / 3.0) * 3.14 * radius * radius * radius;
                    System.out.println("Volume of Sphere: " + volumeOfSphere);
                }

                // Code for option r (finding the volume of a Pyramid)
                case 'r' -> {
                    System.out.println("Enter base area:");
                    double baseArea = input.nextDouble();
                    System.out.println("Enter height:");
                    double height = input.nextDouble();
                    double volumeOfPyramid = (1.0 / 3.0) * baseArea * height;
                    System.out.println("Volume of Pyramid: " + volumeOfPyramid);
                }

                // Code for option s (finding the curved surface area of a Cylinder)
                case 's' -> {
                    System.out.println("Enter radius:");
                    double radius = input.nextDouble();
                    System.out.println("Enter height:");
                    double height = input.nextDouble();
                    double curvedSurfaceAreaOfCylinder = 2 * 3.14 * radius * height;
                    System.out.println("Curved Surface Area of Cylinder: " + curvedSurfaceAreaOfCylinder);
                }

                // Code for option t (finding the total surface area of a Cube)
                case 't' -> {
                    System.out.println("Enter side length:");
                    double sideLength = input.nextDouble();
                    double totalSurfaceAreaOfCube = 6 * sideLength * sideLength;
                    System.out.println("Total Surface Area of Cube: " + totalSurfaceAreaOfCube);
                }
                default -> System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to continue (y/n)?");
            choice = input.next().charAt(0);
        } while (choice == 'y');

        input.close();
    }
}

