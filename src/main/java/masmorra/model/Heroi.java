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

    public void receberDano() {
        this.vida = Math.max(0, this.vida - 25);
    }

    public void curar() {
        this.vida = Math.min(100, this.vida + 7);
    }

    public void ganharExperiencia() {
        this.experiencia += 25;
    }

    public void gastarMana() {
        this.mana = Math.max(0, this.mana - 5);
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