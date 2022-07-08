import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class contactBook {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try{
            while(true) {

                System.out.println("+----------------------------+");
                System.out.println("| Digite (1) para adicionar  |");
                System.out.println("| Digite (2) para buscar     |");
                System.out.println("| Digite (3) para listar     |");
                System.out.println("| Digite (0) para sair       |");
                System.out.println("+----------------------------+");
                System.out.println(" ");

                System.out.print("----> ");
                int escolha = tec.nextInt();
            
                FileWriter fw = new FileWriter("doc.txt", true);

            Thread.sleep(500);
            if(escolha == 1) {
                System.out.print("Escreva o nome: ");
                String nome = tec.next();
                nome = nome.toUpperCase();
                fw.write(nome + "\n");

                System.out.print("Escreva o número: ");
                String numero = tec.next();
                fw.write(numero + "\n");

                System.out.println("Aguarde, estamos carregando estas informações!");
                for(int i = 0; i < 5; i++) {
                    System.out.print(".");
                    Thread.sleep(700);
                }
                System.out.println(" Contato adicionado com sucesso!" + "\n");
            Thread.sleep(500);
            }
            else if(escolha == 2) {

                FileReader fr = new FileReader("doc.txt");
                Scanner tec2 = new Scanner(fr);

                System.out.print("Digite o nome do contato que deseja procurar: ");
                String nome2 = tec.next();
                nome2 = nome2.toUpperCase();

                System.out.println("Buscando");
                for(int i = 0; i < 5; i++) {
                    System.out.print(".");
                    Thread.sleep(700);
                }

                while(tec2.hasNextLine()) {
                    String entrada = tec2.next();
                    String entrada2 = tec2.next();

                    if(entrada.equals(nome2)) {
                        System.out.println("\n" + "Contato encontrado (nome / telefone): ");
                        System.out.println(entrada + " | " + entrada2 + "\n");
                        break; 
                    }
                }
            Thread.sleep(500);
            }
            else if(escolha == 3) {
                FileReader fr = new FileReader("doc.txt");
                Scanner tec2 = new Scanner(fr);

                System.out.println("Nome | Telefone");

                while(tec2.hasNextLine()) {
                    String entrada = tec2.next();
                    String entrada2 = tec2.next();

                    System.out.println(entrada + " - " + entrada2 + "\n");

                }  
            Thread.sleep(500);
            }
            else if(escolha == 0) {
                System.out.println("Aguarde, encerrando programa!");
                for(int i = 0; i < 5; i++) {
                    System.out.print(".");
                    Thread.sleep(700);
                }
                System.out.println("Programa Encerrado!");
                break;
            }
        fw.close();
    }

        }catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
}                 
