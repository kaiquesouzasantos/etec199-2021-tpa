import java.util.Scanner;

public class IfAposentadoria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int selecao,aAtual,aNascimento,resultado,resultadoA;

        System.out.print("Digite conforme seu sexo (1 para feminino, 2 para masculino): ");
        selecao=in.nextInt();

        if(selecao==1){
            System.out.print("Digite o ano atual: ");
            aAtual=in.nextInt();
            
            System.out.print("Digite seu ano de nascimento: ");
            aNascimento=in.nextInt();
            
            resultado=aAtual-aNascimento;
            resultadoA=60-resultado;
            
            if(resultado<60){
                System.out.println("Faltam "+resultadoA+" anos para a sua aposentadoria");
            } else{
                System.out.println("Você já esta aposentado");
            }
        }else if(selecao==2){
            System.out.print("Digite o ano atual: ");
            aAtual=in.nextInt();
            
            System.out.print("Digite seu ano de nascimento: ");
            aNascimento=in.nextInt();
            
            resultado=aAtual-aNascimento;
            resultadoA=65-resultado;
            
            if(resultado<65){
                System.out.println("Faltam "+resultadoA+" anos para a sua aposentadoria");
            } else{
                System.out.println("Você já esta aposentado");
            }
        } else {
            System.out.println("Fim do programa.");
        }
    }
}
