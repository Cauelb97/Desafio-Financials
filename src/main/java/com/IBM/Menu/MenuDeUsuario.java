package com.IBM.Menu;

import java.util.Scanner;

public class MenuDeUsuario {
	
	public static int validacaoInt(Scanner leitor) {
        int inputUsuario = 0;
        //Esse codigo verifica se o usuario digitou uma opção valida
        if (leitor.hasNextInt()) {
            inputUsuario = leitor.nextInt();
        } else {
            leitor.next();
            System.out.println("Opção não existe. Tente novamente: ");
        }
        return inputUsuario;
    }

    public static int entradaUsuarioPrincipal(Scanner scanner) {
        int entrada;
        do {
    		System.out.println("1 - Criar uma Base de dados");//onboarding
    		System.out.println("2 - Consultar a Base de dados");
    		System.out.println("3 - Alterar Base de dados");
    		System.out.println("4 - Deletar Base de dados");
    		System.out.println("5 - Sair ");
            entrada = MenuDeUsuario.validacaoInt(scanner);
        } while (entrada < 1 || entrada > 5);
        return entrada;
    }
    
    public static int entradaUsuarioSecudario(Scanner scanner) {
        int entrada;
        do {
			System.out.println("1 - Mostrar toda a Base de Dados");
			System.out.println("2 - Filtrar por indicador");
			System.out.println("3 - Filtrar por data de referencia");
			System.out.println("4 - Filtrar por Numero de Respondentes");
			System.out.println("5 - Sair ");
            entrada = MenuDeUsuario.validacaoInt(scanner);
        } while (entrada < 1 || entrada > 5);
        return entrada;
    }

}
