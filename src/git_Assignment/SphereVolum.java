package git_Assignment;

public class SphereVolum  implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        double r = Double.valueOf(input);
        double volum2 =((double)4/3) * Math.PI * Math.pow(r,3) ;
        System.out.println("Sphere Volum : " + volum2);
    }
}
