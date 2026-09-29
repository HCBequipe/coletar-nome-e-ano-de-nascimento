import java.time.LocalDate;
import java.util.Scanner;

public class calcularidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Recebe o nome do usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // 2. Recebe o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // 3. Pega o ano atual dinamicamente do sistema
        int anoAtual = LocalDate.now().getYear();

        // 4. Calcula a idade
        int idade = anoAtual - anoNascimento;

        // 5. Exibe a mensagem final
        System.out.printf("Olá, %s. Você tem %d anos.\n", nome, idade);

        scanner.close();
    }
}