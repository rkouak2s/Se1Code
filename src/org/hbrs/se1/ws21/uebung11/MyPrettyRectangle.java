package org.hbrs.se1.ws21.uebung11;

public class MyPrettyRectangle {

    double x1, y1, x2, y2;
    public MyPrettyRectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean contains(MyPrettyRectangle rect) {

        return this.x1 <= rect.x1
                && this.y1 <= rect.y1
                && this.x2 >= rect.x2
                && this.y2 >= rect.y2;
    }

    public MyPoint getCenter() {

        return  new MyPoint((this.x1 + this.x2 )/ 2, (this.y1 + this.y2) / 2);
    }

    public double getArea() {

        return Math.abs((this.x1 - this.x2)
        * (this.y1 - this.y2));
    }

    public double getPerimeter() {

        return Math.abs((this.x1 - this.x2)
                + (this.y1 - this.y2)) * 2;
    }
}
