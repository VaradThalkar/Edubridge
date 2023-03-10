
class Sphere extends ThreeD {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }

    @Override
    public void resize(double percentage) {
        radius *= (1 - percentage);
    }

    @Override
    public void display() {
        System.out.println("Sphere with radius: " + radius + " and Volume: " + getVolume());
    }
}