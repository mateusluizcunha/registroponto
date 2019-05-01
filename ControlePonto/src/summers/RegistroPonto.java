package summers;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {

    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getidRegPonto(){
        return idRegPonto;
    }
    public void setidRegPonto(long idRegPonto){
        this.idRegPonto=idRegPonto;
    }

    public Funcionario getfunc(){
        return func;
    }
    public void setfunc(Funcionario func){
        this.func=func;
    }

    public LocalDate getdataRegistro(){
        return dataRegistro;
    }
    public void setdataRegistro(LocalDate dataRegistro){
        this.dataRegistro=dataRegistro;
    }

    public LocalDateTime gethoraEntrada(){
        return horaEntrada;
    }
    public void sethoraEntrada(LocalDateTime horaEntrada){
        this.horaEntrada=horaEntrada;
    }

    public LocalDateTime gethoraSaida(){
        return horaSaida;
    }
    public void sethoraSaida(LocalDateTime horaSaida){
        this.horaSaida=horaSaida;
    }

    public void apresentarRegistroPonto(){
        System.out.println("Funcionário: " + func.getnome());
        System.out.println("Data de Registro: " + getdataRegistro());
        System.out.println("Horário Entrada: " + gethoraEntrada());
        System.out.println("Horário Saída: " + gethoraSaida() + "\n");
    }

}