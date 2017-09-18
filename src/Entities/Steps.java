/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Faruk-pc
 */
public class Steps {

    private Long id;

    private String stepName;

    private Boolean stepResult;

    private String stepDuration;

    private String stepDescription;

    private Steps(StepsBuilder builder) {
        this.stepName = builder.stepName;
        this.stepDescription = builder.stepDescription;
        this.stepDuration = builder.stepDuration;
        this.stepResult = builder.stepResult;
        this.id = builder.id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public Boolean getStepResult() {
        return stepResult;
    }

    public void setStepResult(Boolean stepResult) {
        this.stepResult = stepResult;
    }

    public String getStepDuration() {
        return stepDuration;
    }

    public void setStepDuration(String stepDuration) {
        this.stepDuration = stepDuration;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    public static class StepsBuilder {

        private Long id;

        private String stepName;

        private Boolean stepResult;

        private String stepDuration;

        private String stepDescription;

        public StepsBuilder setStepId(Long id) {
            this.id = id;
            return this;
        }

        public StepsBuilder setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        
        public StepsBuilder setStepDuration(String stepDuration){
            this.stepDuration = stepDuration;
            return this;
        }
        
        public StepsBuilder setStepDescription(String stepDescription){
            this.stepDescription = stepDescription;
            return this;
        }

        public StepsBuilder setStepResult(String result) {
            if (result.equalsIgnoreCase("Done")) {
                this.stepResult = Boolean.TRUE;
            } else {
                this.stepResult = Boolean.FALSE;
            }
            return this;
        }
        
        public Steps Build(){
            return new Steps(this);
        }

    }

}
