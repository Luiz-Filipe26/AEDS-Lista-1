package lista1aeds;

import java.util.Scanner;

public class Lista1AEDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lista listaCandidatos = new Lista();
        Candidato candidato;
        int op = 0;
        int chave, ordemCursos[] = new int[3];
        double notaFinal;

        while (op != 3) {
            System.out.println("\n1) Inserir um novo candidato");
            System.out.println("2)Listar candidatos");
            System.out.println("3)Sair");
            
            System.out.print("\nInforme a opção: ");
            op = in.nextInt();
            in.nextLine(); //limpar buffer
            
            switch (op) {
                case 1:
                    System.out.println("\n-Inserir um novo candidato - ");
                    
                    System.out.print("\nInforme a chave: ");
                    chave = in.nextInt();
                    in.nextLine(); //limpar buffer
                    
                    System.out.print("Informe nota final: ");
                    notaFinal = in.nextInt();
                    
                    System.out.println("Escolha a ordem dos cursos (1, 2, 3)");
                    //System.out.print("Curso 1:");
                    ordemCursos[0] = in.nextInt();
                    //System.out.print("Curso 2:");
                    ordemCursos[1] = in.nextInt();
                    //System.out.print("Curso 3:");
                    ordemCursos[2] = in.nextInt();
                    
                    candidato = new Candidato(chave, notaFinal);
                    candidato.setOpcao(ordemCursos);
                    
                    listaCandidatos.insere(candidato);
                    
                    break;
                case 2:
                    System.out.println("\n- Listar candidatos -");
                    listaCandidatos.imprime();
                    break;
                case 3:
                    System.out.println("\n- Fim -");
                    break;
                default:
                    System.out.println("\nValor inválido");
                    break;
            }
        }
    }

}
