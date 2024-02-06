package org.example.service;

import org.example.model.Table;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TableServiceTest {
    Table table = Table.builder().build();
    @Test
    void initTable_shouldCreateTableWithCorrectCaseNames() {
        TableService tableService = TableService.builder().build();
        table = tableService.initTable(table);

        // Vérifier le nom de quelques cases
        assertEquals("a1", table.getCases()[0][0].getNom());
        assertEquals("b1", table.getCases()[0][1].getNom());
        assertEquals("h8", table.getCases()[7][7].getNom());
        assertEquals("e4", table.getCases()[3][4].getNom());


        // Vérifier que toutes les cases sont vides au début
        for (int ligne = 0; ligne < 8; ligne++) {
            for (int colonne = 0; colonne < 8; colonne++) {
                assertTrue(table.getCases()[ligne][colonne].isVide());
            }
        }
    }
}
