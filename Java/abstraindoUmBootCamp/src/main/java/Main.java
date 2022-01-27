import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Intensivo Java");
        curso1.setCargaHoraria(16);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Script");
        curso2.setDescricao("Curso Extensivo Java Script");
        curso2.setCargaHoraria(300);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Mentoria coletiva Curso Java");
        mentoria1.setTitulo("Curso Java");

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JavaScript");
        mentoria2.setDescricao("Descrição mentoria JavaScript");
        mentoria2.setData(LocalDate.now());



        System.out.println(curso1);

        System.out.println(curso2);

    }
}
