package com.TrabalhoFinal.TF.Dominio.Servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.TrabalhoFinal.TF.Adapdatores.Persistencia.IRepoAeronave;
import com.TrabalhoFinal.TF.Dominio.Entidades.Aeronave;

@Component
public class AeronaveServico {
  public IRepoAeronave aeronaveRepositorio;

  @Autowired
  public AeronaveServico (IRepoAeronave aeronaveRepositorio){
    this.aeronaveRepositorio = aeronaveRepositorio;
  }
  
  public List<Aeronave> getAllAirplanes(){
    return aeronaveRepositorio.getAll();
  }

  public boolean insertAirplane(Aeronave airplane){
    return aeronaveRepositorio.insert(airplane);
  }
}
