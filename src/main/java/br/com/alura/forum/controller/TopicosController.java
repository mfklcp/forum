package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
   public List<TopicoDto> litaDeTopicos(){

       Topico topicos = new Topico("Dúvida", "Dúvida sobre Spring", new Curso("Rest com Spring", "Computação"));

       return TopicoDto.converter(Arrays.asList(topicos, topicos, topicos));
   }
}
