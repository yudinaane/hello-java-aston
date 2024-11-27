public class MainShape {
            public static void main(String[] args) {
                Circle circle = new Circle(5, "Red", "Black");
                Rectangle rectangle = new Rectangle(4, 6, "Blue", "Green");
                Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

                System.out.println("Circle:");
                System.out.println("Perimeter: " + circle.getPerimeter());
                System.out.println("Area: " + circle.getArea());
                System.out.println("Fill Color: " + circle.getFillColor());
                System.out.println("Border Color: " + circle.getBorderColor());

                System.out.println("\nRectangle:");
                System.out.println("Perimeter: " + rectangle.getPerimeter());
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Fill Color: " + rectangle.getFillColor());
                System.out.println("Border Color: " + rectangle.getBorderColor());

                System.out.println("\nTriangle:");
                System.out.println("Perimeter: " + triangle.getPerimeter());
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Fill Color: " + triangle.getFillColor());
                System.out.println("Border Color: " + triangle.getBorderColor());
            }
}