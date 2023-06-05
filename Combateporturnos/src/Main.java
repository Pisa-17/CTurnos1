import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Personaje1> Combate = new HashMap<>();
        Main m = new Main();
        m.cargadatos(Combate);
        m.menu();

    }

    public Main() {
    }

    public static void menu(){
        int input = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido al videojuego de combate por turnos");
            System.out.println("");
            System.out.println("1-JUGAR");
            System.out.println("2-ELEGIR ARMAS");
            System.out.println("3-ELEGIR RIVAL");
            System.out.println("");
            input = sc.nextInt();
            switch (input) {
                case 1: {
                    //juego();
                    break;
                }
                case 2:{
                    // weaponselect();
                    break;
                }
                case 3:{
                    // rivalselect();
                    break;
                }
            }
        }while(input != 9);

    }
    public void cargadatos(HashMap<Integer, Personaje1> Combate){
        // armas del juego
        Armas arma1 = new Armas(50, "Espada Épica");
        Armas arma2 = new Armas(30, "Arco Mágico");
        Armas arma3 = new Armas(22, "Varita de Fuego");
        Armas arma4 = new Armas(78, "Espada Épica +");
        Armas arma5 = new Armas(75, "Arco Mágico +");
        Armas arma6 = new Armas(30, "Varita de Fuego +");
        Armas arma7 = new Armas(150, "Espada Épica ++");
        Armas arma8 = new Armas(100, "Arco Mágico ++");
        Armas arma9 = new Armas(46, "Varita de Fuego ++");
        Armas arma10 = new Armas(70, "Espada de Hielo");
        Armas arma12 = new Armas(45, "Grimorio de Luz");
        Armas arma13 = new Armas(37, "Katana de Hojas");
        Armas arma14 = new Armas(2750, "Excalibur");
        Armas arma15 = new Armas(247, "Vara sagrada de Lasleigh");
        Armas arma16 = new Armas(1850, "Katana Dojigiri");
        Armas arma17 = new Armas(148, "Espada Tsunami");
        Armas arma18 = new Armas(179, "Rayo fulguroso");
        Armas arma19 = new Armas(3100, "Ascalon la Caza Dragones");
        Armas arma20 = new Armas(357, "Espada Demonica");
        Armas arma21 = new Armas(143, "Guadaña Fiera");
        Armas arma22 = new Armas(56, "Latigo de gigantes");
        Armas arma23 = new Armas(158, "Daga venenosa");
        Armas arma24 = new Armas(2544, "Tizona");
        Armas arma25 = new Armas(2135, "Guadaña del Tiempo");
        Armas arma26 = new Armas(350, "Filo de guerra");
        Armas arma27 = new Armas(849, "Espada magica");
        Armas arma28 = new Armas(2330, "Espadon de Luz de Luna");
        //Personajes jugables
        Personaje1 pj1 = new Personaje1(230000, "Arturo", arma14);
        Personaje1 pj2 = new Personaje1(23000, "Ladron", arma23);
        Personaje1 pj3 = new Personaje1(12000, "Ganadero", arma21);
        Personaje1 pj4 = new Personaje1(210000, "Ludwig", arma28);
        Personaje1 pj5 = new Personaje1(230000, "Samurai Fujimoto", arma16);
        Personaje1 pj6 = new Personaje1(270000, "Nicholas el Caza Dragones", arma19);
        Personaje1 pj7 = new Personaje1(20000, "Caballero simple", arma1);
        Personaje1 pj8 = new Personaje1(230000, "El Cid", arma24);
        //Poniendo personajes en el HashMap
        Combate.put(1, pj1);
        Combate.put(2, pj2);
        Combate.put(3, pj3);
        Combate.put(4, pj4);
        Combate.put(5, pj5);
        Combate.put(6, pj6);
        Combate.put(7, pj7);
        Combate.put(8, pj8);
        //Combate.put(9, pj9);
        //Combate.put(10, pj10);
        //Combate.put(11, pj11);
        //Combate.put(12, pj12);

    }
    public static void juego(HashMap<Integer, Personaje1> Combate, int idPersonaje1, int Personaje2){
        Personaje1 personaje1 = Combate.get(1);
        Personaje1 personaje2 = Combate.get(4);

        System.out.println("F-F-F-F-F-FIGHT!!!!");
        System.out.println(personaje1.Nombre + " PS: " + personaje1.PS + " vs " + personaje2.Nombre + " PS: " + personaje2.PS);

        boolean combateActivo = true;
        boolean turnoPersonaje1 = true;
        while(combateActivo){
            int input = 0;
            if(turnoPersonaje1) {
                System.out.println("--Turno del " + personaje1.Nombre + "--");
                System.out.println("Elige una opcion");
                System.out.println("1-Atacar");
                System.out.println("2-Rendirse");
                System.out.println("3-Protegerse");

                    Scanner sc = new Scanner(System.in);
                    input = sc.nextInt();
                    switch (input) {
                        case 1: {
                            //ataque();
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            // proteccion();
                            break;
                        }
                    }

                turnoPersonaje1 = false;
                }else{
                System.out.println("--Turno del " + personaje2.Nombre + "--");
                System.out.println("Elige una opcion");
                System.out.println("1-Atacar");
                System.out.println("2-Rendirse");
                System.out.println("3-Protegerse");

                turnoPersonaje1 = true;
            }
            if (personaje1.PS <= 0 || personaje2.PS <= 0) {
                combateActivo = false;
            }
        }
        if (personaje1.PS <= 0 && personaje2.PS <= 0) {
            System.out.println("¡Ha sido un empate!");
        } else if (personaje1.PS <= 0) {
            System.out.println(personaje2.Nombre + " ha ganado el combate.");
        } else {
            System.out.println(personaje1.Nombre + " ha ganado el combate.");
        }

        public static void ataque(HashMap<Integer, Personaje1> Combate, int idAtacante, int idObjetivo) {
            Personaje1 atacante = Combate.get(idAtacante);
            Personaje1 objetivo = Combate.get(idObjetivo);

            System.out.println(atacante.Nombre + " ataca a " + objetivo.Nombre + " con " + atacante.equipo.nombre + "!");

            // Realizar el cálculo del daño del ataque
            int danio = atacante.equipo.damage;

            // Aplicar el daño al objetivo
            objetivo.PS -= danio;

            System.out.println("¡" + atacante.Nombre + " inflige " + danio + " puntos de daño a " + objetivo.Nombre + "!");

            // Verificar si el objetivo ha sido derrotado
            if (objetivo.PS <= 0) {
                System.out.println(objetivo.Nombre + " ha sido derrotado.");
            } else {
                System.out.println(objetivo.Nombre + " tiene " + objetivo.PS + " puntos de vida restantes.");
            }
        }
}
}