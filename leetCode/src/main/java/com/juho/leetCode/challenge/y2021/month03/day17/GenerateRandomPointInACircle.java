package com.juho.leetCode.challenge.y2021.month03.day17;

public class GenerateRandomPointInACircle {
    double RAD, XC, YC;
    public GenerateRandomPointInACircle(double radius, double x_center, double y_center) {
        RAD = radius;
        XC = x_center;
        YC = y_center;
    }
    public double[] randPoint() {
        double ang = Math.random() * 2 * Math.PI,
            hyp = Math.sqrt(Math.random()) * RAD,
            adj = Math.cos(ang) * hyp,
            opp = Math.sin(ang) * hyp;
        return new double[]{XC + adj, YC + opp};
    }
}