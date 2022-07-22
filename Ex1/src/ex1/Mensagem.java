/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author vidag
 */
public class Mensagem {
    public static void obterMensagem(int hora) {
        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomDia();
            case 13, 14, 15, 16, 17 -> mensagemBoaTarde();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> mensagemBoaNoite();
            default -> System.out.println("Hora Invalida");
        }
        
    }

    private static void mensagemBomDia() {
        System.out.println("Bom dia");
    }

    private static void mensagemBoaTarde() {
        System.out.println("Boa Tarde");
    }

    private static void mensagemBoaNoite() {
        System.out.println("Boa noite");    
    }
}
