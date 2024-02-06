package org.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.model.pieces.Piece;

import java.util.List;

@Builder
@Data
@RequiredArgsConstructor
public class Joueur {

    private final String nom;

    private final Couleur couleur;

    private final List<Piece> pieces;

}
