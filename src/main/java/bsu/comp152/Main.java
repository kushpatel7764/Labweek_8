package bsu.comp152;

public class Main {
    public static void main(String[] args) {
        double[] arr = {0.0, 2.0, 3.0};
        double[] arr2 = {-1.0, 2.0, -1.0};

        Vctor vect1 = new Vctor(arr);
        Vctor vect2 = new Vctor(arr2);
        System.out.println(vect1.dotProduct(vect2));
        System.out.println(Math.pow(3.0, 2));
        System.out.println(vect1.geometricLength());
        System.out.println(Math.sqrt(14));
        System.out.println(vect1.addVector(vect2));
    }
}
