/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cinema;

import sun.security.util.Password;

/**
 *
 * @author Juan David Jimenez G
 */
public class Administrador extends Persona{
    private int cargo;
    private String userAccess;
    private Password password;

    public Administrador(int cargo, String userAccess, Password password, int idPersona, String nombrePersona, String telefonoPersona) {
        super(idPersona, nombrePersona, telefonoPersona);
        this.cargo = cargo;
        this.userAccess = userAccess;
        this.password = password;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(String userAccess) {
        this.userAccess = userAccess;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
    
    
    
    
}
