import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Estatistica estatistica[] = new Estatistica[10];
        ClasseMetodos m = new ClasseMetodos();

        for(int i = 0; i < 10; i++){
            estatistica[i] = new Estatistica();
        }

        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 -  Cadastra Cidade \n 2 - Consulta Acid >100 e <500 \n 3 - Menor e Maior nº acid \n 4 - Cid qtd de acid acima media 10 cid \n 9 - Finaliza"));
            switch(opc){
                case 1: estatistica = m.FCadastra(estatistica);
                break;
                case 2: m.PQTDACIDENTES(estatistica);
                case 3: m.PMAIORMENOR(estatistica);
                break;
                case 4: m.PACIMA(estatistica);
                break;
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                break;
                default: JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }

    }
}