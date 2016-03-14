/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Macley
 */
public class animales extends Thread {

    String nombre;
    int limite;
    JLabel label;

    public animales(String nombre, int limite, JLabel label) {
        this.nombre = nombre;
        this.limite = limite;
        this.label = label;

    }
    int con = 2;

    public void run() {
        for (int i = 0; i < limite; i++) {

            try {
                Thread.sleep(40);//retraso  0.3*
            } catch (InterruptedException ex) {
                Logger.getLogger(animales.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        yield();
        label.setIcon(new ImageIcon(getClass().getResource("E00.gif")));
        System.out.println("ok");

    }

}
