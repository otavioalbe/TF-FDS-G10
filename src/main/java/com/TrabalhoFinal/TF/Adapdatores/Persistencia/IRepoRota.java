package com.TrabalhoFinal.TF.Adapdatores.Persistencia;

import java.util.Date;
import java.util.List;

import com.TrabalhoFinal.TF.Aplicacao.RotasFreeSlotDTO;
import com.TrabalhoFinal.TF.Dominio.Entidades.Aeroporto;
import com.TrabalhoFinal.TF.Dominio.Entidades.Rota;

public interface IRepoRota {

    List<Rota> getAllByDestino(Aeroporto from, Aeroporto to);

    Aeroporto getAeroportoByName(String geoRefFrom);

    List<RotasFreeSlotDTO> getFreeSlots(Date date, Float cruisingSpeed, Aeroporto from, Aeroporto to);
    
}
