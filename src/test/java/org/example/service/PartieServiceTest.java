package org.example.service;

import org.example.model.Couleur;
import org.example.model.Partie;
import org.example.model.Table;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PartieServiceTest {

    private TableService tableService = TableService.builder().build();
    private PieceService pieceService = PieceService.builder().build();
    private JoueurService joueurService = JoueurService.builder().pieceService(pieceService).build();

    private PartieService partieService = PartieService.builder()
            .joueurService(joueurService)
            .tableService(tableService)
            .build();
/**
    @Test
    public void testInitPartie() {
        Partie partie = partieService.initPartie();

        // Vérification des joueurs
        assertEquals("Joueur 1", partie.getJoueur1().getNom());
        assertEquals(Couleur.BLANC, partie.getJoueur1().getCouleur());
        assertEquals("Joueur 2", partie.getJoueur2().getNom());
        assertEquals(Couleur.NOIR, partie.getJoueur2().getCouleur());

        // Vérification du joueur qui doit jouer
        assertEquals(partie.getJoueur1(), partie.getJoueurQuiDoitJouer());

        // Vérification de l'état de la partie
        assertFalse(partie.isPartieTerminee());
        assertFalse(partie.isPartieNulle());
    }

    @Test
    public void testCouleursJoueurs() {
        Partie partie = partieService.initPartie();

        assertNotEquals(partie.getJoueur1().getCouleur(), partie.getJoueur2().getCouleur());
    }*/
}
