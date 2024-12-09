package client.medical.api.medico;

import client.medical.api.endereco.DadosEndereco;

public record DadosCadatroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {}
