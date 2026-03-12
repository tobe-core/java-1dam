public class Club {
    private Jugador[] listaJugadores = new Jugador[5];
    private int cant_jugadores = 0;

    public void MostrarJugadores () {
        for (int i = 0; i < cant_jugadores; i++) {
            IO.println("Nombre: " + listaJugadores[i].getNombre() + "\nNumero Camiseta: " + listaJugadores[i].getNCamiseta() + "\nNumero Goles: " + listaJugadores[i].getNGoles() + "\nPosicion: " + listaJugadores[i].getPos());
        }
    }
}