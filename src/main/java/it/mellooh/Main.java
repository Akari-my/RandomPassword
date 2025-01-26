package it.mellooh;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lettere = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nummeri = "0123456789";
        String simboli = "!@#$%^&*()_-+=<>?/{}[]~|";
        String combina = lettere + nummeri + simboli;

        SecureRandom random = new SecureRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza della password desiderata: ");
        int lungezzaPassword = scanner.nextInt();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < lungezzaPassword; i++){
            int randomIndex = random.nextInt(combina.length());
            password.append(combina.charAt(randomIndex));
        }

        System.out.println("Password generata: " + password.toString());
    }
}