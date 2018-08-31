/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import formularios.FormUsuario;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class PruebaDelibery {
    
    
enum SeleccionCadete{
  cadete1("Juan, 1554365656, de 8 a 14"), cadete2("Pedro, 1546578742, de 14 a 21"), cadete3("L"), cadete4("XL");
    private SeleccionCadete (String CadeteLibre){
        this.CadeteLibre=CadeteLibre;
                
    }
    public String dameCadeteLibre(){
        return CadeteLibre;
    }
    private String CadeteLibre;        
}

    
enum FormaPago{
    
    TARJETA("tarjeta"), EFECTIVO("efectivo");
    private FormaPago (String abreviatura){
        this.Pago=abreviatura;
                
    }
    public String dameAbreviatura(){
        return Pago;
    }
    private String Pago;        
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new  Scanner(System.in);
        
        FormUsuario in =new FormUsuario();
        in.setVisible(true);
        
        
        
        
        Cadete cadete1 =new Cadete("carlos", "perez", "165877778", "08 a 14");
        Cadete cadete2 =new Cadete("juan", "Gonzalez", "15348765", "14 a 22");
        Cadete cadete3 =new Cadete("Roberto", "Montaña", "1334234", "08 a 14");
        Cadete cadete4 =new Cadete("Damian", "Soto", "1562345678", "09 a 15");
        Cadete cadete5 =new Cadete("Gustavo", "Ferreyra", "154657346", "07 a 18");
        
        
       
        
        pedido ingreso =new pedido();
        ingreso.setComercio(JOptionPane.showInputDialog("Ingrese el comercio"));
        ingreso.setOrigen(JOptionPane.showInputDialog("Ingrese la Direccion de Origen"));
        ingreso.setDestino(JOptionPane.showInputDialog("Ingrese la Direccion de destino"));   
        ingreso.setDetalle(JOptionPane.showInputDialog("Ingrese el Detalle de la compra"));
        ingreso.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio del producto")));
        JOptionPane.showMessageDialog(null, "su cadete asignado es " +cadete3);
        
        System.out.println("Escribe EFECTIVO o TARJETA");
        String entrada_datos=entrada.next().toUpperCase();//convierte en mayusculas lo que el usuario coloca en minusculas
        FormaPago El_pago=Enum.valueOf(FormaPago.class, entrada_datos); 
        System.out.println("Usted abona con  " +El_pago);
        pedido asignacion =new pedido();
         System.out.println(asignacion.getAsignarPedido());
        
        
    } 
    
}
