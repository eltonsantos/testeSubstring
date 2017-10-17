import java.util.StringTokenizer;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "manipularString")
public class ManipularString {
    
    private String texto;
    
    private String protocolo;
    private String orgao;
    private String data_registro;
    private String nome_manifestante;
    private String email_manifestante;
    private String endereco_manifestante;
    private String telefone_manifestante;
    private String assunto;
    private String texto_manifestacao;
    private String contextualizacao;
    
    public String tratarTexto(){
        
        String textoEmLinha = texto.replaceAll("[\\s]+", " ");
        System.out.println("TEXTO EM LINHA: " +textoEmLinha);
        
        String textoTrocado = textoEmLinha.replace("PROTOCOLO", "\\$").replace("ÓRGÃO", "\\$").replace("DATA DE REGISTRO", "\\$").replace("NOME MANIFESTANTE", "\\$").replace("E-MAIL MANIFESTANTE", "\\$").replace("ENDEREÇO MANIFESTANTE", "\\$").replace("TELEFONE MANIFESTANTE", "\\$").replace("ASSUNTO", "\\$").replace("TEXTO DA MANIFESTAÇÃO", "\\$").replace("CONTEXTUALIZAÇÃO PARA ÁREA COMPETENTE", "\\$");     
        System.out.println("TEXTO COM TOKENS: " +textoTrocado);
        
        // Instanciando objeto responsável por todo o processo
        StringTokenizer st = new StringTokenizer(textoTrocado);
        
        protocolo = st.nextToken("\\$");
        orgao = st.nextToken("\\$"); 
        data_registro = st.nextToken("\\$");
        nome_manifestante = st.nextToken("\\$");
        email_manifestante = st.nextToken("\\$");
        endereco_manifestante = st.nextToken("\\$");
        telefone_manifestante = st.nextToken("\\$");
        assunto = st.nextToken("\\$");
        texto_manifestacao = st.nextToken("\\$");
        contextualizacao = st.nextToken("\\$");

        System.out.println("PROTOCOLO" + protocolo);
        System.out.println("ÓRGÃO" + orgao);
        System.out.println("DATA DE REGISTRO" + data_registro);
        System.out.println("NOME MANIFESTANTE" + nome_manifestante);
        System.out.println("E-MAIL MANIFESTANTE" + email_manifestante);
        System.out.println("ENDEREÇO MANIFESTANTE:" + endereco_manifestante);
        System.out.println("TELEFONE MANIFESTANTE:" + telefone_manifestante);
        System.out.println("ASSUNTO" + assunto);
        System.out.println("TEXTO DA MANIFESTAÇÃO:" + texto_manifestacao);
        System.out.println("CONTEXTUALIZAÇÃO PARA ÁREA COMPETENTE:" + contextualizacao);
        
        return "tratado?faces-redirect=true";
      
    }

    public ManipularString() {
    }
	  
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getData_registro() {
        return data_registro;
    }

    public void setData_registro(String data_registro) {
        this.data_registro = data_registro;
    }

    public String getNome_manifestante() {
        return nome_manifestante;
    }

    public void setNome_manifestante(String nome_manifestante) {
        this.nome_manifestante = nome_manifestante;
    }

    public String getEmail_manifestante() {
        return email_manifestante;
    }

    public void setEmail_manifestante(String email_manifestante) {
        this.email_manifestante = email_manifestante;
    }

    public String getEndereco_manifestante() {
        return endereco_manifestante;
    }

    public void setEndereco_manifestante(String endereco_manifestante) {
        this.endereco_manifestante = endereco_manifestante;
    }

    public String getTelefone_manifestante() {
        return telefone_manifestante;
    }

    public void setTelefone_manifestante(String telefone_manifestante) {
        this.telefone_manifestante = telefone_manifestante;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto_manifestacao() {
        return texto_manifestacao;
    }

    public void setTexto_manifestacao(String texto_manifestacao) {
        this.texto_manifestacao = texto_manifestacao;
    }

    public String getContextualizacao() {
        return contextualizacao;
    }

    public void setContextualizacao(String contextualizacao) {
        this.contextualizacao = contextualizacao;
    }
    
}