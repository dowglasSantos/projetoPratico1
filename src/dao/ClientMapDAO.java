package dao;
import java.util.Map;
import java.util.HashMap;
import domain.Client;

public class ClientMapDAO implements IClientDAO{
    private Map<String, Client> data;
    Client client = new Client();

    public ClientMapDAO () {
        data = new HashMap<>();
    };

    public Boolean register(Client client) {
        System.out.println("***** register *****");
        if (data.containsKey(client.getCpf())) {
            System.out.println("Cliente já cadastrado!!");
            // Cliente não foi cadastrado pos já existe.
            return false;
        } else {
            data.put(client.getCpf(), client);
            System.out.println("Cliente cadastrado com sucesso!!");
            // Cliente foi cadastrado pois.
            return true;
        }
    }

    public void delete(String cpf) {
        if(data.containsKey(cpf)) {
            System.out.println("Cliente Removido: " + data.get(cpf));
            data.remove(cpf);
        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    public Client update(Client client) {
        if(data.isEmpty()) {
            System.out.println("Lista de clientes vazia!!");
            return null;
        } else {
            if(data.containsKey(client.getCpf())) {
                Client updateClient = this.data.get(client.getCpf());

                System.out.println("Cliente: " + updateClient);

                updateClient.setName(client.getName());
                updateClient.setTel(client.getTel().toString());
                updateClient.setEnd(client.getEnd());
                updateClient.setNumber(client.getNumber().toString());
                updateClient.setCity(client.getCity());
                updateClient.setState(client.getState());

                System.out.println("Cliente atualizado:");
                return updateClient;
            } else {
                System.out.println("Cliente não encontrado!!");
                return null;
            }
        }
    }

    public void search(String cpf) {
        if(data.isEmpty()) {
            System.out.println("Sua lista de clientes está vazia!!");
        } else {
            if(data.containsKey(cpf)) {
                Client searchClient = data.get(cpf);
                System.out.println("Cliente" + searchClient);
            } else {
                System.out.println("Cliente não encontrado");
            }
        }
    }

    public Boolean getClients() {
        if(data.isEmpty()) {
            System.out.println("Sua lista de clientes está vazia!!");
            return false;
        }

        for(Client printClient : data.values()) {
            System.out.println("Cliente: " + printClient);
        }

        return true;
    }
}
