package org.hbrs.se1.ws21.uebung11;

public class MyPoint {

    double x, y;
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals( Object object ) {
        if (object == null) return false;
        if (! ( object instanceof MyPoint) ) return false;
        MyPoint myPoint = (MyPoint) object;
        if ( this.x == myPoint.x
                && this.y == myPoint.y  ) {
            return true;
        } else {
            return false;
        }
    }
}
