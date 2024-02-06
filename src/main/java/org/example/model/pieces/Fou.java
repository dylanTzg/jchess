package org.example.model.pieces;

import org.example.model.Couleur;
import org.example.model.TypePiece;


public class Fou extends Piece{
    public Fou(Couleur couleur, String casePosition) {
        super(TypePiece.FOU, couleur, casePosition);
    }
}
