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
public class Sala {
    private int idSala;
    private String ubicacionSala;
    private String tipoSala;

    public Sala(int idSala, String ubicacionSala, String tipoSala) {
        this.idSala = idSala;
        this.ubicacionSala = ubicacionSala;
        this.tipoSala = tipoSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getUbicacionSala() {
        return ubicacionSala;
    }

    public void setUbicacionSala(String ubicacionSala) {
        this.ubicacionSala = ubicacionSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    @Override
    public String toString() {
        return "Sala{" + "idSala=" + idSala + ", ubicacionSala=" + ubicacionSala + ", tipoSala=" + tipoSala + '}';
    }
    
    

   

 
    
    
    
}
