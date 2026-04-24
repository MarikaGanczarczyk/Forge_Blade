package org.tracking.sys;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Materials
        Material steel = new Material("Steel", 50);
        Material iron = new Material("Iron", 30);

        steel.useMaterial(20);
        iron.useMaterial(10);
        System.out.println(steel);
        System.out.println(iron);

      List<Material> materials = new ArrayList<>();
      materials.add(steel);
      materials.add(iron);
        System.out.println(materials);


        //Workers
      Worker jon = new Worker("Jon");
      Worker peter = new Worker("Peter");


      //Jobs
     Job job1 = new Job(jon, "Knife forging", false, materials);
    Job job2 = new Job(peter, "Steel cutting", true, materials);

        System.out.println("Jobs for John: " );
        jon.viewJobs();
        System.out.println("Jobs for Peter");
        peter.viewJobs();



    }
}