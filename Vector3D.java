public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double newX, double newY, double newZ) {
        x = newX;
        y = newY;
        z = newZ;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ", " + String.format("%.2f", z) + ")";
    }

    public static double getMagnitude(double x, double y, double z) {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(3.0,4.0,5.0);
        System.out.println("x = " + vector1.getX() + ", y = " + vector1.getY() + ", z = " + vector1.getZ());
        System.out.println("Vector 1: " + vector1.toString());
        System.out.print("The magnitude is ");
        System.out.println(String.format("%.2f", getMagnitude(vector1.getX(), vector1.getY(), vector1.getZ())));
    }
}