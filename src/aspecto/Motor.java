/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspecto;

/**
 *
 * @author Loc
 */
public interface Motor {
    void funcionar();
    void desligar();
    boolean getLigado();
    int getPotencia();
    void setPotencia(int potencia);
    void aumentarVelocidade(double porcentagem);
    void diminuirVelocidade(double porcentagem);
    void acoplarDiferencial(Diferencial diferencial);
    
    
}
