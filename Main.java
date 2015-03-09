class Main {
    public static void main(String args[]) {
        Rectangle square = new Rectangle(10, 10);

        System.out.println("Initial size: " + square.getWidth() + " x " + square.getHeight());
        System.out.println("Initial area: " + square.area());
        System.out.println("Initial perimeter: " + square.perimeter());

        square.setWidth(25);
        square.setHeight(25);

        System.out.println("\nNew size: " + square.getWidth() + " x " + square.getHeight());
        System.out.println("New area: " + square.area());
        System.out.println("New perimeter: " + square.perimeter());
    }
}
