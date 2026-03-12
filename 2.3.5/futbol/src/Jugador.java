enum posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO;
}

public class Jugador {
    private int id;
    private String nombre;
    private int edad;
    private int nCamiseta;
    private int nGoles;
    private int salario;
    private posicion pos;

    public Jugador(int id, String nombre, int edad, int nCamiseta, int nGoles, int salario, posicion pos) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nCamiseta = nCamiseta;
        this.nGoles = nGoles;
        this.salario = salario;
        this.pos = pos;
    }

    public Jugador(int id, String nombre, int edad, int nCamiseta, int nGoles, posicion pos) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nCamiseta = nCamiseta;
        this.nGoles = nGoles;
        this.salario = 1000;
        this.pos = pos;
    }

    public Jugador(int id, String nombre, int edad, int nCamiseta, int nGoles, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nCamiseta = nCamiseta;
        this.nGoles = nGoles;
        this.salario = salario;
        this.pos = posicion.DELANTERO;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNCamiseta() {
        return nCamiseta;
    }

    public int getNGoles() {
        return nGoles;
    }

    public posicion getPos() {
        return pos;
    }
}
