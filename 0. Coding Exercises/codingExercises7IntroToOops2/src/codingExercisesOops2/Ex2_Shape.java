package codingExercisesOops2;

abstract class Ex2_Shape {
    protected String name;

    public Ex2_Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}