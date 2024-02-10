public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
        // Default constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        // Implementing Comparable interface to compare circles based on their radii
        if (this.radius < otherCircle.radius) {
            return -1;
        } else if (this.radius > otherCircle.radius) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        // Overriding equals method to compare Circle objects based on their radii
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle otherCircle = (Circle) obj;
        return Double.compare(otherCircle.radius, radius) == 0;
    }

}

