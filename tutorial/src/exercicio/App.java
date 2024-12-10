package exercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Travesseiro travesseiro = new Travesseiro(null, null, null, null, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor de seu travesseiro: ");
        String cor = scanner.nextLine();
            travesseiro.setCor(cor);
            System.out.println("A cor de seu travesseiro é "+travesseiro.getCor());

        System.out.println("Digite o tamanho de seu travesseiro: ");
        String tamanho = scanner.nextLine();
            travesseiro.setTamanho(tamanho);
            System.out.println("O tamanho de seu travesseiro é: "+travesseiro.getTamanho());
            
        System.out.println("Digite o formato de seu travesseiro: ");
        String formato = scanner.nextLine();
            travesseiro.setFormato(formato);
            System.out.println("O formato de seu travesseiro é: "+travesseiro.getFormato());

        System.out.println("Digite o material de seu travesseiro: ");
        String material = scanner.nextLine();
            travesseiro.setMaterial(material);
            System.out.println("O material de seu travesseiro é: "+travesseiro.getMaterial());

        System.out.println("Digite o peso de seu travesseiro: ");
        double peso = scanner.nextDouble();
            travesseiro.setPeso(peso);
            if (peso < 0) {
                System.out.println("Valor inválido");
            } else{
            System.out.println("O peso de seu travesseiro é: "+travesseiro.getPeso());
            }

            System.out.println("Deseja afofar o travesseiro?");
                scanner.next();
                travesseiro.afofar();

            travesseiro.cair();

            travesseiro.jogar();

            travesseiro.amassar();
        }   
    }