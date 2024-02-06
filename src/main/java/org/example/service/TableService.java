package org.example.service;

import lombok.Builder;
import lombok.Data;
import org.example.model.Case;
import org.example.model.Table;

@Data
@Builder
public class TableService {
    public Table initTable(Table table) {
         table = Table.builder().cases(new Case[8][8]).build();

        for (int ligne = 7; ligne >= 0; ligne--) {
            for (int colonne = 0; colonne < 8; colonne++) {
                String nomCase = (char) ('a' + colonne) + "" + (ligne + 1);
                Case caseCourante = Case.builder().nom(nomCase).isVide(true).build();
               table.getCases()[ligne][colonne] = caseCourante;
            }
        }
       return table;
    }

    public void afficherTable(Table table) {
        for (int ligne = 0; ligne < 8; ligne++) {
            for (int colonne = 0; colonne < 8; colonne++) {
                System.out.print(table.getCases()[ligne][colonne].getNom() + " ");
            }
            System.out.println();
        }
    }


}
