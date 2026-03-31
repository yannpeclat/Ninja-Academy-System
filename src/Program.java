import java.util.Locale;
import java.util.Scanner;
import entities.Ninja;
import entities.Uchiha;
import entities.Uzumaki;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Ninja[] ninjas = new Ninja[5];
        int ninjasCadastrados = 0;
        int opcao;

        do {
            // MENU
            System.out.println("═".repeat(20));
            System.out.println("════ NINJA MENU ════");
            System.out.println("═".repeat(20));
            System.out.println("1. Criar Ninja");
            System.out.println("2. Listar Ninja");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            input.nextLine();  // Limpeza de Buffer

            switch(opcao) {
                case 1:
                    // Aqui quando o usuario selecionar essa opcao 1, vai abrir um outro menu pedindo para que ele informe se ele quer um Ninja Uchiha ou um Ninja Uzumaki
                    // Assim que pedir para o usuario escolher o tipo de ninja, voce vai pedir para ele informar o nome, a idade e a aldeia do ninja, e depois disso voce vai criar o ninja e armazenar ele no array de ninjas.
                    if(ninjasCadastrados >= 5) {
                        System.out.println("\n📦 Academia lotada!\n");
                        continue;
                    }

                    System.out.println("\nEscolha o tipo de Ninja:");
                    System.out.println("1. Uchiha");
                    System.out.println("2. Uzumaki");
                    System.out.print("Escolha uma opcao: ");
                    int tipoNinja = input.nextInt();
                    input.nextLine();  // Limpeza de Buffer

                    Ninja ninjaNovo = switch(tipoNinja) {
                        case 1 ->  new Uchiha();
                        case 2 ->  new Uzumaki();
                        default -> null;
                    };

                    if (ninjaNovo != null) {
                        // Dados comuns para todos os ninjas
                        System.out.print("Digite o nome do ninja: ");
                        ninjaNovo.nome = input.nextLine();
                        System.out.print("Digite a idade do ninja: ");
                        ninjaNovo.idade = input.nextInt();
                        input.nextLine();  // Limpeza de Buffer
                        System.out.print("Digite a aldeia do ninja: ");
                        ninjaNovo.aldeia = input.nextLine();
                    } else {
                        System.out.println("❌ Inválido! Escolha entre as opcoes");
                        continue;
                    }

                    // Armazenar agora
                    ninjas[ninjasCadastrados] = ninjaNovo;
                    ninjasCadastrados++;
                    System.out.println("\n✅ " + ninjaNovo.nome + " criado!");
                    break;
                case 2:
                    // Aqui voce vai Listar os ninjas cadastrados, e vai poder selecionar o ninja que voce quer mostrar as informacoes.
                    if(ninjasCadastrados == 0) {
                        System.out.println("\nNenhum ninja cadastrado ainda!");
                    } else {
                        System.out.println("\nNinjas Cadastrados:");
                        for(int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + " | " + ninjas[i].nome);
                        }
                        System.out.print("\nEscolha um ninja para ver detalhes (0 para voltar): ");
                        int escolhaNinja = input.nextInt();
                        input.nextLine();  // Limpeza de Buffer

                        if(escolhaNinja > 0 && escolhaNinja <= ninjasCadastrados) {
                            System.out.println("\n=== Detalhes do Ninja ===");
                            ninjas[escolhaNinja - 1].mostrarInformacoes();
                        } else if (escolhaNinja != 0) {
                            System.out.println("\nOpcao invalida! Voltando ao menu principal.");
                        }
                    }
                    break;
                case 0:
                    // Aqui o usuario Seleciona sair do programa simples acredito que nao tenha o que complementar aqui
                    System.out.println("Saindo do programa... Ate logo!");
                    break;
                default:
                    // Ai informa uma opcao invalida se o usuario digitar qualquer coisa ou qualquer numero que nao se encontra na opcao 1, 2 ou 0.
                    System.out.println("Opcao invalida! Tente novamente.");
            }

        } while (opcao != 0);

        input.close();
    }
}