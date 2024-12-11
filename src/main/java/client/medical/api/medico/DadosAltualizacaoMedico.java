package client.medical.api.medico;

import client.medical.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAltualizacaoMedico(
    
                @NotNull
                Long id, 
                String nome, 
                String telefone, 
                DadosEndereco endereco) {}
