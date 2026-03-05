enum tipo_categoria {
     COMEDIA, TERROR, ACCION, CIENCIA_FICCION, AVENTURA;
}

public class Pelicula {
    private int id;
    private String titulo;
    private String director;
    private int calificacion;
    private boolean disponible;
    private tipo_categoria categoria;

    public Pelicula(int id, String titulo, String director, boolean disponible, tipo_categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.calificacion = 16;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    public Pelicula(int id, String titulo, String director, int calificacion, boolean disponible, tipo_categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.calificacion = calificacion;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public tipo_categoria getCategoria() {
        return categoria;
    }

    public boolean aptaParaTodoPublico() {
        return (calificacion < 7);
    }

    public boolean alquilar() {
        if (disponible) {
            this.disponible = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver() {
        if (!disponible) {
            this.disponible = false;
            return true;
        } else {
            return false;
        }
    }
}