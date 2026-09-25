package edu.ncsu.monopoly;

//Añadimos comentario de nuevo hoy jueves 24 aldaketa 2
//Eguneraketa irailak 25 bigarrena
//github.com/Iago111/Monopoly
public abstract class Card {

    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}
