package com.dh.medicamentos.service;

import com.dh.medicamentos.dao.IDao;
import com.dh.medicamentos.model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    //salvar
    public Medicamento salvar(Medicamento medicamento){
        return medicamentoDao.salvar(medicamento);
    }

    //buscar
    public Medicamento buscar(Integer id){
        return medicamentoDao.buscar(id);
    }
}
