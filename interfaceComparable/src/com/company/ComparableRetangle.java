package com.company;

public class ComparableRetangle extends Retangle implements Comparable<ComparableRetangle> {
    public ComparableRetangle() {
    }
     public ComparableRetangle(double width, double length){
        super(width , length);
     }
    public ComparableRetangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public int compareTo(ComparableRetangle cr){
             if (getArea()>cr.getArea()) return 1;
             else if (getArea()<cr.getArea()) return -1;
             else return 0;
    }
}
