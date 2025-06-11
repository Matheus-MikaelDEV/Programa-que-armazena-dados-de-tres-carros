package application;

import java.util.Locale;
import java.util.Scanner;
import entites.Car;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Car x, y, z;
        x = new Car();
        y = new Car();
        z = new Car();

        System.out.println("Nesse programa você ira informar dados do carro x, y e z.");

        System.out.println("Carro X:");
        x.lerDados(sc);

        System.out.println("Carro Y:");
        y.lerDados(sc);

        System.out.println("Carro Z:");
        z.lerDados(sc);

        x.dados();
        y.dados();
        z.dados();
    }
}