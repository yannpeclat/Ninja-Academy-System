import java.util.Locale;
import java.util.Scanner;
import model.entities.Ninja;
import model.entities.Uchiha;
import model.entities.Uzumaki;

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
            System.out.println("3. Excluir Ninja");
            System.out.println("4. Editar Ninja");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            input.nextLine();  // Limpeza de Buffer

            switch(opcao) {
                case 1:
                    // Aqui quando o usuario selecionar essa opcao 1, vai abrir um outro menu pedindo para que ele informe se ele quer um Ninja Uchiha ou um Ninja Uzumaki
                    // Assim que pedir para o usuario escolher o tipo de ninja, voce vai pedir para ele informar o nome, a idade e a aldeia do ninja, e depois disso voce vai criar o ninja e armazenar ele no array de ninjas.
                    if (ninjasCadastrados >= 5) {
                        System.out.println("\n📦 Academia lotada!\n");
                        continue;
                    }

                    int maxClans = 2;
                    int tipoNinja;
                    // Validacao com Do while criando um um variavel que se chama maxClans para que futuramente caso tenha mais clans eu so aumentar essa variavel e crio em cima uma variavel tipoNinja so para
                    // guardar a resposta do usuario
                    do {
                        System.out.println("\n=== Escolha o tipo de Ninja ===");
                        System.out.println("1. Uchiha");
                        System.out.println("2. Uzumaki");
                        System.out.print("Escolha uma opcao: ");
                        tipoNinja = input.nextInt();
                        input.nextLine();  // Limpeza de Buffer

                        if (tipoNinja < 1 || tipoNinja > maxClans) {
                            System.out.println("\n❌ Opcao invalida! Apenas as opçoes do menu!");
                        }
                    } while (tipoNinja < 1 || tipoNinja > maxClans);

                    // Coleta dados
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Idade: ");
                    int idade = input.nextInt();
                    input.nextLine();
                    System.out.print("Aldeia: ");
                    String aldeia = input.nextLine();

                    Ninja ninjaNovo = switch(tipoNinja) {
                        case 1 -> new Uchiha(nome, idade, aldeia);
                        case 2 -> new Uzumaki(nome, idade, aldeia);
                        default -> null;  // Backup impossível
                    };

                    // Armazenar agora
                    ninjas[ninjasCadastrados] = ninjaNovo;
                    ninjasCadastrados++;
                    System.out.println("\n✅ " + ninjaNovo.nome + " criado!");
                    break;
                case 2:
                    // Aqui voce vai Listar os ninjas cadastrados, e vai poder selecionar o ninja que voce quer mostrar as informacoes.
                    if (ninjasCadastrados == 0) {
                        System.out.println("\n❌ Nenhum ninja cadastrado ainda!");
                    } else {
                        System.out.println("\n=== Ninjas Cadastrados ===");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + " | " + ninjas[i].nome);
                        }
                        System.out.print("\nEscolha um ninja para ver detalhes (0 para voltar): ");
                        int escolhaNinja = input.nextInt();
                        input.nextLine();  // Limpeza de Buffer

                        if (escolhaNinja > 0 && escolhaNinja <= ninjasCadastrados) {
                            System.out.println("\n=== Detalhes do Ninja ===");
                            ninjas[escolhaNinja - 1].mostrarInformacoes();
                        } else if (escolhaNinja != 0) {
                            System.out.println("\n❌ Opcao invalida! Voltando ao menu principal.");
                        }
                    }
                    break;
                case 3:
                    // Aqui voce vai Excluir um ninja cadastrado, voce vai mostrar a lista de ninjas cadastrados e o usuario vai escolher qual ninja ele quer excluir, e depois disso voce vai remover o ninja do array de ninjas.
                    if (ninjasCadastrados == 0) {
                        System.out.println("\n❌ Nenhum ninja cadastrado para excluir!");
                    } else {
                        System.out.println("\n=== Ninjas Cadastrados ===");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + " | " + ninjas[i].nome);
                        }
                        System.out.print("\nEscolha um ninja para excluir (0 para voltar): ");
                        int escolhaExcluir = input.nextInt();
                        input.nextLine(); // Limpeza de Buffer

                        if (escolhaExcluir > 0 && escolhaExcluir <= ninjasCadastrados) {
                            String nomeExcluido = ninjas[escolhaExcluir - 1].nome;
                            for (int i = escolhaExcluir - 1; i < ninjasCadastrados - 1; i++) {
                                ninjas[i] = ninjas[i + 1];
                            }
                            ninjas[ninjasCadastrados - 1] = null;
                            ninjasCadastrados--;
                            System.out.println("\n✅\uD83D\uDDD1\uFE0F " + nomeExcluido + " excluido!");
                        } else if (escolhaExcluir != 0) {
                            System.out.println("\n❌ Opcao invalida! Voltando ao menu principal.");
                        }
                    }
                    break;
                case 4:
                    // Aqui voce vai Editar um ninja cadastrado, voce vai mostrar a lista de ninjas cadastrados e o usuario vai escolher qual ninja ele quer editar ou voltar para o menu principal
                    // Logo em seguida vai mostrar qual atributo do ninja ele quer editar, ou se vai ser TODOS os atribuitos, logo em seguida vai ter uma confirmacao de ninja editado mostrando
                    // Todas as novas informacoes do ninja editado, e depois disso voce vai atualizar as informacoes do ninja no array de ninjas.
                    if (ninjasCadastrados == 0) {
                        System.out.println("\n❌ Nenhum ninja cadastrado para editar!");
                    } else {
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + " | " + ninjas[i].nome);
                        }
                        System.out.println("\nEscolha um ninja para editar (0 para voltar): ");
                        int escolhaEditar = input.nextInt();
                        input.nextLine(); // Limpeza de Buffer

                        if (escolhaEditar > 0 && escolhaEditar <= ninjasCadastrados) {
                            Ninja ninjaEditado = ninjas[escolhaEditar - 1];
                            System.out.println("\n=== Editar Ninja: " + ninjaEditado.nome + " ===");
                            System.out.println("1. Editar nome");
                            System.out.println("2. Editar idade");
                            System.out.println("3. Editar aldeia");
                            System.out.println("4. Editar todos os atributos");
                            System.out.println("0. Voltar");
                            System.out.print("Escolha uma opcao: ");
                            int escolhaAtributo = input.nextInt();
                            input.nextLine(); // Limpeza de Buffer

                            switch (escolhaAtributo) {
                                case 1 -> {
                                    System.out.print("Digite o novo nome: ");
                                    ninjaEditado.nome = input.nextLine();
                                }
                                case 2 -> {
                                    System.out.print("Digite a nova idade: ");
                                    ninjaEditado.idade = input.nextInt();
                                    input.nextLine(); // Limpeza de Buffer
                                }
                                case 3 -> {
                                    System.out.print("Digite a nova aldeia: ");
                                    ninjaEditado.aldeia = input.nextLine();
                                }
                                case 4 -> {
                                    System.out.print("Digite o novo nome: ");
                                    ninjaEditado.nome = input.nextLine();
                                    System.out.print("Digite a nova idade: ");
                                    ninjaEditado.idade = input.nextInt();
                                    input.nextLine(); // Limpeza de Buffer
                                    System.out.print("Digite o novo aldeia: ");
                                    ninjaEditado.aldeia = input.nextLine();
                                }
                                default -> {
                                    System.out.println("\n❌ Opcao invalida! Voltando ao menu principal.");
                                    continue;
                                }
                            }
                            System.out.println("\n✅ " + ninjaEditado.nome + " editado!");
                            System.out.println("\n=== Detalhes do Ninja Editado ===");
                            ninjaEditado.mostrarInformacoes();
                        } else if (escolhaEditar != 0) {
                            System.out.println("\n❌ Opcao invalida! Voltando ao menu principal.");
                        }
                    }
                    break;
                case 0:
                    // Aqui o usuario Seleciona sair do programa simples acredito que nao tenha o que complementar aqui
                    System.out.println("Saindo do programa... Ate logo!");
                    break;
                default:
                    // Ai informa uma opcao invalida se o usuario digitar qualquer coisa ou qualquer numero que nao se encontra na opcao 1, 2 ou 0.
                    System.out.println("❌ Opcao invalida! Tente novamente.");
            }

        } while (opcao != 0);

        input.close();
    }
}