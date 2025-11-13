package job.marcelojunior.auxs;

public class Telefone {

    private String ddd;
    private String numTelefone;

    public Telefone() {
    }

    public Telefone(String DDD, String numTelefone) {
        this.ddd = DDD;
        this.numTelefone = numTelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }
}