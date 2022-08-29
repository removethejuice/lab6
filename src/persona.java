 
public class persona {
    private String ID;
    private String nombre;
    private int edad;
    private String sexo;
    private int altura;
    private int peso;
    private String estadociv;

    public persona() {
    }

    public persona(String ID, String nombre, int edad, String sexo, int altura, int peso, String estadociv) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.estadociv = estadociv;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getEstadociv() {
        return estadociv;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEstadociv(String estadociv) {
        this.estadociv = estadociv;
    }

    @Override
    public String toString() {
        return "persona{" + "ID=" + ID + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + ", estadociv=" + estadociv + '}';
    }
    
}
