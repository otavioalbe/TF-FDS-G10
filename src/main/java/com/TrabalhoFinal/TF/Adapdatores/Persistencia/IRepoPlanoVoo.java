package com.TrabalhoFinal.TF.Adapdatores.Persistencia;

import java.util.List;

import com.TrabalhoFinal.TF.Dominio.Entidades.Aeroporto;
import com.TrabalhoFinal.TF.Dominio.Entidades.RotaOcupada;

public interface IRepoPlanoVoo {

    List<RotaOcupada> check(int flightNumber, Aeroporto from, Aeroporto to);

    boolean despachar(int flightNumber, Aeroporto from, Aeroporto to);

    boolean cancelar(int flightNumber, Aeroporto from, Aeroporto to);
    
}
