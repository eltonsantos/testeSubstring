import java.util.StringTokenizer;

public class Demonstracao {
  
    public static void main(String[] args) {
        
        String texto = "$ 123456 $ CAGECE $ 2017-09-09 16:16:33.333 $ ELTON SANTOS $ elton@hotmail.com $ Teste $ (85) 99999-9999 $ SERVIÇOS $ Texto $ Teste de contextualização";
        StringTokenizer st = new StringTokenizer(texto);
        
        String str = "PROTOCOLO: 0785612 ÓRGÃO: CAGECE ";
        
        String protocolo = st.nextToken("$");
        String orgao = st.nextToken("$");
        String data_registro = st.nextToken("$");
        String nome_manifestante = st.nextToken("$");
        String email_manifestante = st.nextToken("$");
        String endereco_manifestante = st.nextToken("$");
        String telefone_manifestante = st.nextToken("$");
        String assunto = st.nextToken("$");
        String texto_manifestacao = st.nextToken("$");
        String contextualizacao = st.nextToken("$");    

        System.out.println("PROTOCOLO: " + protocolo);
        System.out.println("ÓRGÃO: " + orgao);
        System.out.println("DATA DE REGISTRO: " + data_registro);
        System.out.println("NOME MANIFESTANTE: " + nome_manifestante);
        System.out.println("E-MAIL MANIFESTANTE: " + email_manifestante);
        System.out.println("ENDEREÇO MANIFESTANTE: " + endereco_manifestante);
        System.out.println("TELEFONE MANIFESTANTE: " + telefone_manifestante);
        System.out.println("ASSUNTO: " + assunto);
        System.out.println("TEXTO DA MANIFESTAÇÃO: " + texto_manifestacao);
        System.out.println("CONTEXTUALIZAÇÃO PARA ÁREA COMPETENTE: " + contextualizacao);
        
    }
}