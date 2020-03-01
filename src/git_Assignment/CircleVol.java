package git_Assignment;

public class CircleVol implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {

        double radius =Double.parseDouble(input);
        double pi= Math.PI;
        double fot = 4.0/3.0;
        double circleVol =fot * (pi * Math.pow(radius, 3));


        System.out.println("the volume of the ball whose circle radius is " + radius + " = " + circleVol + "\n" );

    }
}
