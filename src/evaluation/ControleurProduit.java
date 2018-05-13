/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

/**
 *
 * @author Le Padre
 */
public class ControleurProduit {
    
    ModeleProduit modele = null;

    public ControleurProduit(ModeleProduit m) {
        modele = m;
    }

    void setSelection(int i) {
        modele.setSelection(i);
    }
    
    
}
