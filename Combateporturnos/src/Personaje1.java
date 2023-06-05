public class Personaje1 {
    int PS;
    String Nombre;
    Armas equipo;

    public Personaje1() {
    }

    public Personaje1(int PS, String nombre, Armas equipo) {
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
