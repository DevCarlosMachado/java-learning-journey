import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //Dados do aluno
        String nome;
        String endereco;
        int idade;

        int opcaoSerie;
        int opcaoTurno;

        String serie = "";
        String turno = "";

        double mensalidade = 0;

        System.out.println("===== SISTEMA DE CADASTRO ESCOLAR =====");

        //Cadastro das informações
        System.out.print("Digite o nome completo do aluno: ");
        nome = scanner.nextLine();

        System.out.print("Digite o endereço do aluno: ");
        endereco = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        idade = scanner.nextInt();

        //Escolha do turno
        System.out.println("\n===== ESCOLHA DO TURNO =====");

        System.out.println("1 - Manhã");
        System.out.println("2 - Tarde");

        System.out.print("Escolha uma opção: ");
        opcaoTurno = scanner.nextInt();

        switch (opcaoTurno) {
            case 1:
                turno = "Manhã";
                break;

            case 2:
                turno = "Tarde";
                break;

            default:
                turno = "Não informado";
        }

        //Escolha da série
        System.out.println("\n===== ESCOLHA A SÉRIE DO ALUNO =====");

        System.out.println("1 - 6° Ano Fundamental II");
        System.out.println("2 - 7° Ano Fundamental II");
        System.out.println("3 - 8° Ano Fundamental II");
        System.out.println("4 - 9° Ano Fundamental II");
        System.out.println("5 - 1° Ano Ensino Médio");
        System.out.println("6 - 2° Ano Ensino Médio");
        System.out.println("7 - 3° Ano Ensino Médio");

        System.out.print("Escolha uma opção: ");
        opcaoSerie = scanner.nextInt();

        switch (opcaoSerie) {
            case 1:
                serie = "6º Ano Fundamental II";
                mensalidade = 650;
                break;

            case 2:
                serie = "7º Ano Fundamental II";
                mensalidade = 700;
                break;

            case 3:
                serie = "8º Ano Fundamental II";
                mensalidade = 790;
                break;

            case 4:
                serie = "9º Ano Fundamental II";
                mensalidade = 900;
                break;

            case 5:
                serie = "1º Ano Ensino Médio";
                mensalidade = 1100;
                break;

            case 6:
                serie = "2º Ano Ensino Médio";
                mensalidade = 1400;
                break;

            case 7:
                serie = "3º Ano Ensino Médio";
                mensalidade = 1900;
                break;

            default:
                System.out.println("Série inválida!");
        }

        // Exibição do cadastro

        System.out.println("\n===== CADASTRO FINAL =====");

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Série: " + serie);
        System.out.println("Turno: " + turno);
        System.out.println("Mensalidade: R$ " + mensalidade);

        scanner.close();

    }
}
