package com.backend.animalStockApp.entity;

public class Product {

    public enum Color{
        BLACK,
        WHITE,
        GREEN,
        BLUE,
        PURPLE,
        GRAY,
        BROWN,
        YELLOW,
        RED,
        PINK
    }

    /*public enum Animal{
        CHIEN,
        CHAT,
        CHEVAL,
        VACHE,
        NONE
    }*/

    private long id;
    private String categorie;
    private String marque;
    private Color color;
    private int quantite;
    private String animal;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Product(long id, String categorie, String marque, Color color, int quantite) {
        this.id = id;
        this.categorie = categorie;
        this.marque = marque;
        this.color = color;
        this.quantite = quantite;
        this.animal = "";
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Product(long id, String categorie, String marque, Color color, int quantite, String animal) {
        this.id = id;
        this.categorie = categorie;
        this.marque = marque;
        this.color = color;
        this.quantite = quantite;
        this.animal = animal;
    }

    public Product(){

    }

}
