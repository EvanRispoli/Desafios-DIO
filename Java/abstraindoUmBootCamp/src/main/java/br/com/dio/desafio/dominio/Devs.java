package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
@Data
public class Devs {
    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos =  new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscristos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        }else {
            System.err.println("Não existe nenhuma matricula realizada");
        }
    }

    public double calcularTotalxp() {
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }


    }