import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "manipularString")
public class ManipularString {
    
    private String texto;
    private String tratado;
    
    public String tratarTexto(){
        
        ArrayList<String> palavrasChaves = new ArrayList<>();
        palavrasChaves.add("PROTOCOLO");
        palavrasChaves.add("ÓRGÃO");
        palavrasChaves.add("DATA DE REGISTRO");
        palavrasChaves.add("NOME MANIFESTANTE");
        palavrasChaves.add("E-MAIL MANIFESTANTE");
        palavrasChaves.add("ENDEREÇO MANIFESTANTE");
        palavrasChaves.add("TELEFONE MANIFESTANTE");
        palavrasChaves.add("ASSUNTO");
        palavrasChaves.add("TEXTO DA MANIFESTAÇÃO");
        palavrasChaves.add("CONTEXTUALIZAÇÃO PARA ÁREA COMPETENTE");
        
        System.out.println("------------------------------");
        System.out.println("Lista: " +palavrasChaves);
        
        tratado = texto.replaceAll(" ", "");
        System.out.println(tratado);
        return tratado;    
    }

    public ManipularString() {
        /*System.out.println("Texto sendo manipulado...");
        String Str = new String("Welcome to Tutorialspoint.com");
        System.out.print("Return Value :" );
        System.out.println(Str.substring(10) );*/
    }
	  
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String getTratado() {
        return tratado;
    }

    public void setTratado(String tratado) {
        this.texto = tratado;
    }
   
}
