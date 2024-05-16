import javax.swing.JOptionPane;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        Estatistica estatistica[] = new Estatistica[10];
        ClasseMetodos m = new ClasseMetodos();

        for(int i = 0; i < 10; i++){
            estatistica[i] = new Estatistica();
        }

        int opc = 0;

        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra \n 2 - Quantidade de acidentes \n 3 - Maior e menor qtd acid \n 4 - Acima da média de acid \n 5 - Gravar \n 9 - Finaliza"));
            switch(opc){
                case 1: estatistica = m.FCADRASTRAESTATISTICA(estatistica);
                    break;
                case 2: m.PQTDACIDENTES(estatistica);
                    break;
                case 3: m.PMAIORMENOR(estatistica);
                    break;
                case 4: m.PACIMA(estatistica);
                    break;
                case 5: estatistica = m.FGRAVA(estatistica);
                case 9: JOptionPane.showMessageDialog(null,"Programa finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
    }
}