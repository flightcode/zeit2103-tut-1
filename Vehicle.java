import java.util.Date;

public class Vehicle {
    private String rego;
    private String make;
    private String model;
    private int year;
    private int odometer;
    private Date lastService;
    private int odometerAtLastService;

    public Vehicle(String rg, String mk, String mod, int yr) {
        rego = rg;
        make = mk;
        model = mod;
        year = yr;
    }

    public int getOdometer() {
        return odometer;
    }

    public Date getLastServiceDate() {
        return lastService;
    }

    public int getOdometerAtLastService() {
        return odometerAtLastService;
    }

    public void updateOdo(int add) {
        odometer += add;
    }
    
    public void serviceDone() {
        odometerAtLastService = odometer;
        lastService = new Date();
    }

    public boolean serviceDue() {
        if(odometer - odometerAtLastService > 12500) {
            return true;
        }
        return false;
    }

    public String toString() {
        String desc;
        desc = "a " + year + " " + make + " " + model + " with rego " + rego + " and odometer " + odometer + " serviced on " + lastService + " at " + odometerAtLastService + " (Due: " + serviceDue() + ")";
        return desc;
    }

    public static void main (String[] args) {
        Vehicle carl = new Vehicle("YET123", "Subaru", "Forester", 2007);
        carl.serviceDone();
        carl.updateOdo(1200);
        System.out.println(carl);
        carl.serviceDone();
        carl.updateOdo(100);
        System.out.println(carl);
        carl.updateOdo(100000);
        System.out.println(carl);
    }
}
