package org.example.model.pieces;

import lombok.Data;
import org.example.model.Couleur;
import org.example.model.TypePiece;
@Data
public class Piece {

   private final TypePiece type;

   private final Couleur couleur;

   private final String casePosition;




}
