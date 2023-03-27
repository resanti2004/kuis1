public class Main {
    public static void main(String[] args) {
            Cylinder cylinder1 = new Cylinder();
            Cylinder cylinder2 = new Cylinder(8);
            Cylinder cylinder3 = new Cylinder(8, 14);
            //toString
            System.out.println(cylinder1);
            System.out.println(cylinder2);
            System.out.println(cylinder3);
            System.out.println();

            //tabung 1
            cylinder1.setRadius(6);
            System.out.println("Radius tabung1 = " + cylinder1.getRadius());
            cylinder1.setColor("Purple");
            System.out.println("Warna tabung1 = " + cylinder1.getColor());
            cylinder1.setHeight(8);
            System.out.println("Tinggi tabung1 = " + cylinder1.getHeight());
            System.out.println("Area tabung1 = " + cylinder1.getArea());
            System.out.println("Volume tabung1 = " + cylinder1.getVolume());
            System.out.println(cylinder1);
            System.out.println();

            //tabung 2
            cylinder2.setRadius(9);
            System.out.println("Radius tabung2 = " + cylinder2.getRadius());
            cylinder2.setColor("Green");
            System.out.println("Warna tabung2 = " + cylinder2.getColor());
            cylinder2.setHeight(13);
            System.out.println("Tinggi tabung2 = " + cylinder2.getHeight());
            System.out.println("Area tabung2 = " + cylinder2.getArea());
            System.out.println("Volume tabung2 = " + cylinder2.getVolume());
            System.out.println(cylinder2);
            System.out.println();

            //tabung 3
            cylinder3.setRadius(8);
            System.out.println("Radius tabung3 = " + cylinder3.getRadius());
            cylinder3.setColor("Blue");
            System.out.println("Warna tabung3 = " + cylinder3.getColor());
            cylinder3.setHeight(10);
            System.out.println("Tinggi tabung3 = " + cylinder3.getHeight());
            System.out.println("Area tabung3 = " + cylinder3.getArea());
            System.out.println("Volume tabung3 = " + cylinder3.getVolume());
            System.out.println(cylinder3);
            System.out.println();

    }
}