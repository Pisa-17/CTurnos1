public class Armas {
    int damage;
    String nombre;

    public Armas() {
    }

    public Armas(int damage, String nombre) {
        this.damage = damage;
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
