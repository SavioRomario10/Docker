package io.github.savioramario10.convidados;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class ConvidadosController {

  @Autowired
  private ConvidadosRepository repository;

  @GetMapping
  public List<Convidado> getConvidados(@RequestParam String param) {
    return repository.findAll();
  }
} 