public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return this.height*Math.PI*super.getRadius()*super.getRadius();
    }
    public String toString(){
        return "Radius " + super.getRadius() +"\n"+
                " Area " + super.getArea()+"\n" +
                " Volume " + getVolume()+"\n" +
                " Color " + super.getColor();
    }

}
