package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    private static double getNamedInputDouble(Scanner scanner, String prompt) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println(prompt);
            String line = scanner.nextLine();

            String[] parts = line.split(",");
            if (parts.length != 2) {
                System.out.println("Format salah! Harap masukkan dalam format: nama, angka (contoh: lubangbesar, 7)");
                continue;
            }

            try {
                value = Double.parseDouble(parts[1].trim());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Angka tidak valid. Coba lagi.");
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM          : ");
        String nim = input.nextLine();

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println(nama);
        System.out.println(nim);
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        double R = getNamedInputDouble(input, "Isikan Radius   : (input pengguna dan angka)");
        double r = getNamedInputDouble(input, "Isikan radius   : (input pengguna dan angka)");

        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        torus.printInfo();
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");

        double rad = getNamedInputDouble(input, "Isikan radius   : (input pengguna dan angka)");

        Sphere sphere = new Sphere(rad);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");
    }
}