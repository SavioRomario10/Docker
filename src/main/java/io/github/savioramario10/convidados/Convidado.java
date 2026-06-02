package io.github.savioramario10.convidados;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Convidado {
  private String nome;
  private String cpf;
}
