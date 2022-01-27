package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class Mentoria extends Conteudo{

    private String titulo;
    private String descricao;
    private LocalDate data;

    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
