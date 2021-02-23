public class Sphere {
    private Double diameter;

    public Sphere(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDiameter() {
        return this.diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getVolume() {
        return (4/3) * Math.PI * Math.pow(this.diameter/2,3);
    }

    public Double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(this.diameter/2,2);
    }

    public String toString() {
        return this.diameter + " diameter, " + this.getVolume() + " volume, " + this.getSurfaceArea() + " surface area.";
    }
}
