/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.de.processos;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author andre
 */
public class SimuladorDeProcessos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TelaPrincipal tp = new TelaPrincipal();
        //tp.setVisible(true);
        
          BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

      
        
        
    }
    
}
