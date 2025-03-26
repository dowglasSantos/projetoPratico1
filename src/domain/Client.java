package domain;

import java.util.Objects;

public class Client {
    private String name;
    private String cpf;
    private Long tel;
    private String end;
    private Integer number;
    private String city;
    private String state;

    public Client() {
        this.name = "";
        this.cpf = "";
        this.tel = null;
        this.end =  null;
        this.number = 0;
        this.city = "";
        this.state = "";
    }

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public Client(String name, String cpf, Long tel, String end, Integer number, String city, String state) {
        this.name = name;
        this.cpf = cpf;
        this.tel = tel;
        this.end = end;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(String  tel) {
        this.tel = Long.valueOf(tel);
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = Integer.valueOf(number);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", tel=" + tel +
                ", end='" + end + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(cpf, client.cpf) && Objects.equals(tel, client.tel) && Objects.equals(end, client.end) && Objects.equals(number, client.number) && Objects.equals(city, client.city) && Objects.equals(state, client.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, tel, end, number, city, state);
    }
}