/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecas;

import aspecto.Diferencial;
import aspecto.Roda;

/**
 *
 * @author Loc
 */
public class DiferencialVw implements Diferencial {

    private Roda[] rodas;

    @Override
    public void acoplarRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    @Override
    public Roda[] getRodas() {
    return this.rodas;

    }

}
