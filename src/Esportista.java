public class Esportista extends Pessoa {
    // Atributo
    private int idFrederacao;

    // Construtores
    public Esportista(int idFrederacao) {
        this.idFrederacao = idFrederacao;
    }

    public Esportista() {
    }

    // Método
    public String sacar(){
        return "Sacando para o jogo...";
    }

}
