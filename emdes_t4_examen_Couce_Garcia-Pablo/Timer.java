package Examen_Pablo_Couce;


public class Timer {

    static final int SegundosDiarios = 86400;

    void startTimer() {
        // Espera 86400 segundos (24 horas)
        Thread.sleep(SegundosDiarios);
    }
}
