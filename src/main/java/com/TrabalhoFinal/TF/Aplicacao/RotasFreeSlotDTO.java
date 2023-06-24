package com.TrabalhoFinal.TF.Aplicacao;

import java.util.Date;

public class RotasFreeSlotDTO {
  private Integer hora;
  private Date dia;
  private Integer altitude;
  private String nomeRota;
  
  public RotasFreeSlotDTO(Integer hora, Date dia, Integer altitude, String nomeRota) {
    this.hora = hora;
    this.dia = dia;
    this.altitude = altitude;
    this.nomeRota = nomeRota;
  }

  public Integer gethora() {
    return hora;
  }
  public Date getDia() {
    return dia;
  }
  public Integer getAltitude() {
    return altitude;
  }
  public String getNomeRota() {
    return nomeRota;
  }
}
