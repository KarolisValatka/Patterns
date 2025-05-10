package org.example.factory.fighterFactory;

import org.example.factory.fighter.Fighter;

public class FighterFactory {

    public static Fighter createFighter(String type) {
        switch (type) {
            case "wrestler":
                return new Fighter(
                        170,
                        80.5,
                        "USA",
                        27,
                        "John Jablon",
                        30,
                        80,
                        10
                );
            case "striker":
                return new Fighter(
                        180,
                        75.5,
                        "Netherlands",
                        30,
                        "Straight Hook",
                        10,
                        10,
                        90
                );
            case "bjj":
                return new Fighter(
                        170,
                        72.5,
                        "Brazil",
                        37,
                        "Heel Hook",
                        99,
                        70,
                        10
                );
            default:
                throw new IllegalArgumentException("Unknow fighter entered");
        }

    }
}
