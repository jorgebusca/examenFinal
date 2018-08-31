/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author jorge
 */
public class pedido {
    private String comercio;
    private String Origen;
    private String Destino;
    private String Detalle;
    private int Precio;
    private boolean pago;
    
    public pedido(){
        
    }

    public pedido(String comercio, String Origen, String Destino, String Detalle, int Precio, boolean pago) {
        this.comercio = comercio;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Detalle = Detalle;
        this.Precio = Precio;
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    public String getAsignarPedido(){
        return "El comercio es "+comercio+" direccion de origen "+Origen+ "Direccion de destino "+Destino+"y un detalle "+ Detalle;
                }
    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    
    
}
