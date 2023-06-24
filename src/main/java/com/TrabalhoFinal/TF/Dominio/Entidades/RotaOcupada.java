package com.TrabalhoFinal.TF.Dominio.Entidades;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rotas_ocupadas")
public class RotaOcupada {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private Date dia;
  private Integer altitude;

  public RotaOcupada() {}

  public RotaOcupada(Date dia, Integer altitude, Rota rota) {
    this.dia = dia;
    this.altitude = altitude;
    this.rota = rota;
  }

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
  private Rota rota;

  public int getId() {
    return id;
  }
  public Date getDia() {
    return dia;
  }
  public Integer getAltitude() {
    return altitude;
  } 
}