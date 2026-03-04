public class Peliculas {
    private int id;
    private String titulo;
    private String nombreDirector;
    private int calificacion;
    private boolean disponible;
    private Categorias categoria;

    public Peliculas(int id, String titulo, String nombreDirector, int calificacion, boolean disponible, Categorias categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nombreDirector = nombreDirector;
        this.calificacion = calificacion;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    public Peliculas(int id, String titulo, String nombreDirector, boolean disponible, Categorias categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nombreDirector = nombreDirector;
        this.calificacion = 16;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public boolean aptaParaTodoPublico() {
        if (calificacion >= 18) {
            return false;
        } else {
            return true;
        }
    }

    public boolean alquilar() {
        if (disponible) {
            this.disponible = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver() {
        if (!disponible) {
            this.disponible = true;
            return true;
        } else {
            return false;
        }
    }
}