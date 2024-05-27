package br.com.andersonpontes.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class ErrorMessageDTO {

  private String message;
  private String field;
  
}
