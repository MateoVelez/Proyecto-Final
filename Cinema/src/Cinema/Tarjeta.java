package Cinema;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan David Jimenez G
 */
public class Tarjeta extends MedioPago {
    private ClienteAfiliado cliente;
    private double valorPago;
    private int cantidadBoletas;

    public Tarjeta(ClienteAfiliado cliente, double valorPago, int cantidadBoletas, int idMedioPago) {
        super(idMedioPago);
        this.cliente = cliente;
        this.valorPago = valorPago;
        this.cantidadBoletas = cantidadBoletas;
    }

    public ClienteAfiliado getCliente() {
        return cliente;
    }

    public void setCliente(ClienteAfiliado cliente) {
        this.cliente = cliente;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public int getCantidadBoletas() {
        return cantidadBoletas;
    }

    public void setCantidadBoletas(int cantidadBoletas) {
        this.cantidadBoletas = cantidadBoletas;
    }
    
    //Compra de Boletas
    public double compraBoletas(double valorDescuento){
        //Scanner sc = new Scanner(System.in);
        double saldo=this.cliente.getSaldoTarjeta();
        if(saldo>=valorDescuento){
            System.out.print("Transacción Realizada");
            saldo=saldo-valorDescuento;
            this.cliente.setSaldoTarjeta(saldo);
        }
        else{
           System.out.print("Fondos Insuficientes");
        }
       return 0;       
    }
    
    //Cargar Saldo
    public double cargarSaldo(double saldoCargar){
       double saldo=this.cliente.getSaldoTarjeta();
       saldo=saldo+saldoCargar;
       System.out.println("Su saldo ha sido cargado satisfactoriamente");
       return 0;         
    }
    
    //Devolver saldo de Recarga
    private String devolverSaldo(String motivoDevolución,double saldoDevolucion){
        System.out.println("Motivo de devolución de Recarga");
        double saldo=this.cliente.getSaldoTarjeta();
        saldo=saldo-saldoDevolucion;
        System.out.println("Se ha descontado el valor de la recarga realizada");
        System.out.println("Se procedera a realizar la devolución de su dinero en efectivo");
        return null;        
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "cliente=" + cliente + ", valorPago=" + valorPago + ", cantidadBoletas=" + cantidadBoletas + '}';
    }
    
    
    
}
