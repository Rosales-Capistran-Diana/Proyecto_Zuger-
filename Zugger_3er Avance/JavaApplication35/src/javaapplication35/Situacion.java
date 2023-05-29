/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication35;


interface Situacion {
    String getDescripcion();
    String getPregunta();
    String getDecision1();
    String getDecision2();
    String getDecision3();
    int getPuntos1();
    int getPuntos2();
    int getPuntos3();
}

interface Escenario {
    Situacion getSituacionActual();
    void avanzarSituacion();
}
