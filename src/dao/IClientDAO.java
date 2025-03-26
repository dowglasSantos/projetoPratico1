package dao;
import java.util.Collection;
import domain.Client;

public interface IClientDAO {
    public Boolean register(Client client);

    public void delete(String cpf);

    public Client update(Client client);

    public void search(String cpf);

    public Boolean getClients();
}