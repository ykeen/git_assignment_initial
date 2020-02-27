package git_Assignment;

public class sphereArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

        double Radius = Double.parseDouble(input);
        double Area  = (4 * Math.PI * Radius * Radius);
        System.out.println("The Area of the sphere with radius " + Radius + " is "+ Area);
    }
}
