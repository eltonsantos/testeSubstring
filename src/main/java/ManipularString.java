import javax.faces.bean.ManagedBean;

@ManagedBean(name = "manipularString")
public class ManipularString {
    
    private String texto;
    
    public String tratarTexto(){
    
        return texto;
    }

    
    public ManipularString() {
        System.out.println("Texto sendo manipulado...");
        
        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value :" );
        System.out.println(Str.substring(10) );
    }
	  
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
   
}
