/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

/**
 *
 * @author Le Padre
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ModeleProduit me1 = new ModeleProduit();  
        ControleurProduit ce1 = new ControleurProduit(me1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueProduit(ce1, me1).setVisible(true);
            }
        });
    }
    
}
