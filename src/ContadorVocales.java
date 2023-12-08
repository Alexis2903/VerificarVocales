/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

public class ContadorVocales {
    public static void main(String[] args) {
        // Obtener una frase del usuario
        String cadena = JOptionPane.showInputDialog(null, "Ingresa una frase:");

        // Contar vocales
        contarVocales(cadena);

        // Contar palabras
        contarPalabras(cadena);

        // Reemplazar letras
        String cadenaReemplazada = reemplazarLetras(cadena);
        JOptionPane.showMessageDialog(null, "Frase con letras reemplazadas: " + cadenaReemplazada);

        // Crear cadena al revés
        String cadenaAlReves = invertirCadena(cadena);
        JOptionPane.showMessageDialog(null, "Frase al revés: " + cadenaAlReves);
    }

    public static void contarVocales(String cadena) {
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esVocal(caracter)) {
                switch (caracter) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Número de 'a': " + contadorA);
        JOptionPane.showMessageDialog(null, "Número de 'e': " + contadorE);
        JOptionPane.showMessageDialog(null, "Número de 'i': " + contadorI);
        JOptionPane.showMessageDialog(null, "Número de 'o': " + contadorO);
        JOptionPane.showMessageDialog(null, "Número de 'u': " + contadorU);
    }

    public static void contarPalabras(String cadena) {
        String[] palabras = cadena.split("\\s+");
        JOptionPane.showMessageDialog(null, "Número de palabras: " + palabras.length);
    }

    public static String reemplazarLetras(String cadena) {
        cadena = cadena.replace('o', '$');
        cadena = cadena.replace('a', '@');
        return cadena;
    }

    public static String invertirCadena(String cadena) {
        StringBuilder reverso = new StringBuilder(cadena);
        return reverso.reverse().toString();
    }

    public static boolean esVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

