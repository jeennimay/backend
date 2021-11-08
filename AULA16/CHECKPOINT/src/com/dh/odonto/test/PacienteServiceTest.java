package com.dh.odonto.test;

import com.dh.odonto.dao.impl.EnderecoDaoH2;
import com.dh.odonto.dao.impl.PacienteDaoH2;
import com.dh.odonto.model.Endereco;
import com.dh.odonto.model.Paciente;
import com.dh.odonto.service.EnderecoService;
import com.dh.odonto.service.PacienteService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {

    private static PacienteService pacienteService =
            new PacienteService(
                    new PacienteDaoH2(
                            new EnderecoDaoH2()));
    private EnderecoService enderecoService =
            new EnderecoService(
                    new EnderecoDaoH2());

    @BeforeClass
    public static void carregarDataSet(){
        Endereco endereco1 = new Endereco("Rua A", "123", "Centro", "São Paulo");
        Paciente paciente1 = pacienteService.salvar(new Paciente("Jennifer", "Mayumi", "123456789", new Date(), endereco1));

        Endereco endereco2 = new Endereco("Rua B", "3", "Santana", "São Paulo");
        Paciente paciente2 = pacienteService.salvar(new Paciente("Daniela", "Santos", "15252525", new Date(), endereco2));

        Endereco endereco3 = new Endereco("Rua D", "277", "Vila Formosa", "São Paulo");
        Paciente paciente3 = pacienteService.salvar(new Paciente("Matheus", "Henrique", "987456321", new Date(), endereco3));
    }

    @Test
    void salvar() {
        Endereco endereco4 = new Endereco("Rua E", "102", "Paulista", "São Paulo");
        Paciente paciente4 = pacienteService.salvar(new Paciente("Rafael", "Silva", "25632479", new Date(), endereco4));

    }

    @Test
    void buscar() {
        Assert.assertNotNull(pacienteService.buscar(2));
    }

    @Test
    void excluir() {
        pacienteService.excluir(3);
        Assert.assertTrue(pacienteService.buscar(3).isEmpty());
    }

    @Test
    void buscarTodos() {
        List<Paciente> pacientes = pacienteService.buscarTodos();
        System.out.println(pacientes);

    }
}