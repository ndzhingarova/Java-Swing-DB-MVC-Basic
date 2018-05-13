/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.util.ArrayList;
import java.util.Observable;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author usager
 */
public class ModeleProduit extends Observable{
    DefaultComboBoxModel listecode;
    ArrayList<Produit> listeProduit;
    int selection = 0;

    public ModeleProduit() {
        listecode = new DefaultComboBoxModel();
        listeProduit = new ArrayList<>();
    }

    public DefaultComboBoxModel getListecode() {
        return listecode;
    }
    
    public void initModele(){
        listeProduit = ProduitDAO.getSelectAll();
        for(Produit p : listeProduit){
            listecode.addElement(p.getCodeproduit());
        }
        if(listecode.getSize() > 0){
            selection = 0;
        } else {
            selection = -1;
        }
        setChanged();
        notifyObservers();
    }
    
    public void setSelection(int i){
        selection = i;
        
        setChanged();
        notifyObservers();
    }
    
    public String getDesignation(){
        if(selection == -1){
            return "";
        } else {
            return listeProduit.get(selection).getDesignationproduit();            
        }
        
    }
}
