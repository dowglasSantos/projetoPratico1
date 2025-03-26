import java.util.Scanner;
import dao.ClientMapDAO;
import domain.Client;


public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Client client = new Client();
        ClientMapDAO clientMapDAO = new ClientMapDAO();

        System.out.println("***** Projeto Pratico 1 *****");

        String option = "";
        String menu;

        do {
            System.out.println("Digite 1 para cadastrar um cliente:");
            System.out.println("Digite 2 para deletar um cliente:");
            System.out.println("Digite 3 para atualizar os dados de um cliente:");
            System.out.println("Digite 4 para buscar um cliente especifico:");
            System.out.println("Digite 5 para ver sua lista de clientes:");
            System.out.println("Digite 0 para sair:");
            System.out.print("Informe uma das opções: ");
            menu = s.next();

            if(menu.equals("0")) {
                System.out.println("Programa finalizado!");
                break;
            } else if(menu.equals("1")) {
                System.out.println("***** Cadastro *****");

                System.out.print("Nome do cliente: ");
                client.setName(s.next());

                System.out.println(" ");

                System.out.print("CPF do cliente: ");
                client.setCpf(s.next());

                System.out.println(" ");

                System.out.print("Telefone do cliente: ");
                client.setTel(s.next());

                System.out.println(" ");

                System.out.print("Endereço do cliente(nome da rua): ");
                client.setEnd(s.next());

                System.out.println(" ");

                System.out.print("Numero da Residência do cliente: ");
                client.setNumber(s.next());

                System.out.println(" ");

                System.out.print("Cidade do cliente: ");
                client.setCity(s.next());

                System.out.println(" ");

                System.out.print("Estado do cliente: ");
                client.setState(s.next());

                Client createClient = new Client(
                        client.getName(),
                        client.getCpf(),
                        client.getTel(),
                        client.getEnd(),
                        client.getNumber(),
                        client.getCity(),
                        client.getState()
                );

                clientMapDAO.register(createClient);
            } else if(menu.equals("2")) {
                System.out.println("***** Remover Cliente *****");
                System.out.println(" ");
                System.out.println("Lista de Clientes:");
                clientMapDAO.getClients();
                System.out.println("Digite o cpf do cliente que deseja remover:");
                client.setCpf(s.next());
                clientMapDAO.delete(client.getCpf());

            } else if(menu.equals("3")) {
                System.out.println("***** Atualizar *****");
                System.out.println(" ");
                if(!clientMapDAO.getClients()) {
                    break;
                } else {
                    System.out.println(" ");
                    System.out.print("Informe o cpf do cliente que deseja atualizar: ");
                    clientMapDAO.search(s.next());
                    System.out.println("Informe os novos dados do cliente:");

                    System.out.print("Nome do cliente: ");
                    client.setName(s.next());

                    System.out.println(" ");

                    System.out.println(" ");

                    System.out.print("Telefone do cliente: ");
                    client.setTel(s.next());

                    System.out.println(" ");

                    System.out.print("Endereço do cliente(nome da rua): ");
                    client.setEnd(s.next());

                    System.out.println(" ");

                    System.out.print("Numero da Residência do cliente: ");
                    client.setNumber(s.next());

                    System.out.println(" ");

                    System.out.print("Cidade do cliente: ");
                    client.setCity(s.next());

                    System.out.println(" ");

                    System.out.print("Estado do cliente: ");
                    client.setState(s.next());

                    Client updateClient = new Client(
                            client.getName(),
                            client.getCpf(),
                            client.getTel(),
                            client.getEnd(),
                            client.getNumber(),
                            client.getCity(),
                            client.getState()
                    );

                    clientMapDAO.update(updateClient);
                }
            } else if(menu.equals("4")) {
                System.out.println("***** Buscar *****");
                System.out.println(" ");
                System.out.print("Informe o cpf do cliente que deseja buscar: ");
                client.setCpf(s.next());
                clientMapDAO.search(client.getCpf());

            } else if(menu.equals("5")) {
                System.out.println("***** Lista de Clientes *****");
                clientMapDAO.getClients();
            }

            System.out.println(" ");
            System.out.print("Deseja Voltar ao menu anterior:(sim/não)");
            option = s.next();
        } while(option.equalsIgnoreCase("sim")); {
            s.close();
        };



    }
}