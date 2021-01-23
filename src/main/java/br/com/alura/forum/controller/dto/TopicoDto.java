package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.Topico;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public static List<TopicoDto> converter(List<Topico> listaDeTopicos) {

        ArrayList<TopicoDto> topicosDto = new ArrayList<>();

        for(Topico topicos : listaDeTopicos){
            topicosDto.add(new TopicoDto(topicos));
        }
        return topicosDto;
        /*
        return listaDeTopicos.stream().map(TopicoDto::new).collect(Collectors.toList());
        */
    }
}