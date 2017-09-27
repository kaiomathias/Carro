/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecas;

import aspecto.Ignicao;
import aspecto.Motor;

/**
 *
 * @author Loc
 */
public class IgnicaoEl implements Ignicao {
    
       @Override
    public void acoplarMotor(Motor motor) {
        this.motor = motor;
    }
    
    private Motor motor;
    @Override
    public void partida() {
           motor.setPotencia(8000);
           motor.funcionar();
           System.out.println("O motor com potência " + motor.getPotencia() + " foi ligado!");
    }

    @Override
    public void desligar() {
        motor.desligar();
        System.out.println("O motor foi desligado!");
    }

 
    
    
}
