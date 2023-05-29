/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;
import javaapplication35.SituacionesEscuela.Situacion4;
import javaapplication35.SituacionesEscuela.Situacion5;
import javaapplication35.SituacionesEscuela.Situacion6;

/**
 *
 * @author 52614
 */
public class Escuela implements Escenario {
private Situacion[] situaciones;
    private int indiceSituacionActual;

    public Escuela() {
        situaciones = new Situacion[3];
        situaciones[0] = new Situacion4();
        situaciones[1] = new Situacion5();
        situaciones[2] = new Situacion6();
        indiceSituacionActual = 0;
    }

    public Situacion getSituacionActual() {
        return situaciones[indiceSituacionActual];
    }

    public void avanzarSituacion() {
        indiceSituacionActual++;
        if (indiceSituacionActual >= situaciones.length) {
            indiceSituacionActual = 0;
        }
    }
    
}
