package br.com.petz.clientepet.cliente.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.NonNull;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NonNull
	private LocalDate dataDeNascimento;
	@NonNull
	private Boolean aceitaTermos;
}
