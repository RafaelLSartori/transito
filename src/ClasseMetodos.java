import javax.swing.*;

import java.io.*;
import javax.swing.JOptionPane;

public class ClasseMetodos {
    public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] transito){
        for(int i = 0; i < 10; i++){
            transito[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Código da cidade: "));
            transito[i].nomeCidade = JOptionPane.showInputDialog("Nome da cidade: ");
            transito[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes: "));
        }
        return transito;
    }
    public void PQTDACIDENTES(Estatistica[] transito){
        for(int i = 0; i < 10; i++){
            if (transito[i].qtdAcidentes > 100 && transito[i].qtdAcidentes < 500){
                System.out.println("Acidentes > 100 e < 500:" + transito[i].codigoCidade + " - " + transito[i].nomeCidade + " - " + transito[i].qtdAcidentes);
            }
        }
    }
    /*public void PMAIORMENOR(Transito[] transito){
        int menor = 9999; int maior = 0; int menorI = 0; int maiorI = 0;
        for(int i = 0; i < 10; i++){
            if(transito[i].qtdAcidentes > maior){
                maior = transito[i].qtdAcidentes;
                maiorI = i;
            }
            if(transito[i].qtdAcidentes < menor ){
                menor = transito[i].qtdAcidentes;
                menorI = i;
            }
        }
        System.out.println(maior);
        System.out.print(menor);
    }*/
    public void PMAIORMENOR(Estatistica[] transito){
        for(int i = 0; i < 9; i++){
            for(int j = (i+1); j < 10; j++){
                if(transito[i].qtdAcidentes > transito[j].qtdAcidentes){
                    int aux = transito[i].qtdAcidentes;
                    transito[i].qtdAcidentes = transito[j].qtdAcidentes;
                    transito[j].qtdAcidentes = aux;
                }
            }
        }
        System.out.println("A cidade com maior número de acidentes foi " +transito[9].codigoCidade+ " " +transito[9].nomeCidade+ " com: " +transito[9].qtdAcidentes+ " acidentes. \n A cidade com menor número de acidentes foi " +transito[0].codigoCidade+ " " +transito[0].nomeCidade+ " com: " +transito[0].qtdAcidentes+ " acidentes.");
    }
    public Estatistica[] FGRAVA(Estatistica[] transito)throws IOException{
        String fileName = "Estatística2024.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for(int i = 0; i < 10; i++){
            writer.write(Integer.toString(transito[i].codigoCidade));
            writer.newLine();
            writer.write(transito[i].nomeCidade);
            writer.newLine();
            writer.write(Integer.toString(transito[i].qtdAcidentes));
            writer.newLine();
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO!");
        writer.close();
        return transito;
    }
    public void PACIMA(Estatistica[] transito){
        double media = 0;
        for(int i = 0; i < 10; i++){
            media = transito[i].qtdAcidentes;
        }
        media = media / 10;
        for(int i = 0; i < 10; i++){
            if(transito[i].qtdAcidentes > media){
                System.out.print("quantidade de acidentes "+transito[i].qtdAcidentes);
            }
        }

    }


}
