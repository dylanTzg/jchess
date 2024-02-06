package org.example.model.pieces;

import org.example.model.Couleur;
import org.example.model.TypePiece;

public class Pion extends Piece {

    public Pion(Couleur couleur, String casePosition) {
        super(TypePiece.PION, couleur, casePosition);
    }
}
