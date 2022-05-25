package main;

import java.util.ArrayDeque;
import java.util.Queue;

public class Necromancer {

    private static Necromancer necromancer = null;
    Queue<Elf> elfGraveyard = new ArrayDeque<>();
    Queue<Orc> orcGraveyard = new ArrayDeque<>();

    private Necromancer() {
    }

    public static Necromancer getInstance() {
        if (necromancer == null)
            necromancer = new Necromancer();
        return necromancer;
    }

    public boolean isElfGraveyardEmpty() {
        return elfGraveyard.isEmpty();
    }

    public Elf returnElfFromGraveyard() {
        return elfGraveyard.poll();
    }

    public boolean isOrcGraveyardEmpty() {
        return orcGraveyard.isEmpty();
    }

    public Orc returnOrсFromGraveyard() {
        return orcGraveyard.poll();
    }

    public void returnOrcToGraveyard(Orc orc) {
        orcGraveyard.add(orc);
    }

    public void returnElfToGraveyard(Elf elf) {
        elfGraveyard.add(elf);
    }
}

