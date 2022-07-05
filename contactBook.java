import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try{
            while(true) {

                System.out.print("Tecle 1 para adicionar e 2 para buscar: ");
                int escolha = tec.nextInt();
            
                FileWriter fw;
                fw = new FileWriter("file.txt", true);

            if(escolha == 1) {

                System.out.print("Escreva o nome: ");
                String nome = tec.next();
                fw.write(nome + "\n");

                System.out.print("Escreva o número: ");
                String numero = tec.next();
                fw.write(numero + "\n");

                System.out.println("Contato adicionado com sucesso!" + "\n");

            }else if(escolha == 2) {
                FileReader fr;
                fr = new FileReader("file.txt");
                Scanner tec2 = new Scanner(fr);

                System.out.print("Digite o nome do contato que deseja procurar: ");
                String nome2 = tec.next();

                while(tec2.hasNextLine()) {
                    String entrada = tec2.next();
                    String entrada2 = tec2.next();

                    if(entrada.equals(nome2)) {
                        System.out.println("\n" + "Contato encontrado (nome / telefone): ");
                        System.out.println(entrada + " | " + entrada2 + "\n");
                        break; 
                    }
                }
        }
        fw.close();
    }

        }catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
}                 