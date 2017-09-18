/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import XmlModal.ReportNode;
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

    private Modules(ModulesBuilder builder) {
        this.moduleDescription = builder.moduleDescription;
        this.moduleDuration = builder.moduleDuration;
        this.moduleName = builder.moduleName;
        this.moduleResult = builder.moduleResult;
        this.steps = builder.steps;
    }

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

    public static class ModulesBuilder {

        private Long id;

        private String moduleName;

        private Boolean moduleResult;

        private String moduleDuration;

        private String moduleDescription;

        private List<Steps> steps = new ArrayList<>();

        public ModulesBuilder setModuleId(Long id) {
            this.id = id;
            return this;
        }

        public ModulesBuilder setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public ModulesBuilder setModuleSteps(List<ReportNode> reportNodes) {

            List<Steps> steps = new ArrayList<>();

            for (ReportNode reportNode : reportNodes) {
                steps.add(new Steps.StepsBuilder()
                        .setStepDescription(reportNode.getData().getDescription())
                        .setStepDuration(reportNode.getData().getDuration())
                        .setStepName(reportNode.getData().getName())
                        .setStepResult(reportNode.getData().getResult())
                        .Build());
            }

            this.steps = steps;
            return this;
        }

        public ModulesBuilder setModuleDescription(String moduleDescription) {
            this.moduleDescription = moduleDescription;
            return this;
        }

        public ModulesBuilder setModuleDuration(String moduleDuration) {
            this.moduleDuration = moduleDuration;
            return this;
        }

        public ModulesBuilder setModuleResult(String result) {
            if (result.equalsIgnoreCase("Done")) {
                this.moduleResult = Boolean.TRUE;
            } else {
                this.moduleResult = Boolean.FALSE;
            }
            return this;
        }

        public Modules build() {
            return new Modules(this);
        }

    }

}
