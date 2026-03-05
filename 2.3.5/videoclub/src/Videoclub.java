public class Videoclub {
    private Pelicula[] listaPelicula = new Pelicula[10];
    private int num_peliculas = 0;

    public void NuevaPelicula(Pelicula p) {
        if (num_peliculas < 10) {
            listaPelicula[num_peliculas] = p;
            num_peliculas++;
        }
    }

    public void Mostrar() {
        for (int i = 0; i < num_peliculas; i++) {
            IO.println("Titulo: " + listaPelicula[i].getTitulo());
        }
    }

    public void Mostrar(tipo_categoria categoria) {
        for (int i = 0; i < num_peliculas; i++) {
            if (categoria.equals(listaPelicula[i].getCategoria())) {
                IO.println("Titulo: " + listaPelicula[i].getTitulo());
            }
        }
    }

    public void Alquilar(String t) {
        for (int i = 0; i < num_peliculas; i++) {
            if (t.equals(listaPelicula[i].getTitulo())) {
                if (listaPelicula[i].alquilar()) {
                    IO.println("Pelicula alquilada");
                } else {
                    IO.println("Lo siento, ...");
                }
                return;
            }
        }
    }
}
