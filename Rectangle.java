class Rectangle {
    public int width, height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }

    public int perimeter() {
        return 2 * this.width + 2 * this.height;
    }
}
