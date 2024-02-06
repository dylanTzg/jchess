package org.example.service;

import lombok.Builder;
import lombok.Data;
import org.example.model.Couleur;
import org.example.model.Partie;
import org.example.model.Table;

@Data
@Builder
public class PartieService {

    private JoueurService joueurService;

    private TableService tableService;


    public Partie initPartie() {
       return Partie.builder()
                .joueur1(joueurService.initJoueurs1("Joueur 1", Couleur.BLANC))
                .joueur2(joueurService.initJoueurs2("Joueur 2", Couleur.NOIR))
                .table(tableService.initTable(Table.builder().build()))
                .joueurQuiDoitJouer(joueurService.initJoueurs1("Joueur 1", Couleur.BLANC))
                .partieTerminee(false)
                .partieNulle(false)
                .build();

    }

}
