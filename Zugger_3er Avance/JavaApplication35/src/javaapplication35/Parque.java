/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication35;

import javaapplication35.SituacionesParque.Situacion7;
import javaapplication35.SituacionesParque.Situacion8;
import javaapplication35.SituacionesParque.Situacion9;

/**
 *
 * @author 52614
 */
public class Parque implements Escenario {
private Situacion[] situaciones;
    private int indiceSituacionActual;

    public Parque() {
        situaciones = new Situacion[3];
        situaciones[0] = new Situacion7();
        situaciones[1] = new Situacion8();
        situaciones[2] = new Situacion9();
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
