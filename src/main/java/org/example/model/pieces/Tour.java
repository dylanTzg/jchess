package org.example.model.pieces;

import org.example.model.Couleur;
import org.example.model.TypePiece;

public class Tour extends Piece {
    public Tour(Couleur couleur, String casePosition) {
        super(TypePiece.TOUR, couleur, casePosition);
    }
}
