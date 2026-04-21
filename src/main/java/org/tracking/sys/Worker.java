package org.tracking.sys;

import java.util.List;

public class Worker {
    private String name;
    private List<Job> assignedJobs;

    public Worker() {
        this.name = name;
        this.assignedJobs = assignedJobs;
    }
    public Worker(String name){
        this.name=name;
    }


    public void addJob(Job job){
        this.assignedJobs.add(job);
    }

    public void viewJobs(){
        for(Job job : assignedJobs){
            System.out.println(job);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Job> getAssignedJobs() {
        return assignedJobs;
    }

    public void setAssignedJobs(List<Job> assignedJobs) {
        this.assignedJobs = assignedJobs;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", assignedJobs=" + assignedJobs +
                '}';
    }
}
