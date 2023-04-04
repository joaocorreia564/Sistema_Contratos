package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
    private String nome;
    private LevelTrabalho level;
    private Double salarioBase;

    private Departamento departamento;
    private List<Contrato> contratos = new ArrayList<>();

    public Trabalho(String nome, LevelTrabalho level,
                    Double salarioBase,Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LevelTrabalho getLevel() {
        return level;
    }

    public void setLevel(LevelTrabalho level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contrato> getContrato() {
        return contratos;
    }

    public void setContrato(List<Contrato> contrato) {
        this.contratos = contrato;
    }
    public void addContrato(Contrato contrato){
        contratos.add(contrato);
    }
    public void removerContratos(Contrato contrato){
     contratos.remove(contrato);
    }
    public Double renda(int ano, int mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(Contrato c : contratos) {
            cal.setTime(c.getData());

            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);

            if (ano == c_ano && mes == c_mes ) {
                soma += c.totalvalor();
            }
        }
        return soma;
    }
}
