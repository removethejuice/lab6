
import java.awt.Color;

 
public class ropa extends Objeto {
 //La que también tiene una talla, Un tipo de tela y un país en el que fue elaborado.
    private int talla;
    private String tela;
    private String pais;

    public ropa() {
        super();
    }

    

    public ropa(int talla, String tela, String pais, Color color, String descripcion, String marca, String calidad, persona x4) {
        super(color, descripcion, marca, calidad, x4);
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public int getTalla() {
        return talla;
    }

    public String getTela() {
        return tela;
    }

    public String getPais() {
        return pais;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ropa{" + "talla=" + talla + ", tela=" + tela + ", pais=" + pais + super.toString();
    }
    
    
    
}
