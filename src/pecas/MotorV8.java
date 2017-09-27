/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecas;

import aspecto.Diferencial;
import aspecto.Motor;
import aspecto.Roda;

/**
 *
 * @author Loc
 */
public class MotorV8 implements Motor {

    private boolean ligado;
    private double velocidade = 1;
    private int potencia;
    private Diferencial diferencial;

    @Override
    public void funcionar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public boolean getLigado() {
        return this.ligado;
    }

    @Override
    public int getPotencia() {
        return this.potencia;
    }

    @Override
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void aumentarVelocidade(double porcentagem) {
        if (this.ligado) {
            this.velocidade += (velocidade * (porcentagem / 100));
            for (Roda r : diferencial.getRodas()) {
                r.girar(velocidade);
            }
        }
    }

    @Override
    public void diminuirVelocidade(double porcentagem) {
        if (this.ligado) {
            this.velocidade -= (velocidade * (porcentagem / 100));
            for (Roda r : diferencial.getRodas()) {
                r.girar(velocidade);
            }
        }
    }

    @Override
    public void acoplarDiferencial(Diferencial diferencial) {
        this.diferencial = diferencial;
    }

}
