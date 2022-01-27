package br.com.dio.desafio.dominio;

import lombok.Data;

import static br.com.dio.desafio.dominio.Conteudo.XP_PADRAO;

@Data
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
