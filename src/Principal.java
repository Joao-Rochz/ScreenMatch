import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.calculos.calculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.exibeFichaTecnica();
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da Série: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento( 2023);
        outroFilme.setDuracaoEmMinutos(200);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoJota = new  Filme(); //VAR: a variavel var realiza uma inferência do tipo declarado
        filmeDoJota.setNome("Dogville");
        filmeDoJota.setDuracaoEmMinutos(200);
        filmeDoJota.setAnoDeLancamento(2003);
        filmeDoJota.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoJota);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
    }
}