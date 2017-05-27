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
public class Persona {
    private int idPersona;
    private String nombrePersona;
    private String telefonoPersona;

    public Persona(int idPersona, String nombrePersona, String telefonoPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.telefonoPersona = telefonoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }
    
    
}
