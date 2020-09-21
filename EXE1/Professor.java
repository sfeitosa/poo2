/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhauniversidade;

/**
 *
 * @author samuel
 */
public class Professor {
    private String nome;
    private Departamento depto;
    private double salario;
    private boolean ativo;
    
    public Professor() {
        this.nome = "";
    }
    
    public Professor(String nome) {
        this.nome = nome;
    }
    
    public Professor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }    

    public void setSalario(double salario) {
        if (salario > 0.0) {
            this.salario = salario;
        }
    }
    
    public void aumentaSalario(int valor) {
        this.salario *= valor;
    }
    
    public void aumentaSalario(double valor) {
        this.salario += valor;
    }
    
    public String toString() {
        return "Nome: " + this.nome + " Salário: " + this.salario;
    }
}
