public class SphereDriver {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(3.0);
        Sphere s2 = new Sphere(4.5);
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        s1.setDiameter(4.5);
        s2.setDiameter(6.0);
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
