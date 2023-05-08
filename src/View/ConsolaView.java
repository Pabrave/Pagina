package View;


import java.util.ArrayList;
import java.util.Scanner;

public class ConsolaView {
    private ArrayList<Tarea> tareas;
    private Scanner scanner;

    public ConsolaView() {
        tareas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void mostrarTareas() {
        System.out.println("Lista de Tareas:");
        System.out.println("-----------------");
        for (int i = 0; i < tareas.size(); i++) {
            Tarea tarea = tareas.get(i);
            String estado = tarea.isCompleta() ? "COMPLETA" : "PENDIENTE";
        }
        System.out.println("-----------------");
    }

    public void agregarTarea() {
        System.out.println("Nueva Tarea:");
        System.out.println("------------");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        Tarea tarea = new Tarea(titulo, descripcion);
        tareas.add(tarea);
        System.out.println("Tarea agregada correctamente.");
    }

    public void marcarTareaComoCompleta() {
        System.out.print("Ingrese el número de tarea que desea marcar como completa: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        if (index >= 1 && index <= tareas.size()) {
            Tarea tarea = tareas.get(index - 1);
            tarea.setCompleta(true);
            System.out.println("Tarea marcada como completa.");
        } else {
            System.out.println("Número de tarea inválido.");
        }
    }

    public void ejecutar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("----------------------");
            System.out.println("1. Mostrar lista de tareas.");
            System.out.println("2. Agregar nueva tarea.");
            System.out.println("3. Marcar tarea como completa.");
            System.out.println("4. Salir.");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.println("----------------------");
            switch (opcion) {
                case 1:
                    mostrarTareas();
                    break;
                case 2:
                    agregarTarea();
                    break;
                case 3:
                    marcarTareaComoCompleta();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ConsolaView gestorTareas = new ConsolaView();
        gestorTareas.ejecutar();
    }

    private static class Tarea {

        public Tarea() {
        }

        private Tarea(String titulo, String descripcion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean isCompleta() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setCompleta(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
