package summers;

public abstract class Funcionario {

    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    public int getidFunc() {
        return idFunc;
    }
    public void setidFunc(int idFunc){
        this.idFunc=idFunc;
    }

    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento=documento;
    }

}