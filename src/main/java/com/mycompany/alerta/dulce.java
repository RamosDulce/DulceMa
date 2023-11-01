/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alerta;

import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Dulce
 */
public class dulce {
    public static void main(String[] args) {
        String destino = "3209354307"; // Número de teléfono de destino
        String mensaje = "El dispositivo se ha dañado"; // Mensaje de alerta

        // Configuración del servidor SMTP y cuenta de correo
        String host = "smtp.gmail.com";
        String puerto = "587";
        String usuarioCorreo = "Dulcem0109@hotmail.com";
        String contrasenaCorreo = "Janner2005";

        // Propiedades de conexión
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", puerto);

        boolean dispositivoDanado = true;

        if (dispositivoDanado) {
            // Mostrar alerta de dispositivo dañado
            JOptionPane.showMessageDialog(null, "¡Alerta! Se ha detectado un dispositivo dañado.");
        }
        
    }
    
}