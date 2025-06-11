package entites;

import java.util.Scanner;

public class Car {
    public String model;
    public String mark;
    public String color;
    public int year;
    public double price;

    public void lerDados(Scanner sc) {
         System.out.println("Informe o modelo do carro: ");
        model = sc.nextLine();
        System.out.println("Informe a marca do carro: ");
        mark = sc.nextLine();
        System.out.println("Informe a cor do carro: ");
        color = sc.nextLine();
        System.out.println("Informe o ano do carro: ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o preço do carro: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    public void dados(){
        System.out.println("Modelo: " + model);
        System.out.println("Marca: " + mark);
        System.out.println("Cor: " + color);
        System.out.println("Ano: " + year);
        System.out.println("Preço: " + String.format("%.2f", price));
        System.out.println("-----------------------------");
    }
}
