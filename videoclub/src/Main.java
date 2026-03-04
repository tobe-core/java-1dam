void main() {
    Scanner sc = new Scanner(System.in);
    Peliculas[] listaPeliculas = new Peliculas[10];

    boolean menu = true;
    int peliculas_cant_max = 10;
    int peliculas_cant = 0;

    do {
        IO.print("\n1. Nueva Pelicula\n2. Mostrar Peliculas\n3. Mostrar Peliculas por Categoria\n4. Alquilar Pelicula\n5. Devolver Pelicula\n");
        IO.print("> ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: IO.println("nueva pelicula"); break;
            case 2: IO.println("mostrar peliculas"); break;
            case 3: menu = false; break;
        }

    } while (menu);
}