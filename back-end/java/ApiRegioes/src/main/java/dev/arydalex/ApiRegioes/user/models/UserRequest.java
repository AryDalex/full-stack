package dev.arydalex.ApiRegioes.user.models;

public class UserRequest {

    private String userName;
    private String email;
    private String password;
    private String uf;
    private String city;

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUf() {
        return uf;
    }

    public String getCity() {
        return city;
    }

}
