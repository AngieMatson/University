import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public static void main(String[] args) {
        // Creamos la interfaz gráfica de usuario
        JFrame frame = new JFrame("Datos de usuario");
        JPanel panel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel();

        JLabel idLabel = new JLabel("ID:");
        JTextField idText = new JTextField(10);

        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreText = new JTextField(20);

        JLabel direccionLabel = new JLabel("Direccion:");
        JTextField direccionText = new JTextField(20);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoText = new JTextField(20);

        JButton agregarButton = new JButton("Agregar");
        JButton guardarButton = new JButton("Guardar");

        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreText.getText();
                int id = Integer.parseInt(idText.getText());
                String direccion = direccionText.getText();
                int telefono = Integer.parseInt(telefonoText.getText());
                Usuario usuario = new Usuario(nombre,id,direccion, telefono );

                listaUsuarios.add(usuario);

                idText.setText("");
                nombreText.setText("");
                direccionText.setText("");

            }
        });

        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(listaUsuarios);
                try {
                    FileWriter file = new FileWriter("users.json");
                    file.write(json);
                    file.close();
                    JOptionPane.showMessageDialog(panel, "Datos guardados correctamente");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(panel, "Error al guardar los datos");
                }

                listaUsuarios.clear();
            }
        });

        inputPanel.add(nombreLabel);
        inputPanel.add(nombreText);

        inputPanel.add(idLabel);
        inputPanel.add(idText);

        inputPanel.add(direccionLabel);
        inputPanel.add(direccionText);

        inputPanel.add(telefonoLabel);
        inputPanel.add(telefonoText);

        inputPanel.add(agregarButton);

        panel.add(inputPanel, BorderLayout.CENTER);
        panel.add(guardarButton, BorderLayout.SOUTH);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}