package main;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fight {

    public static void main(String args[]) {
        Necromancer necromancer = Necromancer.getInstance();
        Spawner spawner = Spawner.getInstance();
        int timer = 5;
        while (timer > 0) {
            System.out.println(" ================== ");
            timer--;
            Elf elf = Spawner.spawnElf();
            Orc orc = Spawner.spawnOrc();

            while (!orc.isDead() && !elf.isDead()) {
                orc.attack(elf);
                elf.attack(orc);
            }

            if (orc.isDead()) {
                necromancer.returnOrcToGraveyard(orc);
            }
            if (elf.isDead()) {
                necromancer.returnElfToGraveyard(elf);
            }

            System.out.println("    ");
        }
    }
}
