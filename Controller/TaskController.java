package Controller;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TaskController {
    
    private JFrame ventana;
    private JPanel panel;
    private JTextArea areaTexto;
    private JTextField campoTitulo;
    private JTextField campoDescripcion;
    private ArrayList<Tarea> tareas;

    public TaskController() {
        tareas = new ArrayList<>();

        // Crear la ventana principal
        ventana = new JFrame("Lista de Tareas");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para colocar los componentes
        panel = new JPanel(new BorderLayout());

        // Crear un área de texto para mostrar la lista de tareas
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);
        panel.add(scroll, BorderLayout.CENTER);

        // Crear campos de texto para agregar nuevas tareas
        campoTitulo = new JTextField(20);
        campoDescripcion = new JTextField(20);
        JButton botonAgregar = new JButton("Agregar Tarea");
        botonAgregar.addActionListener(e -> agregarTarea());

        // Crear un panel para los campos de texto y el botón
        JPanel panelAgregar = new JPanel();
        panelAgregar.add(new JLabel("Título: "));
        panelAgregar.add(campoTitulo);
        panelAgregar.add(new JLabel("Descripción: "));
        panelAgregar.add(campoDescripcion);
        panelAgregar.add(botonAgregar);
        panel.add(panelAgregar, BorderLayout.SOUTH);

        // Agregar el panel a la ventana y mostrar todo
        ventana.add(panel);
        ventana.setVisible(true);
    }

    private void agregarTarea() {
        String titulo = campoTitulo.getText();
        String descripcion = campoDescripcion.getText();
        if (!titulo.isEmpty() && !descripcion.isEmpty()) {
            Tarea tarea = new Tarea(titulo, descripcion);
            tareas.add(tarea);
            campoTitulo.setText("");
            campoDescripcion.setText("");
            mostrarTareas();
        }
    }

    private void mostrarTareas() {
        areaTexto.setText("");
        for (Tarea tarea : tareas) {
            areaTexto.append(tarea.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        new TaskController();
    }

    private static class Tarea {

        public Tarea() {
        }

        private Tarea(String titulo, String descripcion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
