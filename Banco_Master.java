import java.util.Scanner;

public class Banco_Master {
   public static void main(String[] args) {
    Scanner escreve = new Scanner(System.in);
    String nome_investimento;
    Double taxa_juros, teto_regulatorio = 13.0;
    Boolean risco = false;
    System.out.print("Digite o nome do fundo de investimento:");
    nome_investimento = escreve.nextLine();
    System.out.print("Digite a taxa de juros oferecida pelo CDB (%):");
    taxa_juros = escreve.nextDouble();
    System.out.println("\n"+"RELATORIO PRELIMINAR:");
    System.out.print("Fundo analisado:"+ nome_investimento +"\n");
    System.out.print("Taxa de juros oferecida:"+ taxa_juros+"\n");
    System.out.print("Teto regulatorio permitido:"+ teto_regulatorio +"%"+"\n\n");

    if (taxa_juros>teto_regulatorio){
        System.out.println("[ALERTA CRÍTICO]"+"\n"+"A taxa do CDB está acima do teto regulatório!");
        System.out.println("MOTIVO: Captação agressiva para atrair liquidez de forma artificial"+"\n\n");
        risco = true;
    }
    else {
        System.out.println("Ativo está [REGULAR]"+"\n\n");
    }
    if (risco=true){
        System.out.println("Parecer do Auditor: Ativo bloqueado para novas emissões.");
    }
    else {
        System.out.println("Parecer do Auditor: Ativo liberado para comercialização.");
    }
    escreve.close();
   }
}
