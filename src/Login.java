import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public JPanel login;
    public JTextArea titulo;
    public JTextField userText;
    public JPasswordField passwordText;
    public JButton btnsesion;
    public JFrame loginFrame;

    public Login(JFrame frame) {
        this.loginFrame = frame;
    }

    public Login() {
        btnsesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String pass = new String(passwordText.getPassword());

                if (user.equals("Freddy") && pass.equals("Freddy123")) {
                    JOptionPane.showMessageDialog(null, "Credenciales correctas");

                    JFrame frame = new JFrame("Registar Productos - Richard Padilla");
                    frame.setContentPane(new Registrar(frame).registro);
                    frame.setSize(600, 400);
                    frame.setPreferredSize(new Dimension(600, 400));
                    frame.setMinimumSize(new Dimension(600, 400));
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);

                } else if (user.equals("Pablo") && pass.equals("Pablo123")) {
                    JOptionPane.showMessageDialog(null, "Credenciales correctas");

                    JFrame frame = new JFrame("Registar Productos - Richard Padilla");
                    frame.setContentPane(new Registrar(frame).registro);
                    frame.setSize(600, 400);
                    frame.setPreferredSize(new Dimension(600, 400));
                    frame.setMinimumSize(new Dimension(600, 400));
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);

                } else if (user.equals("David") && pass.equals("David123")) {
                    JOptionPane.showMessageDialog(null, "Credenciales correctas");


                    JFrame frame = new JFrame("Registar Productos - Richard Padilla");
                    frame.setContentPane(new Registrar(frame).registro);
                    frame.setSize(600, 400);
                    frame.setPreferredSize(new Dimension(600, 400));
                    frame.setMinimumSize(new Dimension(600, 400));
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta. ¡Intente de nuevo!");
                }

            }
        });
    }
}
