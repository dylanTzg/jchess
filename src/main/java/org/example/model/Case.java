package org.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class Case {
    private final String nom;

    private final  boolean isVide;
}
