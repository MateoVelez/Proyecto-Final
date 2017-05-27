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
public class Boleta {
    private int idBoleta;
    private Pelicula pelicula;
    private Sala sala;
    private Double hora;
    

    public Boleta(int idBoleta, Pelicula pelicula, Sala sala, Double hora) {
        this.idBoleta = idBoleta;
        this.pelicula = pelicula;
        this.sala = sala;
        this.hora = hora;       
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
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

    public Double getHora() {
        return hora;
    }

    public void setHora(Double hora) {
        this.hora = hora;
    }    
}
