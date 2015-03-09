class Rectangle {
    private int width, height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return this.width; }
    public int getHeight() { return this.height; }
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    public int area() {
        return this.width * this.height;
    }

    public int perimeter() {
        return 2 * this.width + 2 * this.height;
    }
}
