package uap.bases;

import uap.interfaces.Printable;

public abstract class DonatBase implements Printable {
    protected static final double PI = 22.0 / 7.0;
    protected static final double DENSITY_GR_PER_CM3 = 8.03;

    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public double getMass() {
        return getVolume() * DENSITY_GR_PER_CM3;
    }

    public double getMassKg() {
        return getMass() / 1000;
    }

    public int getBiayaKirim() {
        return (int) Math.ceil(getMassKg()) * 10000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f cm3%n", getVolume());
        System.out.printf("Luas permukaan  : %.2f cm2%n", getSurfaceArea());
        System.out.printf("Massa           : %.2f gr%n", getMass());
        System.out.printf("Massa dalam kg  : %.2f kg%n", getMassKg());
        System.out.printf("Biaya kirim     : Rp%d%n", getBiayaKirim());
    }
}