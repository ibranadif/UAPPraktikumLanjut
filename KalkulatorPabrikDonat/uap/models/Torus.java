package uap.models;

import uap.bases.DonatBase;

public class Torus extends DonatBase {
    private double R;
    private double r;

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 2 * PI * R * (PI * r * r);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * R * r;
    }
}