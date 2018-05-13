/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

/**
 *
 * @author usager
 */
public class Produit {
    private String codeproduit;
    private String designationproduit;

    public Produit(String codeproduit, String designationproduit) {
        this.codeproduit = codeproduit;
        this.designationproduit = designationproduit;
    }

    public String getCodeproduit() {
        return codeproduit;
    }

    public String getDesignationproduit() {
        return designationproduit;
    }  
    
}
