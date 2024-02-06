package org.example.model.pieces;

import org.example.model.Couleur;
import org.example.model.TypePiece;

public class Reine extends Piece {

    public Reine(Couleur couleur, String casePosition) {
        super(TypePiece.REINE, couleur, casePosition);
    }
}
