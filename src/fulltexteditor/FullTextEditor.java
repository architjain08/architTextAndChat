/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fulltexteditor;

/**
 *
 * @author Abhishek
 */
public class FullTextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // MyServer m = new MyServer();
        MainWindow MW = new MainWindow();
        MW.setVisible(true);
        MW.setDefaultCloseOperation(MainWindow.EXIT_ON_CLOSE);
    }
    
}
