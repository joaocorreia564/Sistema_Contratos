package org.example;

import java.util.Date;

public class Contrato {
    private Date data;
    private Double ValorPorHora;
    private Integer horas;

    public Contrato(){

    }
    public Contrato(Date data, Double valorPorHora, Integer horas){
        this.data = data;
        this.ValorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return ValorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        ValorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public double totalvalor(){
        return ValorPorHora * horas;
    }
}
