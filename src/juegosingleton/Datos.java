package juegosingleton;

public class Datos {

    /**
     * Cantidad de números que generará el juego
     */
    private int rondas;
    /**
     * Ronda actual
     */
    private int rondaActual;
    /**
     * Numero aleatorio creado por el juego
     */
    private int numAleatorio;
    /**
     * Numero escrito por el usuario
     */
    private int numUsuario;
    /**
     * Numero de intentos dentro de un juego
     */
    private int maxIntentos;
    /**
     * Numero de intentos que el usuario lleva
     */
    private int numIntentos;
    /**
     * Numero de aciertos totales
     */
    private int puntuacion;
    /**
     * Alias del usuario
     */
    private String alias;

    private static Datos instance = null;

    private Datos(){
    }

    public static Datos getInstance(){
        if (instance==null){
            instance = new Datos();
        }
        return instance;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public int getRondaActual() {
        return rondaActual;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    public void setMaxIntentos(int maxIntentos) {
        this.maxIntentos = maxIntentos;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}

