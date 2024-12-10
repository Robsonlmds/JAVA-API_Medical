package client.medical.api.medico;

import client.medical.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record DadosCadatroMedico(

    @NotBlank
    String nome,

    @NotBlank
    @Email 
    String email,
    
    @NotBlank
    String telefone,

    @NotBlank
    @Pattern(regexp = "\\\\d{4,6}")
    String crm,
    
    @NotNull
    Especialidade especialidade,

    @NotNull
    @Valid
    DadosEndereco endereco) {}
