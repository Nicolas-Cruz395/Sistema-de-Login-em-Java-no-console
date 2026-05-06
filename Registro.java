import java.util.Scanner;

class Usuario {
    String nome;
    String login;
    String senha;
    String login_criado;
    String senha_criada;
}

public class Login {
    public static void main(String []args){
        Usuario s1 = new Usuario();
        Scanner sc = new Scanner(System.in);

        int tentativa = 0;
        int limite = 3;

        System.out.println("Olá, digite seu nome: ");
        s1.nome = sc.nextLine();

        System.out.printf("\nOlá %s seja bem vindo", s1.nome );

        while (true) {

            System.out.println("\n==== BANCO CENTRO =====");
            System.out.println("[1] - Cadastro");
            System.out.println("[2] - Login");
            System.out.println("[3] - Sair");
            System.out.print("Escolher: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Crie seu login: ");
                s1.login_criado = sc.nextLine();

                System.out.println("Crie sua senha: ");
                s1.senha_criada = sc.nextLine();

            } else if (opcao == 2) {

                if (s1.login_criado == null || s1.senha_criada == null){
                System.out.println("Você precisa ter um cadastro!");
                continue;
                
                }

                System.out.println("Digite seu login: ");
                s1.login = sc.nextLine();

                System.out.println("Digite sua senha: ");
                s1.senha = sc.nextLine();

                if (s1.login_criado.equals(s1.login) && s1.senha_criada.equals(s1.senha)){
                    System.out.println("Acesso Autorizado!");
                    break;

                } else if (!s1.login_criado.equals(s1.login) && s1.senha_criada.equals(s1.senha)){
                    System.out.println("Login ou senha incorretos! ");
                    tentativa++;

                } else if (s1.login_criado.equals(s1.login) && !s1.senha_criada.equals(s1.senha)){
                    System.out.println("Login ou senha incorretos! ");
                    tentativa++;

                } else {
                    System.out.println("Login e senha Incorreto! ");
                    tentativa++;
                } 
                if (tentativa >= limite) {
                    System.out.println("limite de tentativas excedido!");
                    break;

                } else {
                    System.out.printf("\n%s, você tem %d tentativas restantes.\n", s1.nome, (limite - tentativa));
                }


            } else if (opcao == 3){
                System.out.print("Acesso Encerrado");
                break;
            

            } else {
                System.out.printf("\n%d não é uma escolha valida!, selecione uma valida.\n", opcao);
                continue;
            }

        } sc.close();
    }
}
