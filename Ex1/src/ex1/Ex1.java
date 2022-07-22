/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author vidag
 */
public class Ex1 {

    /**
     * @param args
     */
    
    
    public static void main(String[] args) {
        
        Calcula.soma(2,2);
        Calcula.subtracao(2, 2);
        Calcula.multiplicacao(2, 2);
        Calcula.divisao(2, 2);
        
        Mensagem.obterMensagem(10);
        
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);
        
        Quadrilatero.area(2);
        Quadrilatero.area(2, 2);
        Quadrilatero.area(2, 2);
        Quadrilatero.area(2, 2, 3);
    }
    
}
