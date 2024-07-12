import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Buscar {
    public JPanel buscar;
    public JTextArea instruccion;
    public JButton busquedaprodu;
    public JButton btnregresar;
    public JFrame buscoFrame;

    public Buscar(JFrame frame) {
            this.buscoFrame = frame;
    }

   /* buscar = new JPanel(new BorderLayout());
    buscar = new JButton("Regresar");
    buscar.add(btnregresar, BorderLayout.SOUTH);*/

    public Buscar() {
        busquedaprodu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/productos_cp";
                String user = "root";
                String password = "123456";

                try {
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(instruccion.getText());
                    List<String[]> rows = new ArrayList<>();

                    while (resultSet.next()) {
                        String[] row = new String[5];
                        row[0] = resultSet.getString("id");
                        row[1] = resultSet.getString("nombre");
                        row[2] = resultSet.getString("descripcion");
                        row[3] = resultSet.getString("precio");
                        row[4] = resultSet.getString("Cantidad");
                        rows.add(row);
                    }
                    JTable table = new JTable(rows.toArray(new String[0][]), new String[]{"ID", "Nombre", "Descripcion", "Precio", "Stock"});
                    JScrollPane scrollPane = new JScrollPane(table);
                    JOptionPane.showMessageDialog(null, scrollPane);
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        });


        btnregresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame newFrame = new JFrame("Registar Productos - Richard Padilla");
                newFrame.setContentPane(new Registrar(newFrame).registro);
                newFrame.setSize(600, 400);
                newFrame.setPreferredSize(new Dimension(600, 400));
                newFrame.setMinimumSize(new Dimension(600, 400));
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.pack();
                newFrame.setVisible(true);

            }
        });
    }
}
