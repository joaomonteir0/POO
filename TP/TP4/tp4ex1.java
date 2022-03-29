class Complex {
    double n;
    double img;

    public Complex(double n, double img) {
        this.n = n;
        this.img = img;
    }

    public double getN() {
        return n;
    }

    public double getImg() {
        return img;
    }
}

class Ponto3D {
    double x;
    double y;
    double z;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public void printar() {
        System.out.printf("(%.2f, %.2f, %.2f)", x, y, z);
    }

}

public class tp4ex1 {
    public static void main(String[] args) {

        // completar código
        // 2 instâncias de Complex, 2 de Point3D
        Complex first = new Complex(10, 20);
        Complex second = new Complex(10, 20);

        Ponto3D prim = new Ponto3D(10, 10, 10);
        Ponto3D seg = new Ponto3D(10, 10, 10);

        Ponto3D vetorzinho[] = new Ponto3D[10];

        System.out.printf("(%.2f, %.2f, %.2f)", prim.getX(), prim.getY(), prim.getZ());

    }
}