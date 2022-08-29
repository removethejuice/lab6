
public class gerente extends persona {

   
    
    private String usuario;
    private String contra;
    private String cargo;

    public gerente() {
        super();
    }

    public gerente(String usuario, String contra, String cargo) {
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public gerente(String usuario, String contra, String cargo, String ID, String nombre, int edad, String sexo, int altura, int peso, String estadociv) {
        super(ID, nombre, edad, sexo, altura, peso, estadociv);
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "gerente{" + "usuario=" + usuario + ", contra=" + contra + ", cargo=" + cargo +  super.toString();

    }
    
    
}
