/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unicauca.cuychair.gui;

import co.edu.unicauca.cuychair.gui.views.EntryView;
import javax.swing.JFrame;

/**
 *
 * @author Frdy
 */
public class CuyChairGUI {

    public static void main(String[] args) {
        System.out.println("Starting application");
        initApp();        
    }    
    
    /**
     * Inicializa la aplicación
     */    
    public static void initApp() {
        JFrame menu = new EntryView();  
        menu.setVisible(true);        
    }
    
    /**
     * Termina la aplicación
     */
    public static void terminate() {
        System.out.println("Ending Application");
    }
}
