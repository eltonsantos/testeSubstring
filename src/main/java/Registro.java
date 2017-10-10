import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Registro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    
    @NotNull
    @Column(name = "PROTOCOLO")
    private String protocolo;
    
    @NotNull
    @Column(name = "ÓRGÃO")
    private String orgao;
   
    @NotNull
    @Column(name = "DATA DE REGISTRO")
    private String data;
    
    @NotNull
    @Column(name = "NOME MANIFESTANTE")
    private String nome;
    
    @NotNull
    @Column(name = "E-MAIL MANIFESTANTE")
    private String email;
    
    @Column(name = "ENDEREÇO MANIFESTANTE")
    private String endereco;
    
    @Column(name = "TELEFONE MANIFESTANTE")
    private String telefone;
    
    @NotNull
    @Column(name = "ASSUNTO")
    private String assunto;
    
    @NotNull
    @Column(columnDefinition = "TEXT", name = "MANIFESTAÇÃO")
    private String manifestacao;
    
    @NotNull
    @Column(columnDefinition = "TEXT", name = "CONTEXTUALIZAÇÃO")
    private String contextualizacao;

    /* CONSTRUTOR */
    public Registro(){
    }
    
    
    
    /* GETTERS AND SETTERS */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getManifestacao() {
        return manifestacao;
    }

    public void setManifestacao(String manifestacao) {
        this.manifestacao = manifestacao;
    }

    public String getContextualizacao() {
        return contextualizacao;
    }

    public void setContextualizacao(String contextualizacao) {
        this.contextualizacao = contextualizacao;
    }
}
