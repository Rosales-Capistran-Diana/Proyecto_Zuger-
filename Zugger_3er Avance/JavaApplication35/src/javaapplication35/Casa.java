/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

import javaapplication35.SituacionesCasa.Situacion1;
import javaapplication35.SituacionesCasa.Situacion2;
import javaapplication35.SituacionesCasa.Situacion3;

/**
 *
 * @author mende
 */
class Casa implements Escenario {
    private Situacion[] situaciones;
    private int indiceSituacionActual;

    public Casa() {
        situaciones = new Situacion[3];
        situaciones[0] = new Situacion1();
        situaciones[1] = new Situacion2();
        situaciones[2] = new Situacion3();
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

