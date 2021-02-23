public class Sphere {
    private Double diameter;

    public Sphere(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getVolume() {
        return (4/3) * Math.PI * Math.pow(diameter/2,3);
    }

    public Double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(diameter/2,2);
    }

    public String toString() {
        return diameter + " diameter, " + getVolume() + " volume, " + getSurfaceArea() + " surface area.";
    }
}
