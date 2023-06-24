package com.TrabalhoFinal.TF.Dominio.Servicos;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TrabalhoFinal.TF.Adapdatores.Persistencia.IRepoRota;
import com.TrabalhoFinal.TF.Aplicacao.RotasFreeSlotDTO;
import com.TrabalhoFinal.TF.Dominio.Entidades.Aeroporto;
import com.TrabalhoFinal.TF.Dominio.Entidades.Rota;

@Component
public class RotaServico {
  public IRepoRota rotaRepositorio;
  
  @Autowired
  public RotaServico(IRepoRota rotaRepositorio){
    this.rotaRepositorio = rotaRepositorio;
  }

  public List<Rota> getAllRotasByDestino(String aeroportoOrigem, String aeroportoDestino){
    Aeroporto from = rotaRepositorio.getAeroportoByName(aeroportoOrigem);
    Aeroporto to = rotaRepositorio.getAeroportoByName(aeroportoDestino);

    return rotaRepositorio.getAllByDestino(from, to);
  }

  public List<RotasFreeSlotDTO> getRotasFreeSlots(Date dia, Float velocidade, String aeroportoOrigem, String aeroportoDestino) {
    Aeroporto origem = rotaRepositorio.getAeroportoByName(aeroportoOrigem);
    Aeroporto destino = rotaRepositorio.getAeroportoByName(aeroportoDestino);

    return rotaRepositorio.getFreeSlots(dia, velocidade, origem, destino);
  }

  public Aeroporto getGeoRefByName(String name) {
    return rotaRepositorio.getAeroportoByName(name);
  }
}
