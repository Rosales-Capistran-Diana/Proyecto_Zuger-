/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

/**
 *
 * @author 52614
 */
public class SituacionesTrabajo {
public static class Situacion10 implements Situacion {
    private String descripcion;
    private String pregunta;
    private String decision1;
    private String decision2;
    private String decision3;
    private int puntos1;
    private int puntos2;
    private int puntos3;

    public Situacion10() {
        descripcion = "Te están pagando menos del sueldo que te dijeron en un inicio.";
        pregunta = "¿Que decides hacer?";
        decision1 = "Quejarme en RH de una manera grosera.";
        decision2 = "Renunciar, no sin antes averiguar el porque me están pagando menor cantidad de la que me dijeron.";
        decision3 = "Seguir así, sin decir nada.";
        puntos1 = -5;
        puntos2 = 5;
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

public static class Situacion11 implements Situacion {
    private String descripcion;
    private String pregunta;
    private String decision1;
    private String decision2;
    private String decision3;
    private int puntos1;
    private int puntos2;
    private int puntos3;

    public Situacion11() {
        descripcion = "Tu jefe te empieza a tratar mal.";
        pregunta = "¿Cuál es tu reacción?";
        decision1 = "Enojarme, y tratarlo igual";
        decision2 = "No decir nada.";
        decision3 = "Hablar seriamente con él, y pedirle respeto.";
        puntos1 = -5;
        puntos2 = 0;
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

public static class Situacion12 implements Situacion {
    private String descripcion;
    private String pregunta;
    private String decision1;
    private String decision2;
    private String decision3;
    private int puntos1;
    private int puntos2;
    private int puntos3;

    public Situacion12() {
        descripcion = "Te ofrecen otro trabajo, aún y cuando ya tienes uno. Pero te has dado cuenta que es mejor el trabajo que tienes en puerta";
        pregunta = "¿Qué piensas hacer?";
        decision1 = "Irme al otro trabajo sin si quiera pensarlo, abandonando el que tengo sin decir nada.";
        decision2 = "Rechazarlo porque te gusta en donde estás.";
        decision3 = "Comparar ambos trabajos para ver en cuál me ofrecen mejores cosas(incluyendo servicio medico, paga, ambiente laboral, etc)";
        puntos1 = 10;
        puntos2 = 0;
        puntos3 = 0;
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
