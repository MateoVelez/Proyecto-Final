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
public class Pelicula {
    private int idPelicula;
    private String nombrePelicula;
    private int añoPublicacion;
    private String idiomaPelicula;
    private int duracionPelicula;

    public Pelicula() {

    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getIdiomaPelicula() {
        return idiomaPelicula;
    }

    public void setIdiomaPelicula(String idiomaPelicula) {
        this.idiomaPelicula = idiomaPelicula;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(int duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }    
}
