
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
public class Objeto {
    //todos tienen un color, descripción, marca. Tamaño, calidad y persona que lo ingreso al sistema
    private Color color;
    private String descripcion;
    private String marca;
    private String calidad;
    private persona x4;

    public Objeto() {
    }

    public Objeto(Color color, String descripcion, String marca, String calidad, persona x4) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.calidad = calidad;
        this.x4 = x4;
    }

    public Color getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public persona getX4() {
        return x4;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public void setX4(persona x4) {
        this.x4 = x4;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", calidad=" + calidad + ", x4=" + x4 + '}';
    }
    
    
}
