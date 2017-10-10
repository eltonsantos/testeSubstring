import javax.faces.bean.ManagedBean;

@ManagedBean(name = "manipularString")
public class ManipularString {
    
    private String texto;
    
    public ManipularString() {
        System.out.println("Texto sendo manipulado...");
    }
	  
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
   
}
