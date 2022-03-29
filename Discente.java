
public class Discente extends Pessoa {

    private String instituicao;
    private String curso;
    private String periodoLetivo;
    private String matricula;

    public Discente(){
        
    }

    public Discente(String nomeCompleto, String email){
        super(nomeCompleto, email);

    }

    public Discente(String nomeCompleto, String email, String instituicao, String curso, String periodoLetivo) {
        super(nomeCompleto, email);
        this.instituicao = "Instituto Federal Goiano - Campus Morrinhos";
        this.curso = curso;
        this.periodoLetivo = "2022/1";
    }

    public Discente(String nomeCompleto, String email, String instituicao, String curso, String periodoLetivo, String matricula) {
        super(nomeCompleto, email);
        this.instituicao = "Instituto Federal Goiano - Campus Morrinhos";
        this.curso = curso;
        this.periodoLetivo = "2022/1";
        this.matricula = matricula;
    }

    public String getInstituicao() {
        return instituicao;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getPeriodoLetivo() {
        return periodoLetivo;
    }
    public void setPeriodoLetivo(String periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    //Utilizar Data e Hora de matricula
}

