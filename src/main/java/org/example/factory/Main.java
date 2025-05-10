package org.example.factory;

import org.example.factory.fighterFactory.FighterFactory;
import org.example.factory.fighter.Fighter;

public class Main {

    public static void main(String[] args) {

        Fighter myStriker = FighterFactory.createFighter("striker");

        System.out.println(myStriker);
    }
}
