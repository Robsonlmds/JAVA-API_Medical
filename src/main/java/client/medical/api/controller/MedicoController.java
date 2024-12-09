package client.medical.api.controller;

import javax.swing.Spring;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client.medical.api.medico.DadosCadatroMedico;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadatroMedico dados) {
        System.out.println("\n" + dados);
    }
}
