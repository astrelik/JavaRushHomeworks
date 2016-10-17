package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Protoss";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Archon";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Carrier";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Colossus";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Immortal";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Mothership";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Observer";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Phoenix";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Probe";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Sentry";

        Protos protos1 = new Protos();
        protos1.name = "Stalker";
        Protos protos2 = new Protos();
        protos2.name = "Zealot";
        Protos protos3 = new Protos();
        protos3.name = "Assimilator";
        Protos protos4 = new Protos();
        protos4.name = "Forge";
        Protos protos5 = new Protos();
        protos5.name = "Gateway";

        Terran terran1 = new Terran();
        terran1.name = "Nexus";
        Terran terran2 = new Terran();
        terran2.name = "Pylon";
        Terran terran3 = new Terran();
        terran3.name = "Stargate";
        Terran terran4 = new Terran();
        terran4.name = "Oracle";
        Terran terran5 = new Terran();
        terran5.name = "Adept";
        Terran terran6 = new Terran();
        terran6.name = "Disruptor";
        Terran terran7 = new Terran();
        terran7.name = "Banshee";
        Terran terran8 = new Terran();
        terran8.name = "Battlecruiser";
        Terran terran9 = new Terran();
        terran9.name = "Ghost";
        Terran terran10 = new Terran();
        terran10.name = "Hellion";
        Terran terran11 = new Terran();
        terran11.name = "Marauder";
        Terran terran12 = new Terran();
        terran12.name = "Marine";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}