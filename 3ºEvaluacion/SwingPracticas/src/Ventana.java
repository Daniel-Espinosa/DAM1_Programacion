/*pruebas de Swing en casa*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{

    public Ventana(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ventana 1");
        setBounds(30, 70, 400, 300);
        setResizable(false);
        
        Lamina lamina1 = new Lamina();
        add(lamina1);
    }
    
}

class Lamina extends JPanel implements ActionListener{
    
    JButton boton1 = new JButton("Boton 1");
    // le doy funcionalidad al boton con el listener
    

    // constructor por defecto de la lamina en la cual añadiremos los elementos.
    public Lamina() {
        // añado el boton a la lamina
        add(boton1);
        // le doy funcionalidad al boton con el listener, es necesario implementar la Clase Action Listener
        // Tocaria realizar un overrid de actionPerformed para realizar la accion que queramos.
        boton1.addActionListener(this);
    }
    

    // metodo paintComponent que permite crear graficos y textos    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawString("Primera linea de texto", 25, 25);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        setBackground(Color.RED);
        
    }
    
    
}