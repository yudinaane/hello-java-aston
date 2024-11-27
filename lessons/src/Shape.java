public interface Shape {
        double getPerimeter();
        double getArea();
        String getFillColor();
        String getBorderColor();

    public default void gas() {
        System.out.println("Газ!");
    }

    public default void brake() {
        System.out.println("Тормоз!");
    }
    }
