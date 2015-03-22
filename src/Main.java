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
