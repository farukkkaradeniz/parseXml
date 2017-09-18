/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faruk-pc
 */
public class Modules {
    
    private Long id;
    
    private String moduleName;
    
    private Boolean moduleResult;
    
    private String moduleDuration;
    
    private String moduleDescription;
    
    private List<Steps> steps = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Boolean getModuleResult() {
        return moduleResult;
    }

    public void setModuleResult(Boolean moduleResult) {
        this.moduleResult = moduleResult;
    }

    public String getModuleDuration() {
        return moduleDuration;
    }

    public void setModuleDuration(String moduleDuration) {
        this.moduleDuration = moduleDuration;
    }

    public String getModuleDescription() {
        return moduleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        this.moduleDescription = moduleDescription;
    }

    public List<Steps> getSteps() {
        return steps;
    }

    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }
    
}
