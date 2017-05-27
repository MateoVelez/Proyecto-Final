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
public class MedioPago {
    private int idMedioPago;

    public MedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public int getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    @Override
    public String toString() {
        return "MedioPago{" + "idMedioPago=" + idMedioPago + '}';
    }
    
    
    
}
