package summers;

public class Secretaria extends Funcionario {

    private String telefone;
    private String ramal;

    public String gettelefone(){
        return telefone;
    }
    public void settelefone(String telefone){
        this.telefone=telefone;
    }

    public String getramal(){
        return ramal;
    }
    public void setramal(String ramal){
        this.ramal=ramal;
    }

}