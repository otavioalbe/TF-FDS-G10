package com.TrabalhoFinal.TF.Dominio.Entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rotas")
public class Rota {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;
  private double distanciaKM;

  public Rota() {}

  public Rota(String nome, List<RotaOcupada> rotaOcupada, Aeroporto origem, Aeroporto destino, double distanciaKM) {
    this.nome = nome;
    this.rotaOcupada = rotaOcupada;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKM = distanciaKM;
  }

  @OneToMany(fetch = FetchType.EAGER,
             mappedBy = "rotas", 
             cascade = CascadeType.ALL)
  private List<RotaOcupada> rotaOcupada;


  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
  private Aeroporto origem;
  
  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false, insertable=false, updatable=false)
  private Aeroporto destino;

  public int getId() {
    return id;
  }
  public String getnome() {
    return nome;
  }
  public Aeroporto getOrigem() {
    return origem;
  }
  public Aeroporto getDestino() {
    return destino;
  }
  public List<RotaOcupada> geRotaOcupada() {
    return rotaOcupada;
  }
  public double getDistanciaKM(){
    return distanciaKM;
  }
}
