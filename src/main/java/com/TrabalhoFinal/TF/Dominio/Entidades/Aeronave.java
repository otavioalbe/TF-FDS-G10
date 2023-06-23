package com.TrabalhoFinal.TF.Dominio.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aeronaves")
public class Aeronave {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String prefixo;
  private Float velocidade;
  private Integer autonomy;

  public Aeronave() {}

  public Aeronave(String prefixo, Float velocidade, Integer autonomy) {
    this.prefixo = prefixo;
    this.velocidade = velocidade;
    this.autonomy = autonomy;
  }

  public int getId() {
    return id;
  }
  public String getPrefixo() {
    return prefixo;
  }
  public Float getVelocidade() {
    return velocidade;
  }
  public Integer getAutonomy() {
    return autonomy;
  }
}
