package org.example.model;

public enum TypePiece {
        ROI("Roi"),
        REINE("Reine"),
        TOUR("Tour"),
        FOU("Fou"),
        CAVALIER("Cavalier"),
        PION("Pion");

        private final String nom;

        TypePiece(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }


