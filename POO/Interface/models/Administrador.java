public class Administrador implements Autenticavel {
    private String login;
    private String senhaMestra;

    public Administrador(String login, String senhaMestra) {
        this.login = login;
        this.senhaMestra = senhaMestra;
    }

    @Override
    public boolean autenticar(String senha) {
        // Verifica se a senha informada corresponde à senha mestra do administrador[cite: 9]
        return this.senhaMestra.equals(senha);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhaMestra() {
        return senhaMestra;
    }

    public void setSenhaMestra(String senhaMestra) {
        this.senhaMestra = senhaMestra;
    }
}