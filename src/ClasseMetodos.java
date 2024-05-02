import javax.swing.*;

public class ClasseMetodos {
    public Estatistica[] FCadastra(Estatistica[] estatistica){
        for(int i = 0; i < 10; i++){
            estatistica[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Codigo Cidade: "));
            estatistica[i].nomeCidade = JOptionPane.showInputDialog("Nome Cidade: ");
            estatistica[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Acidentes: "));
        }
        return estatistica;
    }

    public void PQTDACIDENTES(Estatistica[] estatistica){
        for(int i = 0; i <10; i++){
            if(estatistica[i].qtdAcidentes > 100 && estatistica[i].qtdAcidentes < 500){
                System.out.println("Acidentes > 100 e < 500:" + estatistica[i].qtdAcidentes + estatistica[i].nomeCidade + estatistica[i].qtdAcidentes);
            }
        }
    }

    public void PMAIORMENOR(Estatistica[] estatistica){
        int maior = 0, menor = 9999, maiorI = 0, menorI = 0;

        for(int i = 0; i < 10; i++){
            if(estatistica[i].qtdAcidentes > maior){
                maior = estatistica[i].qtdAcidentes;
                maiorI = i;
            }
            if(estatistica[i].qtdAcidentes < menor){
                menor = estatistica[i].qtdAcidentes;
                menorI = i;
            }
        }
        System.out.println("");
    }

    public void PACIMA (Estatistica[] estatistica){
        double media = 0;
        for(int i = 0; i < 10; i++){
            media = estatistica[i].qtdAcidentes;
        }
        media /= 10;

        for(int i = 0; i < 10; i++){
            if(estatistica[i].qtdAcidentes > media){
                System.out.println("");
            }
        }
    }
}
