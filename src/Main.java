public class Main {
    public static void main(String[] args) {
        Pessoa qualquer = new Pessoa();
        // Encapsulamento
        qualquer.setNome("Raissa leal"); // atribuição
        System.out.println(qualquer.getNome()); // saída de dados

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(343);
        jogadora.setNome("Taissa do Vôlei");
        System.out.println(jogadora.getNome());
        // Polimorfismo
        qualquer = new Esportista();
        String resultado = qualquer.sacar();
        System.out.println(resultado);
        qualquer = new Esportista();
        resultado = qualquer.sacar();
        System.out.println(resultado);
    }

}