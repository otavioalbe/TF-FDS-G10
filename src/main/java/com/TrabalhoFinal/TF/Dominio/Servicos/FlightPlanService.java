package com.TrabalhoFinal.TF.Dominio.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TrabalhoFinal.TF.Adapdatores.Persistencia.IRepoPlanoVoo;
import com.TrabalhoFinal.TF.Adapdatores.Persistencia.IRepoRota;
import com.TrabalhoFinal.TF.Dominio.Entidades.Aeroporto;
import com.TrabalhoFinal.TF.Dominio.Entidades.RotaOcupada;

@Component
public class FlightPlanService {
  public IRepoPlanoVoo planoDeVooRepositorio;
  public IRepoRota rotaRepositorio;
  
  @Autowired
  public FlightPlanService(IRepoPlanoVoo planoDeVooRepositorio, IRepoRota rotaRepositorio){
    this.planoDeVooRepositorio = planoDeVooRepositorio;
    this.rotaRepositorio = rotaRepositorio;
  }

  public List<RotaOcupada> checkFlightPlan(int flightNumber, String AeroportoFrom, String AeroportoTo){
    Aeroporto from = rotaRepositorio.getAeroportoByName(AeroportoFrom);
    Aeroporto to = rotaRepositorio.getAeroportoByName(AeroportoTo);

    return planoDeVooRepositorio.check(flightNumber, from, to);
  }

  public boolean despacharPlanoDeVoo(int flightNumber, String AeroportoFrom, String AeroportoTo) {
    Aeroporto from = rotaRepositorio.getAeroportoByName(AeroportoFrom);
    Aeroporto to = rotaRepositorio.getAeroportoByName(AeroportoTo);

    return planoDeVooRepositorio.despachar(flightNumber, from, to);
  }

  public boolean cancelarPlanoDeVoo(int flightNumber, String AeroportoFrom, String AeroportoTo) {
    Aeroporto from = rotaRepositorio.getAeroportoByName(AeroportoFrom);
    Aeroporto to = rotaRepositorio.getAeroportoByName(AeroportoTo);

    return planoDeVooRepositorio.cancelar(flightNumber, from, to);
  }
}
