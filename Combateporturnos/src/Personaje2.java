public class Personaje2 {
    int PS;
    String Nombre;
    Armas equipo;

    public Personaje2() {
    }

    public Personaje2(int PS, String nombre, Armas equipo) {
        this.PS = PS;
        Nombre = nombre;
        this.equipo = equipo;
    }

    public int getPS() {
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Armas getEquipo() {
        return equipo;
    }

    public void setEquipo(Armas equipo) {
        this.equipo = equipo;
    }
}
