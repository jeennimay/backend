package com.dh.odonto.test;

import com.dh.odonto.dao.impl.DentistaDaoH2;
import com.dh.odonto.model.Dentista;
import com.dh.odonto.service.DentistaService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DentistaServiceTest {

    private static DentistaService dentistaService = new DentistaService(new DentistaDaoH2());

    @BeforeClass
    public static void carregarDataSet(){
        Dentista dentista1 = (new Dentista("Lia", "Saori", "12335647"));
        Dentista dentista2 = (new Dentista("Nelson", "Neto", "555692314"));
        Dentista dentista3 = (new Dentista("Giuliana", "Liporonni", "2131433581"));

    }
    @Test
    void salvar() {
        Dentista dentista4 = (new Dentista("Giovanna", "Neves", "597413628"));

    }

    @Test
    void buscar() {
        Assert.assertNotNull(dentistaService.buscar(3));
    }

    @Test
    void excluir() {
        dentistaService.excluir(2);
    }

    @Test
    void buscarTodos() {
        List<Dentista> dentistas = dentistaService.buscarTodos();
        System.out.println(dentistas);
    }

}