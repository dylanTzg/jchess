package org.example.service;

import lombok.Builder;
import org.example.model.Couleur;
import org.example.model.pieces.*;

import java.util.ArrayList;
import java.util.List;
@Builder
public class PieceService {

    List<Piece> initPiecesBlanc(Couleur couleur){
        List<Piece> pieces = new ArrayList<>();
        pieces.add(new Pion(couleur, "a2"));
        pieces.add(new Pion(couleur, "b2"));
        pieces.add(new Pion(couleur, "c2"));
        pieces.add(new Pion(couleur, "d2"));
        pieces.add(new Pion(couleur, "e2"));
        pieces.add(new Pion(couleur, "f2"));
        pieces.add(new Pion(couleur, "g2"));
        pieces.add(new Pion(couleur, "h2"));
        pieces.add(new Tour(couleur, "a1"));
        pieces.add(new Tour(couleur, "h1"));
        pieces.add(new Roi(couleur, "e1"));
        pieces.add(new Reine(couleur, "d1"));
        pieces.add(new Fou(couleur, "c1"));
        pieces.add(new Fou(couleur, "f1"));
        pieces.add(new Cavalier(couleur, "b1"));
        pieces.add(new Cavalier(couleur, "g1"));
        return pieces;
    }

    List<Piece> initPiecesNoir(Couleur couleur) {
        List<Piece> pieces = new ArrayList<>();
        pieces.add(new Pion(couleur, "a7"));
        pieces.add(new Pion(couleur, "b7"));
        pieces.add(new Pion(couleur, "c7"));
        pieces.add(new Pion(couleur, "d7"));
        pieces.add(new Pion(couleur, "e7"));
        pieces.add(new Pion(couleur, "f7"));
        pieces.add(new Pion(couleur, "g7"));
        pieces.add(new Pion(couleur, "h7"));
        pieces.add(new Tour(couleur, "a8"));
        pieces.add(new Tour(couleur, "h8"));
        pieces.add(new Roi(couleur, "e8"));
        pieces.add(new Reine(couleur, "d8"));
        pieces.add(new Fou(couleur, "c8"));
        pieces.add(new Fou(couleur, "f8"));
        pieces.add(new Cavalier(couleur, "b8"));
        pieces.add(new Cavalier(couleur, "g8"));
        return pieces;
    }

}
