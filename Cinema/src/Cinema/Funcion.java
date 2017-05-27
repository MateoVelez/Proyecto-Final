package Cinema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan David Jimenez G
 */
public class Funcion {
    private int idFuncion;
    private int nombreFuncion;
    private Pelicula pelicula;
    private Sala sala;
    private int numeroTickets;

    public Funcion(int idFuncion, int nombreFuncion, Pelicula pelicula, Sala sala, int numeroTickets) {
        this.idFuncion = idFuncion;
        this.nombreFuncion = nombreFuncion;
        this.pelicula = pelicula;
        this.sala = sala;
        this.numeroTickets = numeroTickets;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public int getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(int nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getNumeroTickets() {
        return numeroTickets;
    }

    public void setNumeroTickets(int numeroTickets) {
        this.numeroTickets = numeroTickets;
    }

    @Override
    public String toString() {
        return "Funcion{" + "idFuncion=" + idFuncion + ", nombreFuncion=" + nombreFuncion + ", pelicula=" + pelicula + ", sala=" + sala + ", numeroTickets=" + numeroTickets + '}';
    }
    
    
    
}
