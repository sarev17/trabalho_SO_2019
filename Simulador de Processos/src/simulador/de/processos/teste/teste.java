/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.de.processos.teste;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class teste {

    public void teste() {

        long start = System.currentTimeMillis();
        counter.countPrimes(1000000);
        long end = System.currentTimeMillis();

        System.out.println("Took : " + ((end - start) / 1000));

        JOptionPane.showMessageDialog(null, System.currentTimeMillis());
    }

}
