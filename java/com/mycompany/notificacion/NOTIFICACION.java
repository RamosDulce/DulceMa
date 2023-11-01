/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notificacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Dulce
 */
public class NOTIFICACION {

    public static void main(String[] args) {
       // Simulación de detección de un dispositivo dañado
        boolean dispositivoDanado = true;

        if (dispositivoDanado) {
            // Mostrar alerta de dispositivo dañado
            JOptionPane.showMessageDialog(null, "¡Alerta! Se ha detectado un dispositivo dañado.");
            

   
        String dispositivo = JOptionPane.showInputDialog("Ingrese el nombre del dispositivo:");
        
        // Simulando la verificación del dispositivo
        boolean estaDanado = dispositivo.equals("impresora");
        
        if (estaDanado) {
            JOptionPane.showMessageDialog(null, "El dispositivo " + dispositivo + " está dañado.");
        } else {
            JOptionPane.showMessageDialog(null, "El dispositivo " + dispositivo + " está en buen estado.");
        }
        }
    }
}
    
