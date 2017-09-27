/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecas;

import aspecto.Roda;

/**
 *
 * @author Loc
 */
public class RodaFireB implements Roda {
 private double velocidade;
    @Override
    public void girar(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public double getVelocidade() {
        return this.velocidade;
        
    }
    
}
