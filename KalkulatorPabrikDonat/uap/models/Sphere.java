package uap.models;

import uap.bases.DonatBase;

public class Sphere extends DonatBase {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * r * r * r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * r * r;
    }
}