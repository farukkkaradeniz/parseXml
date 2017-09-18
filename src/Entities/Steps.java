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
    
}
