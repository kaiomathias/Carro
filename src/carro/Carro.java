/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import aspecto.Diferencial;
import aspecto.Ignicao;
import aspecto.Motor;
import aspecto.Roda;
import pecas.DiferencialVw;
import pecas.IgnicaoEl;
import pecas.MotorV12;
import pecas.RodaFireB;

/**
 *
 * @author Loc
 */
public class Carro implements Diferencial, Ignicao, Motor, Roda {
    private final Diferencial diferencial = new DiferencialVw();
    private final Ignicao ignicao = new IgnicaoEl();
    private final Motor motor = new MotorV12();
    private final Roda[] rodas = {new RodaFireB(),new RodaFireB(),new RodaFireB(),new RodaFireB()};    
    
    
    public Carro(){
        this.acoplarRodas(rodas);
        this.acoplarDiferencial(diferencial);
        this.acoplarMotor(motor);
        
    }
    @Override
    public void acoplarRodas(Roda[] rodas) {
            diferencial.acoplarRodas(rodas);
    }

    @Override
    public Roda[] getRodas() {
        return diferencial.getRodas();
    }

    @Override
    public void partida() {
        ignicao.partida();
    }

    @Override
    public void desligar() {
        ignicao.desligar();
    }

    @Override
    public void funcionar() {
        motor.funcionar();
    }

    @Override
    public boolean getLigado() {
        return motor.getLigado();
    }

    @Override
    public int getPotencia() {
        return motor.getPotencia();
    }

    @Override
    public void setPotencia(int potencia) {
        motor.setPotencia(potencia);
    }

    @Override
    public void aumentarVelocidade(double porcentagem) {
motor.aumentarVelocidade(porcentagem); 
    }

    @Override
    public void diminuirVelocidade(double porcentagem) {
        motor.diminuirVelocidade(porcentagem);
    }

    @Override
    public void acoplarDiferencial(Diferencial diferencial) {
        motor.acoplarDiferencial(diferencial);
    }

    @Override
    public void girar(double velocidade) {
        //empurrar carro desligado.
    }

    @Override
    public double getVelocidade() {
        return diferencial.getRodas()[0].getVelocidade();
    }

    @Override
    public void acoplarMotor(Motor motor) {
        ignicao.acoplarMotor(motor);
    }
    
}
