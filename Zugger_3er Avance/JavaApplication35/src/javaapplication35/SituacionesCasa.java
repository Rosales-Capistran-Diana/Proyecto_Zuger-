/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author 52614
 */
public class SituacionesCasa {

    public static class Situacion1 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion1() {
            descripcion = "Estás en casa. Tus padres dicen que quieren salir a pasear. ";
            pregunta = "¿Los acompañas?";
            decision1 = "Sí, los acompaño.";
            decision2 = "No, prefiero quedarme en casa.";
            decision3 = "Pido algo a cambio.";
            puntos1 = 10;
            puntos2 = 0;
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

    public static class Situacion2 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion2() {
            descripcion = "";
            pregunta = "Tienes tiempo libre y no sabes qué hacer. ¿Qué haces?";
            decision1 = "Jugar LoL";
            decision2 = "Estudiar";
            decision3 = "Salir con tus amigos";
            puntos1 = -5;
            puntos2 = 5;
            puntos3 = 10;
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

    public static class Situacion3 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion3() {
            descripcion = "";
            pregunta = "Tu hermano dejó un paquete de gansitos en el refrigerador. ¿Te los comes?";
            decision1 = "Sí, me los como";
            decision2 = "No, no me los como";
            decision3 = "Si, pero se lo repongo después";
            puntos1 = -10;
            puntos2 = 5;
            puntos3 = 10;
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
