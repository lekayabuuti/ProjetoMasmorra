package masmorra.model;

import masmorra.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Heroi {

    private final String nome;
    private int vida;
    private int mana;
    private int nivel;
    private int experiencia;

    private List<Observer> observers = new ArrayList<>();

    public Heroi(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.mana = 50;
        this.nivel = 1;
        this.experiencia = 0;
    }

    public void receberDano(int quantidade) {
        this.vida = Math.max(0, this.vida - quantidade);
    }

    public void curar(int quantidade) {
        this.vida = Math.min(100, this.vida + quantidade);
    }

    public void ganharExperiencia(int quantidade) {
        this.experiencia += quantidade;
    }

    public void gastarMana(int quantidade) {
        this.mana = Math.max(0, this.mana - quantidade);
    }

    public String getNome()       { return nome; }
    public int getVida()          { return vida; }
    public int getMana()          { return mana; }
    public int getNivel()         { return nivel; }
    public int getExperiencia()   { return experiencia; }
    public void setNivel(int n)   { this.nivel = n; }
    public void setExperiencia(int xp) { this.experiencia = xp; }
    public void setVida(int v)    { this.vida = v; }
}