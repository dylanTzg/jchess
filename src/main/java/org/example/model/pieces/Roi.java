package org.example.model.pieces;


import org.example.model.Couleur;
import org.example.model.TypePiece;

public class Roi extends Piece {

    public Roi(Couleur couleur, String casePosition) {
        super(TypePiece.ROI, couleur, casePosition);
    }
}
