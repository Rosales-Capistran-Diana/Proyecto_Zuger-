/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author 52614
 */
public class SituacionesEscuela {

    public static class Situacion4 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion4() {
            descripcion = "Estás por reprobar una materia ya que no le entiendes.";
            pregunta = "¿Qué decides hacer?";
            decision1 = "Estudiar desde un inicio.";
            decision2 = "Dejarlo así, igual puedes recuperar la materia al final.";
            decision3 = "Estudiar el último día.";
            puntos1 = 10;
            puntos2 = -5;
            puntos3 = 2;
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

    public static class Situacion5 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion5() {
            descripcion = "Tus amigos te invitan a saltearte las clases del día.";
            pregunta = "¿Que quieres hacer?";
            decision1 = "Los acompaño, total, solo será un día.";
            decision2 = "Me quedo en la escuela aunque mis amigos se enojen.";
            decision3 = "Veo si tendré las clases, dependiendo tomo mi decisión.";
            puntos1 = -5;
            puntos2 = 5;
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

    public static class Situacion6 implements Situacion {

        private String descripcion;
        private String pregunta;
        private String decision1;
        private String decision2;
        private String decision3;
        private int puntos1;
        private int puntos2;
        private int puntos3;

        public Situacion6() {
            descripcion = "Te das cuenta que la carrera en la que estás no te está gustando, ya que no es lo que tú te imaginabas.";
            pregunta = "¿Qué decisión tomarás?";
            decision1 = "Me quedo en esa carrera sin comentar nada.";
            decision2 = "Me salgo de estudiar y me meto a trabajar.";
            decision3 = "Me salgo de esa carrera, y busco la carrera de mis sueños";
            puntos1 = 0;
            puntos2 = -5;
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
