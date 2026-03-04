void main() {
    Scanner sc = new Scanner(System.in);
    Peliculas[] listaPeliculas = new Peliculas[10];

    boolean menu = true;
    int peliculas_max = 0;

    do {
        IO.print("\n1. Nueva Pelicula\n2. Mostrar Peliculas\n3. Mostrar Peliculas por Categoria\n4. Alquilar Pelicula\n5. Devolver Pelicula\n");
        IO.print("> ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                if (nuevaPelicula(sc, listaPeliculas, peliculas_max) > 0) {
                    IO.print("No se creo la pelicula");
                } else {
                    nuevaPelicula(sc, listaPeliculas, peliculas_max);
                }
                break;
            case 2:
                IO.print(listaPeliculas[peliculas_max]);
            case 3: menu = false; break;
        }

    } while (menu);
}

int nuevaPelicula(Scanner sc, Peliculas[] listaPeliculas, int peliculas_max) {
    String nueva_titulo, nueva_autor;
    int nueva_calificacion, seleccion_categoria;
    Categorias nueva_categoria = null;

    IO.print("Nueva Pelicula - Titulo > ");
    nueva_titulo = sc.next(); // REVISAR

    IO.print("Nueva Pelicula - Autor > ");
    nueva_autor = sc.nextLine();

    IO.print("Nueva Pelicula - Calificacion > ");
    nueva_calificacion = sc.nextInt();

    IO.print("Nueva Pelicula - Categoria\n1. COMEDIA\n2. TERROR\n3. ACCION\n4. CIENCIA_FICCION\n5. AVENTURA");
    seleccion_categoria = sc.nextInt();

    if (nueva_titulo.isBlank() || nueva_autor.isBlank() || String.valueOf(nueva_calificacion).isBlank() || String.valueOf(seleccion_categoria).isBlank()) {
        return 1;
    } else {
        switch (seleccion_categoria) {
            case 1: nueva_categoria = Categorias.COMEDIA; break;
            case 2: nueva_categoria = Categorias.TERROR; break;
            case 3: nueva_categoria = Categorias.ACCION; break;
            case 4: nueva_categoria = Categorias.CIENCIA_FICCION; break;
            case 5: nueva_categoria = Categorias.AVENTURA; break;
        }

        listaPeliculas[peliculas_max] = new Peliculas((peliculas_max + 1), nueva_titulo, nueva_autor, nueva_calificacion, true, nueva_categoria);

        return 0;
    }
}