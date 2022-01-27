import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Devs;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer Bootcamp");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);

        bootcamp.getConteudos().add(mentoria1);


        Devs dev = new Devs();
        dev.setNome("Evan");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev.getNome() + " : " + dev.getConteudosIncritos());

        dev.progredir();
        dev.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos " + dev.getNome() + " : " + dev.getConteudosIncritos());
        System.out.println("Conteúdos Inscritos " + dev.getNome() + " : " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalxp());

        System.out.println("---------------------------");

        Devs dev1 = new Devs();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosIncritos());

        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + " : "+ dev1.getConteudosIncritos());
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + " : " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalxp());



        System.out.println(curso1);

        System.out.println(curso2);

    }
}
