package Model;


public class Task {
    
    private String Titulo;
    private String Descripcion;
    private boolean completada;

    public Task(String titulo, String descripcion) {
        this.Titulo = titulo;
        this.Descripcion = descripcion;
        this.completada = false; // Inicialmente la tarea no está completada
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        String estado = completada ? "Completada" : "Pendiente";
        return Titulo + " - " + Descripcion + " (" + estado + ")";
    }
}
