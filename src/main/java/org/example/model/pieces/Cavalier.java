package org.example.model.pieces;

import org.example.model.Couleur;
import org.example.model.TypePiece;
public class Cavalier extends Piece{

    public Cavalier(Couleur couleur, String casePosition) {
        super(TypePiece.CAVALIER, couleur, casePosition);
    }
}
