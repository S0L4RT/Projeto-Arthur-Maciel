
package login;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
 private static Map<String, String> usuarios = new HashMap<>();

 
    public static void main(String[] args) {
    usuarios.put("usuario1", "senha123");
        usuarios.put("usuario2", "abc123");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuário:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        if (validarCredenciais(nomeUsuario, senha)) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + nomeUsuario + "!");
        } else {
            System.out.println("Credenciais inválidas. Tente novamente.");
        }
    }

    private static boolean validarCredenciais(String nomeUsuario, String senha) {
        return usuarios.containsKey(nomeUsuario) && usuarios.get(nomeUsuario).equals(senha);
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
