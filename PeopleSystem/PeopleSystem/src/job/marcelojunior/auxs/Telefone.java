package job.marcelojunior.auxs;

public class Telefone {

    private String tipo;
    private String ddd;
    private String numTelefone;

    public Telefone() {
    }


    public Telefone(String tipo, String DDD, String numTelefone) {
        this.tipo = tipo;
        this.ddd = DDD;
        this.numTelefone = numTelefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return tipo + ": " + "(" + ddd + ") " + numTelefone;
    }
}