import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // OBJETO CRIADO NA MEMÓRIA ATRAVÉS DA CLASSE FILME
        meuFilme.setNome(" O poderoso chefão "); //Quando eu altero para set, o nome do filme fica dentro dos (), ai não preciso usar mais o =
        meuFilme.setAnoDeLancamento( 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.obterMedia());
    }
}