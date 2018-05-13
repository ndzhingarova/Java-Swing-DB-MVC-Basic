/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usager
 */
public class ProduitDAO {

    private static String urlBD = "jdbc:derby://localhost:1527/magasin2",
            user = "magasin",
            password = "magasin";
    static Connection conn = null;
    private static Statement stmt = null;
    private static String sql = null;
    private static ResultSet rs = null;

    public static void getConnection() {
        try {
            conn = DriverManager.getConnection(urlBD, user, password);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public static ArrayList<Produit> getSelectAll() {
        ArrayList<Produit> allprods = new ArrayList<>();
        
        try {
            getConnection();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "select * from produit";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Produit p = new Produit(rs.getString(1), rs.getString(2));
                allprods.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return allprods;
    }

}
