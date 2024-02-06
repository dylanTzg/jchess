package org.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Builder
public class Partie {

    private final Joueur joueur1;

    private final Joueur joueur2;

    private final Table table;

    private final Joueur joueurQuiDoitJouer;

    private final Joueur joueurGagnant;

    private final boolean partieTerminee;

    private final boolean partieNulle;



}
