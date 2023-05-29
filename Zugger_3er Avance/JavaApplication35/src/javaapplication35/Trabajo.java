/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

import javaapplication35.SituacionesTrabajo.Situacion10;
import javaapplication35.SituacionesTrabajo.Situacion11;
import javaapplication35.SituacionesTrabajo.Situacion12;

/**
 *
 * @author 52614
 */
public class Trabajo implements Escenario{
private Situacion[] situaciones;
    private int indiceSituacionActual;

        public Trabajo() {
        situaciones = new Situacion[3];
        situaciones[0] = new Situacion10();
        situaciones[1] = new Situacion11();
        situaciones[2] = new Situacion12();
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
