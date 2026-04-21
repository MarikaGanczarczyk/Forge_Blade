package org.tracking.sys;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Material steel = new Material("Steel", 50);
        Material iron = new Material("Iron", 30);
        System.out.println(steel.useMaterial(20));
        System.out.println(iron.useMaterial(10));
List<Material> materials = new ArrayList<>();

materials.add(steel);
materials.add(iron);
        System.out.println(materials);

      Worker jon = new Worker("Jon");Worker peter = new Worker("Peter");

     Job job1 = new Job(jon, "Knife forging", false, materials);
    Job job2 = new Job(peter, "Steel cutting", true, materials);





    }
}