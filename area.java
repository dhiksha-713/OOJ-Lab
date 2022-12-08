import java.util.Scanner;

abstract class Shape{
    int x, y;
    double area;
    abstract void printarea();
}
class Rectangle extends Shape{

    void printarea (){
        area = x*y;
        System.out.println("Area of the Rectangle is= "+area);
    }
}
class Triangle extends Shape{

    void printarea (){
        area = 0.5*x*y;
        System.out.println("Area of the Triangle is= "+area);
    }
}
class Circle extends Shape{

    void printarea (){
        area = 3.1415*x*x;
        System.out.println("Area of the Circle is= "+area);
    }
}
class Area{
    public static void main(String[] args) {
        int choice;
        Scanner s = new Scanner(System.in);

        System.out.printf("\n1:Rectangle\n2:Triangle\n3:Circle\n");
        choice = s.nextInt();

        switch (choice){

            case 1:
            Rectangle r1 = new Rectangle();
            System.out.println("Enter the length and width of the rectangle:");
            r1.x=s.nextInt();
            r1.y=s.nextInt();
            r1.printarea();
            break;

            case 2:
            Triangle t1 = new Triangle();
            System.out.println("Enter the height and base of the triangle:");
            t1.x=s.nextInt();
            t1.y=s.nextInt();
            t1.printarea();
            break;

            case 3:
            Circle c1 = new Circle();
            System.out.println("Enter the radius of the Circle:");
            c1.x=s.nextInt();
            c1.printarea();
            break;

            default:System.err.println("Enter a valid Input!");
        }

    }
}