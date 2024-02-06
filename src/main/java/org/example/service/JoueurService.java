package org.example.service;

import lombok.Builder;
import lombok.Data;
import org.example.model.Couleur;
import org.example.model.Joueur;


@Data
@Builder
public class JoueurService {

 private PieceService pieceService;
  public Joueur initJoueurs1(String nom, Couleur couleur) {
      return Joueur.builder()
              .nom(nom)
              .couleur(couleur)
              .pieces(pieceService.initPiecesBlanc(couleur))
              .build();
  }

    public Joueur initJoueurs2(String nom, Couleur couleur) {
        return Joueur.builder()
                .nom(nom)
                .couleur(couleur)
                .pieces(pieceService.initPiecesNoir(couleur))
                .build();
    }
}
