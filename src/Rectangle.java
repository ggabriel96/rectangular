/*
 * This file is part of rectangular.
 *
 *  rectangular is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  rectangular is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with rectangular. If not, see <http://www.gnu.org/licenses/>.
 */

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
        return (this.width + this.height) * 2;
    }
}
