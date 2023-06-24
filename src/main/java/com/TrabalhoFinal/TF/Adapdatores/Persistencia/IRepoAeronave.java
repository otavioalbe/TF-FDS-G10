package com.TrabalhoFinal.TF.Adapdatores.Persistencia;

import java.util.List;

import com.TrabalhoFinal.TF.Dominio.Entidades.Aeronave;

public interface IRepoAeronave {
    List<Aeronave> getAll();

    boolean insert(Aeronave airplane);
}
