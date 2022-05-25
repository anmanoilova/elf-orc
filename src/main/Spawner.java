package main;

import java.sql.SQLOutput;
import java.util.*;

public class Spawner {
    private static Spawner spawner = null;

    private Spawner() {
    }

    public static Spawner getInstance() {
        if (spawner == null)
            spawner = new Spawner();
        return spawner;
    }

    static Necromancer necromancer = Necromancer.getInstance();

    public static Elf spawnElf() {
        if (!necromancer.isElfGraveyardEmpty()) {
            Elf elf = necromancer.returnElfFromGraveyard();
            restoreElfHealth(elf);
            return elf;
        } else return createElf();
    }

    private static Elf createElf() {
        return new Elf(100, 50, 25, 100, "Эльфийка");
    }

    private static Elf restoreElfHealth(Elf elf) {
        elf.setHealth(100);
        return elf;
    }

    public static Orc spawnOrc() {
        if (!necromancer.isOrcGraveyardEmpty()) {
            Orc orc = necromancer.returnOrсFromGraveyard();
            restoreOrcHealth(orc);
            return orc;
        } else return createOrc();
    }

    private static Orc restoreOrcHealth(Orc orc) {
        orc.setHealth(107);
        return orc;
    }

    private static Orc createOrc() {
        return new Orc(80, 30, 35, 40, "Орк");
    }


}
