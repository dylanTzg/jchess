package org.example.service;

import org.example.model.Couleur;
import org.example.model.pieces.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PiecesServiceTest {
    @Test
    public void testInitPiecesBlanc() {
        PieceService pieceService = new PieceService();
        List<Piece> pieces = pieceService.initPiecesBlanc(Couleur.BLANC);


        assertEquals(16, pieces.size());


        assertTrue(pieces.contains(new Pion(Couleur.BLANC, "a2")));
        assertTrue(pieces.contains(new Tour(Couleur.BLANC, "a1")));
        assertTrue(pieces.contains(new Roi(Couleur.BLANC, "e1")));
        assertTrue(pieces.contains(new Reine(Couleur.BLANC, "d1")));
        assertTrue(pieces.contains(new Fou(Couleur.BLANC, "c1")));
        assertTrue(pieces.contains(new Fou(Couleur.BLANC, "f1")));
        assertTrue(pieces.contains(new Cavalier(Couleur.BLANC, "b1")));
        assertTrue(pieces.contains(new Cavalier(Couleur.BLANC, "g1")));
    }

    @Test
    public void testInitPiecesNoir() {
        PieceService pieceService = new PieceService();
        List<Piece> pieces = pieceService.initPiecesNoir(Couleur.NOIR);


        assertEquals(16, pieces.size());


        assertTrue(pieces.contains(new Pion(Couleur.NOIR, "a7")));
        assertTrue(pieces.contains(new Tour(Couleur.NOIR, "a8")));
        assertTrue(pieces.contains(new Roi(Couleur.NOIR, "e8")));
        assertTrue(pieces.contains(new Reine(Couleur.NOIR, "d8")));
        assertTrue(pieces.contains(new Fou(Couleur.NOIR, "c8")));
        assertTrue(pieces.contains(new Fou(Couleur.NOIR, "f8")));
        assertTrue(pieces.contains(new Cavalier(Couleur.NOIR, "b8")));
        assertTrue(pieces.contains(new Cavalier(Couleur.NOIR, "g8")));
    }

    @Test
    public void testPieceColor() {
        PieceService pieceService = new PieceService();
        List<Piece> whitePieces = pieceService.initPiecesBlanc(Couleur.BLANC);
        List<Piece> blackPieces = pieceService.initPiecesNoir(Couleur.NOIR);


        for (Piece piece : whitePieces) {
            assertEquals(Couleur.BLANC, piece.getCouleur());
        }


        for (Piece piece : blackPieces) {
            assertEquals(Couleur.NOIR, piece.getCouleur());
        }
    }
}
