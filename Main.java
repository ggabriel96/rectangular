class Main {
    public static void main(String args[]) {
        Rectangle sq1;

        sq1 = new Rectangle();
        sq1.width = sq1.height = 10;

        System.out.println(sq1.width + " x " + sq1.height);
        System.out.println("Area: " + sq1.area());
        System.out.println("Perimeter: " + sq1.perimeter());
    }
}
