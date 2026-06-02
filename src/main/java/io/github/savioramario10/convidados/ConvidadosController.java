package io.github.savioramario10.convidados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/convidados")
public class ConvidadosController {

  @GetMapping
  public List<Convidado> getConvidados(@RequestParam String param) {
    List<Convidado> convidados = new ArrayList<Convidado>();

    convidados.add(new Convidado("Maria", "12345678900"));
    convidados.add(new Convidado("João", "98765432100"));

    return convidados;
  }
} 