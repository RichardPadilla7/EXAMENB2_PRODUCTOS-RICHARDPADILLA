import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registrar {
    public JPanel registro;
    public JTextArea titulo;
    public JTextPane codigoDelProductoTextPane;
    public JTextField textField1;
    public JTextPane nombreDelProductoTextPane;
    public JTextField textField2;
    public JTextPane descripcionDelProductoTextPane;
    public JTextField textField3;
    public JTextPane precioTextPane;
    public JTextField textField4;
    public JTextPane cantidadTextPane;
    public JTextField textField5;
    public JTextPane categoriaTextPane;
    public JTextField textField6;
    public JButton registarElProductoButton;
    public JButton buscarProductoButton;
    public JFrame registroFrame;

    public Registrar(JFrame frame) {
        this.registroFrame = frame;
    }

    public Registrar() {
        registarElProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        buscarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JFrame frame = new JFrame("Buscar Productos - Richard Padilla");
                frame.setContentPane(new Buscar(frame).buscar);
                frame.setSize(600, 400);
                frame.setPreferredSize(new Dimension(600, 400));
                frame.setMinimumSize(new Dimension(600, 400));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
