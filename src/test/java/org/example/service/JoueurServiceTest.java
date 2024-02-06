package org.example.service;

import org.example.model.Couleur;
import org.example.model.Joueur;
import org.example.model.pieces.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JoueurServiceTest {
    private JoueurService joueurService = JoueurService.builder().build();

    private PieceService pieceService = PieceService.builder().build();

    @Test
    public void testInitJoueurs1() {
        joueurService.setPieceService(pieceService);
        Joueur joueur = joueurService.initJoueurs1("Joueur Blanc", Couleur.BLANC);

        assertEquals("Joueur Blanc", joueur.getNom());
        assertEquals(Couleur.BLANC, joueur.getCouleur());
        assertEquals(16, joueur.getPieces().size());

        // Vérification des types de pièces
        assertTrue(joueur.getPieces().contains(new Pion(Couleur.BLANC, "a2")));
        assertTrue(joueur.getPieces().contains(new Tour(Couleur.BLANC, "a1")));
        assertTrue(joueur.getPieces().contains(new Roi(Couleur.BLANC, "e1")));
        assertTrue(joueur.getPieces().contains(new Reine(Couleur.BLANC, "d1")));
        assertTrue(joueur.getPieces().contains(new Fou(Couleur.BLANC, "c1")));
        assertTrue(joueur.getPieces().contains(new Fou(Couleur.BLANC, "f1")));
        assertTrue(joueur.getPieces().contains(new Cavalier(Couleur.BLANC, "b1")));
        assertTrue(joueur.getPieces().contains(new Cavalier(Couleur.BLANC, "g1")));
    }

    @Test
    public void testInitJoueurs2() {
        joueurService.setPieceService(pieceService);
        Joueur joueur = joueurService.initJoueurs2("Joueur Noir", Couleur.NOIR);

        assertEquals("Joueur Noir", joueur.getNom());
        assertEquals(Couleur.NOIR, joueur.getCouleur());
        assertEquals(16, joueur.getPieces().size());

        // Vérification des types de pièces
        assertTrue(joueur.getPieces().contains(new Pion(Couleur.NOIR, "a7")));
        assertTrue(joueur.getPieces().contains(new Tour(Couleur.NOIR, "a8")));
        assertTrue(joueur.getPieces().contains(new Roi(Couleur.NOIR, "e8")));
        assertTrue(joueur.getPieces().contains(new Reine(Couleur.NOIR, "d8")));
        assertTrue(joueur.getPieces().contains(new Fou(Couleur.NOIR, "c8")));
        assertTrue(joueur.getPieces().contains(new Fou(Couleur.NOIR, "f8")));
        assertTrue(joueur.getPieces().contains(new Cavalier(Couleur.NOIR, "b8")));
        assertTrue(joueur.getPieces().contains(new Cavalier(Couleur.NOIR, "g8")));
    }

    @Test
    public void testCouleurPieces() {
        joueurService.setPieceService(pieceService);
        Joueur joueurBlanc = joueurService.initJoueurs1("Joueur Blanc", Couleur.BLANC);
        Joueur joueurNoir = joueurService.initJoueurs2("Joueur Noir", Couleur.NOIR);

        for (Piece piece : joueurBlanc.getPieces()) {
            assertEquals(Couleur.BLANC, piece.getCouleur());
        }

        for (Piece piece : joueurNoir.getPieces()) {
            assertEquals(Couleur.NOIR, piece.getCouleur());
        }
    }
}