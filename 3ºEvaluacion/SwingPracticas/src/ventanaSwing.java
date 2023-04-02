
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ventanaSwing extends JFrame {

    public ventanaSwing() {
        
        //parametros del frame (marco)
        this.setVisible(true);
        this.setSize(400, 400);
        this.setLocation(150, 30);
        this.setTitle("Hola Caracola");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //añadiendo informacion al Contenedor
        //creamos en contenedor
        JPanel contenedor = (JPanel) this.getContentPane();
        // creo una etiqueta
        JLabel etiqueta = new JLabel("Hola mundo");
        //añado la etiqueta al contenedor
        contenedor.add(etiqueta);
        // creamos un boton
        JButton salir = new JButton("Salir");
        // añadimos funcionalidad al Boton Salir 
        salir.addActionListener((e) -> {
            System.out.println("Se preciono el boton salir");
            System.exit(0);
        });
        // añadimos el boton al contenedor
        contenedor.add(salir);
        
        // doy color al fonde del contenedor
        contenedor.setBackground(Color.lightGray);
        
        //
        
        contenedor.setLayout(null);
        salir.setBounds(25, 75, 100, 50);
        etiqueta.setBounds(25, 25, 75, 20);
        
        
        //contenedor.setLayout(new FlowLayout());
        //contenedor.setLayout(new BorderLayout());
        
    }
    
    
    
}
