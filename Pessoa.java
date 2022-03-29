public abstract class Pessoa {

    private String nomeCompleto;
    private String email;

    public Pessoa(){

    }
    public Pessoa(String nomeCompleto, String email) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }





}


