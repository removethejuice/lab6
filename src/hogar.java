
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50497
 */
public class hogar extends Objeto{
    //Poseen una descripción que menciona a qué lugar de la casa pertenecen (sala,comedor, baño, cocina, etc), instrucciones de funcionamiento y un tiempo de garantía
private String lugar;
private String instrucciones;
private String garantia;

    public hogar(String lugar, String instrucciones, String garantia) {
        super();
    }

    public hogar(String lugar, String instrucciones, String garantia, Color color, String descripcion, String marca, String calidad, persona x4) {
        super(color, descripcion, marca, calidad, x4);
        this.lugar = lugar;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getLugar() {
        return lugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public String getGarantia() {
        return garantia;
        
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "hogar{" + "lugar=" + lugar + ", instrucciones=" + instrucciones + ", garantia=" + garantia + super.toString();
    }


}
