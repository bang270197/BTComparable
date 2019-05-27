package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.5);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle("blue", false, 2.5);
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }
        System.out.println("\n\n");
        Arrays.sort(comparableCircles);
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }
        System.out.println("\n\n");
        ////////////////////////////////////////////////////
        ComparableRetangle[] comparableRetangles =new ComparableRetangle[3];
        comparableRetangles[0]=new ComparableRetangle(2.0,3.0);
        comparableRetangles[1]=new ComparableRetangle();
        comparableRetangles[2]=new ComparableRetangle("pink",true,4.0,3.0);
         for (ComparableRetangle comparableRetangle : comparableRetangles){
             System.out.println(comparableRetangle);
         }
        System.out.println("\n\n");
         Arrays.sort(comparableRetangles);
         for (ComparableRetangle comparableRetangle: comparableRetangles){
             System.out.println(comparableRetangle);
         }
         //////////////////////////////////////
        System.out.println("\n\n");
        ComparableSquare[] comparableSquares=new ComparableSquare[3];
         comparableSquares[0]=new ComparableSquare();
         comparableSquares[1]=new ComparableSquare(4);
         comparableSquares[2]=new ComparableSquare("violet",true,6);
         for (ComparableSquare comparableSquare:comparableSquares){
             System.out.println(comparableSquare);
         }
         Arrays.sort(comparableSquares);
        System.out.println("\n\n");
        for (ComparableSquare comparableSquare:comparableSquares){
            System.out.println(comparableSquare);
        }
    }
}
