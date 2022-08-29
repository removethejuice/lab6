
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
public class zapatos extends Objeto {
    
    // los cuales deben tener una talla, Descripción de la suela y una comodidad (escala de 1 a 10
    private int talla;
    private String descripcion2;
    private int escala;

    public zapatos(int talla, String descripcion, int escala) {
       super();
    }

    public zapatos(int talla, String descripcion2, int escala, Color color, String descripcion, String marca, String calidad, persona x4) {
        super(color, descripcion, marca, calidad, x4);
        this.talla = talla;
        this.descripcion2 = descripcion;
        this.escala = escala;
    }

    public int getTalla() {
        return talla;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public int getEscala() {
        return escala;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public void setEscala(int escala) {
        this.escala = escala;
    }

    @Override
    public String toString() {
        return "zapatos{" + "talla=" + talla + ", descripcion2=" + descripcion2 + ", escala=" + escala + super.toString();
    }
    
    
}
