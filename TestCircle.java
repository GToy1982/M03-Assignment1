public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        // Example usage
        System.out.println("Comparison result: " + circle1.compareTo(circle2));
        System.out.println("Equality check: " + circle1.equals(circle2));
    }
}
