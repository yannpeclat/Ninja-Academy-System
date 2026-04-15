import java.util.Locale;
import java.util.Scanner;
import model.entities.Ninja;
import model.entities.Uchiha;
import model.entities.Uzumaki;
import model.services.NinjaAcademyService;

public class Program {
    public static void main(String[] args) {
        NinjaAcademyService sistema = new NinjaAcademyService();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----------------------------------");
            System.out.println("----- Ninja Academy System -------");
            System.out.println("----------------------------------");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Registrar Missão");
            System.out.println("0. Sair");
            opcao = sistema.lerInteiro("Escolha: "); // Reutiliza validação

            switch (opcao) {
                case 1 -> sistema.cadastrarNinja();
                case 2 -> sistema.listarNinjas();
                case 3 -> sistema.registrarMissao();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("❌ Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}