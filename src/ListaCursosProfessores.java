import java.util.ArrayList;
import java.util.Scanner;

public class ListaCursosProfessores {
    /*------------------ FUNCÕES ------------------*/

    //Função para listar os cursos
    public static void listarCursos(ArrayList<String> listaCurso) {
        if (listaCurso.isEmpty()) {
            System.out.println("A lista de cursos está vazia.");
        } else {
            for (int i = 0; i < listaCurso.size(); i++) {
                System.out.println(i + " - " + listaCurso.get(i));
            }
        }
    }

    //Função para listar os professores
    public static void listarProf(ArrayList<String> listaProf) {
        if (listaProf.isEmpty()) {
            System.out.println("A lista de professores está vazia.");
        } else {
            for (int i = 0; i < listaProf.size(); i++) {
                System.out.println(i + " - " + listaProf.get(i));
            }
        }
    }

    //Função para escolher listar ou cursos ou professores
    public static void escolhaListar(Scanner entrada, ArrayList<String> listaCurso, ArrayList<String> listaProf) {
        System.out.println("+----------- LISTAR -------------+");
        System.out.println("|   1 - Cursos                   |");
        System.out.println("|   2 - Professores              |");
        System.out.println("+--------------------------------+");
        System.out.print("Informe o número: ");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                listarCursos(listaCurso);
                break;
            case 2:
                listarProf(listaProf);
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.print("\n");
                escolhaListar(entrada, listaCurso, listaProf);
                break;
        }
    }

    //Função para adicionar um curso
    public static void addCurso(Scanner entrada, ArrayList<String> listaCurso) {
        System.out.print("Informe o nome do curso: ");
        String curso = entrada.next();
        listaCurso.add(curso);
    }

    //Função para adicionar um professor
    public static void addProf(Scanner entrada, ArrayList<String> listaProf) {
        System.out.print("Informe o nome do professor: ");
        String prof = entrada.next();
        listaProf.add(prof);
    }

    //Função para adicionar ou um curso ou um professor
    public static void escolhaAdd(Scanner entrada, ArrayList<String> listaCurso, ArrayList<String> listaProf) {
        System.out.println("+---------- ADICIONAR -----------+");
        System.out.println("|   1 - Curso                    |");
        System.out.println("|   2 - Professor                |");
        System.out.println("+--------------------------------+");
        System.out.print("Informe o número: ");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                addCurso(entrada, listaCurso);
                break;
            case 2:
                addProf(entrada, listaProf);
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.print("\n");
                escolhaAdd(entrada, listaCurso, listaProf);
                break;
        }
    }

    /*--------------------- EXECUÇÃO --------------------- */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo a lista de Cursos e Professores");

        ArrayList<String> listaCurso = new ArrayList<>();
        ArrayList<String> listaProf = new ArrayList<>();

        do {
            System.out.println("+------------- MENU -------------+");
            System.out.println("|   1 - Listar                   |");
            System.out.println("|   2 - Adicionar                |");
            System.out.println("+--------------------------------+");
            System.out.println("|   0 - Sair                     |");
            System.out.println("+--------------------------------+");
            System.out.print("Informe o número: ");

            int escolha = entrada.nextInt();

            System.out.print("\n");

            switch (escolha) {

                case 1:
                    escolhaListar(entrada, listaCurso, listaProf);
                    System.out.print("\n");
                    break;

                case 2:
                    escolhaAdd(entrada, listaCurso, listaProf);
                    System.out.print("\n");
                    break;

                case 0:
                    System.out.print("Finalizando o programa.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
                    System.out.print("\n");
                    break;
            }
        } while (true);


    }
}
