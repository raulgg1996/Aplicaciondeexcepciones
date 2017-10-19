import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alumnos on 19/10/2017.
 */
public class FormularioExcepcionses {
    private JButton button1;
    private JTextField num1;
    private JPanel panel1;
    private JTextField num2;
    private int res;

    public FormularioExcepcionses() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               // System.out.println("Hola "+ nombre.getText())
                JOptionPane.showMessageDialog(null,"Quiero dividir:"+ num1.getText()+" y "+ num2.getText());
               // JOptionPane.showMessageDialog(null,"num2:"+ num2.getText());
               // res=num1/num2;


            }
        });
    }

    public static void main(String[] args)
    {
            FormularioExcepcionses formulario=new FormularioExcepcionses();
            JFrame ventana=new JFrame();
            ventana.setContentPane(formulario.panel1);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);

    }
}
