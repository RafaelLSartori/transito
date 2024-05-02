public class Estatistica {
    int codigoCidade;
    String nomeCidade;
    int qtdAcidentes;

    Estatistica(){
        this( 0, "", 0);
    }

    Estatistica(int codigoDaCidade, String nomeDaCidade, int qtdDeAcidentes){
        codigoCidade = codigoDaCidade;
        nomeCidade = nomeDaCidade;
        qtdAcidentes = qtdDeAcidentes;
    }
}
