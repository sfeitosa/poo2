/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhauniversidade;

/**
 *
 * @author samuel
 */
public class MinhaUniversidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Professor p1 = new Professor();
        
        p1.setNome("Samuel");
        
        p1.aumentaSalario(2);
        p1.aumentaSalario(200.0);
        
        System.out.println("Informações do Professor 1");
        System.out.println(p1.toString());
                
    }
    
}
