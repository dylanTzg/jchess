package org.example.service;

import lombok.Builder;
import lombok.Data;
import org.example.model.Couleur;
import org.example.model.Partie;
@Data
@Builder
public class PartieService {

    private Partie partie;

    private JoueurService joueurService;

    private TableService tableService;


    public Partie initPartie() {
       return Partie.builder()
                .joueur1(joueurService.initJoueurs1("Joueur 1", Couleur.BLANC))
                .joueur2(joueurService.initJoueurs2("Joueur 2", Couleur.NOIR))
                .table(tableService.initTable(partie.getTable()))
                .joueurQuiDoitJouer(partie.getJoueur1())
                .partieTerminee(false)
                .partieNulle(false)
                .build();

    }



}
