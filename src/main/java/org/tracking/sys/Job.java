package org.tracking.sys;

import java.util.List;
import java.util.PrimitiveIterator;

public class Job extends Worker{

    private Worker assignedWorker;
    private String jobType;
    private boolean isCompleted;
    private List<Material> requiredMaterials;

    public Job(Worker assignedWorker, String jobType, boolean isCompleted, List<Material> requiredMaterials) {
        super();
        this.assignedWorker = assignedWorker;
        this.jobType = jobType;
        this.isCompleted = isCompleted;
        this.requiredMaterials = requiredMaterials;
    }


//    public void markComplete(){
//        if(!isCompleted && !requiredMaterials.isEmpty()){
//            isCompleted = true;
//          requiredMaterials.get(0).useMaterial(int newQuantity);
//
//        }
//    }




    public Worker getAssignedWorker() {
        return assignedWorker;
    }

    public void setAssignedWorker(Worker assignedWorker) {
        this.assignedWorker = assignedWorker;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public List<Material> getRequiredMaterials() {
        return requiredMaterials;
    }

    public void setRequiredMaterials(List<Material> requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }

    @Override
    public String toString() {
        return "Job{" +
                "assignedWorker=" + assignedWorker +
                ", jobType='" + jobType + '\'' +
                ", isCompleted=" + isCompleted +
                ", requiredMaterials=" + requiredMaterials +
                '}';
    }
}
