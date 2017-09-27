/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import carro.Carro;
import java.text.NumberFormat;

/**
 *
 * @author Loc
 */
public class TesteCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aceleracao = 500;
        Carro carro = new Carro();
        carro.partida();
        do {
            System.out.println(
            NumberFormat.getNumberInstance().format(carro.getVelocidade()));
            carro.aumentarVelocidade(aceleracao);
        } while (carro.getVelocidade() < 200);
        System.out.println("Velocidade final: " + NumberFormat.getNumberInstance().format(carro.getVelocidade())
        
        );
    
    }
    
}
