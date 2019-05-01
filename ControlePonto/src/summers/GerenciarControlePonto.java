package summers;

import java.lang.management.ThreadMXBean;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        Gerente gerente1 = new Gerente();
        gerente1.setidFunc(100);
        gerente1.setnome("Mateus");
        gerente1.setEmail("mateus@gmail.com");
        gerente1.setDocumento("987654321-0");
        gerente1.setlogin("mateus.cunha");
        gerente1.setsenha("bla.bla.bla");

        Secretaria secretaria1 = new Secretaria();
        secretaria1.setidFunc(550);
        secretaria1.setnome("Ana");
        secretaria1.setEmail("ana@gmail.com");
        secretaria1.setDocumento("123456789-0");
        secretaria1.settelefone("019-3861-1799");
        secretaria1.setramal("ramal 23");

        Operador operador1 = new Operador();
        operador1.setidFunc(357);
        operador1.setnome("José Wilson");
        operador1.setEmail("josewilson@gmail.com");
        operador1.setDocumento("456789123-0");
        operador1.setvalorHora(50.0);

        RegistroPonto r1g1 = new RegistroPonto();
        r1g1.setidRegPonto(1212121);
        r1g1.setfunc(gerente1);
        r1g1.setdataRegistro(LocalDate.now());
        r1g1.sethoraEntrada(LocalDateTime.now());
        Thread.sleep((long) 10000.0);
        r1g1.sethoraSaida(LocalDateTime.now());

        RegistroPonto r1s1 = new RegistroPonto();
        r1s1.setidRegPonto(1212123);
        r1s1.setfunc(secretaria1);
        r1s1.setdataRegistro(LocalDate.now());
        r1s1.sethoraEntrada(LocalDateTime.now());
        Thread.sleep((long) 30000.0);
        r1s1.sethoraSaida(LocalDateTime.now());

        RegistroPonto r1op1 = new RegistroPonto();
        r1op1.setidRegPonto(1212122);
        r1op1.setfunc(operador1);
        r1op1.setdataRegistro(LocalDate.now());
        r1op1.sethoraEntrada(LocalDateTime.now());
        Thread.sleep((long) 20000.0);
        r1op1.sethoraSaida(LocalDateTime.now());

        r1g1.apresentarRegistroPonto();
        r1op1.apresentarRegistroPonto();
        r1s1.apresentarRegistroPonto();

    }
}