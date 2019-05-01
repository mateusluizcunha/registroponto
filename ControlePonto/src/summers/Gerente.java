package summers;

public class Gerente extends Funcionario {

    private String login;
    private String senha;

    public String getlogin(){
        return login;
    }
    public void setlogin(String login){
        this.login=login;
    }

    public String getsenha(){
        return senha;
    }
    public void setsenha(String senha){
        this.senha=senha;
    }

}