package com.company;

public class ComparableSquare extends Square implements Comparable<ComparableSquare> {
public ComparableSquare(){}
public ComparableSquare(double side){
    super(side);
}
public ComparableSquare(String color, boolean filled,double side){
    super(color,filled,side);
}
public int compareTo(ComparableSquare cs){
    if (getSide()>cs.getSide()) return 1;
    else if (getSide()<cs.getSide()) return -1;
    else return 0;
}
}
