/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author 52614
 */
public class SituacionesParque {

    public static class Situacion7 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion7() {
            descripcion = "Te encuentras a tus amigos de la infancia";
            pregunta = "¿Qué haces?";
            decision1 = "Voy a saludarlos, y de paso, me quedo con ellos.";
            decision2 = "Los ignoro.";
            decision3 = "Paso a saludarlos y me voy del parque.";
            puntos1 = 5;
            puntos2 = -5;
            puntos3 = -5;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getPregunta() {
            return pregunta;
        }

        public String getDecision1() {
            return decision1;
        }

        public String getDecision2() {
            return decision2;
        }

        public String getDecision3() {
            return decision3;
        }

        public int getPuntos1() {
            return puntos1;
        }

        public int getPuntos2() {
            return puntos2;
        }

        public int getPuntos3() {
            return puntos3;
        }
    }

    public static class Situacion8 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion8() {
            descripcion = "Encuentras dinero tirado en medio del parque, así que decides recogerlo pero luego alguien de escasos recursos te pregunta que si llegaste a encontrarte dinero.";
            pregunta = "¿Qué harás?";
            decision1 = "Le digo que no, y me lo quedo ya que yo lo encontré.";
            decision2 = "Le digo que si, y se lo entrego.";
            decision3 = "Le digo que si, pero solo le doy la mitad de lo que era realmente.";
            puntos1 = -10;
            puntos2 = 10;
            puntos3 = -10;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getPregunta() {
            return pregunta;
        }

        public String getDecision1() {
            return decision1;
        }

        public String getDecision2() {
            return decision2;
        }

        public String getDecision3() {
            return decision3;
        }

        public int getPuntos1() {
            return puntos1;
        }

        public int getPuntos2() {
            return puntos2;
        }

        public int getPuntos3() {
            return puntos3;
        }
    }

    public static class Situacion9 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion9() {
            descripcion = "A lo lejos vez que un perro se te acerca corriendo";
            pregunta = "¿Qué es en lo primero que piensas?";
            decision1 = "Quedarme para así poder acariciarlo, pero me voy en cuanto lo logro.";
            decision2 = "Salir corriendo, pues me dan pánico los perros.";
            decision3 = "Me quedo para jugar con él";
            puntos1 = 5;
            puntos2 = 0;
            puntos3 = 5;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getPregunta() {
            return pregunta;
        }

        public String getDecision1() {
            return decision1;
        }

        public String getDecision2() {
            return decision2;
        }

        public String getDecision3() {
            return decision3;
        }

        public int getPuntos1() {
            return puntos1;
        }

        public int getPuntos2() {
            return puntos2;
        }

        public int getPuntos3() {
            return puntos3;
        }
    }
}
