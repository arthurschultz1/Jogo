import java.util.Scanner;
import java.util.Random;

public class App {
    public static int Computador;
    public static int Jogador;

    public static void main(String[] args) throws Exception {
        String[] Opcoes = new String[3];
        Opcoes[0] = "Pedra";
        Opcoes[1] = "Papel";
        Opcoes[2] = "Tesoura";

        LerJogada();

        System.out.format("Voce: %s\n", Opcoes[Jogador - 1]);
        System.out.format("Computador: %s\n", Opcoes[Computador - 1]);

        RetornaVencedor();
    }

    public static void LerJogada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Pedra, 2 - Papel, 3 - Tesoura ");
        Jogador = sc.nextInt();

        if (ValidaJogada(Jogador)) {
            Computador = new Random().nextInt(3) + 1;
        } else {
            System.out.println("Escolha invalida");
            LerJogada();
        }
    }

    public static boolean ValidaJogada(int Escolha) {
        if ((Escolha < 1) || (Escolha > 3)) {
            return false;
        }else{
            return true;
        }

    }

    public static void RetornaVencedor() {
        if (Jogador == Computador) {
            System.out.println("Empate");
        } else {
            switch (Jogador) {
                case 1:
                    if (Computador == 2) {
                        System.out.println("Voce perdeu!!");
                    }

                    if (Computador == 3) {
                        System.out.println("Voce ganhou!!");
                    }
                    break;
                
                case 2:
                    if (Computador == 3) {
                        System.out.println("Voce perdeu!!");
                    }

                    if (Computador == 1) {
                        System.out.println("Voce ganhou!!");
                    }
                    break;

                case 3:
                    if (Computador == 1) {
                        System.out.println("Voce perdeu!!");
                    }

                    if (Computador == 2) {
                        System.out.println("Voce ganhou!!");
                    }
                    break;
            }
        }    
    }
}
