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
public class Scenario {

    private Long id;

    private String scenarioName;

    private Boolean scenarioResult;

    private String scenarioDuration;

    private String scenarioDescription;

    private List<Modules> modules = new ArrayList<>();

    public Scenario(ScenarioBuilder builder) {
        this.modules = builder.modules;
        this.scenarioDescription = builder.scenarioDescription;
        this.scenarioDuration = builder.scenarioDuration;
        this.scenarioName = builder.scenarioName;
        this.scenarioResult = builder.scenarioResult;
        this.modules = builder.modules;
        this.id = builder.id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public Boolean getScenarioResult() {
        return scenarioResult;
    }

    public void setScenarioResult(Boolean scenarioResult) {
        this.scenarioResult = scenarioResult;
    }

    public String getScenarioDuration() {
        return scenarioDuration;
    }

    public void setScenarioDuration(String scenarioDuration) {
        this.scenarioDuration = scenarioDuration;
    }

    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public void setScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
    }

    public List<Modules> getModules() {
        return modules;
    }

    public void setModules(List<Modules> modules) {
        this.modules = modules;
    }

    public static class ScenarioBuilder {

        private Long id;

        private String scenarioName;

        private Boolean scenarioResult;

        private String scenarioDuration;

        private String scenarioDescription;

        private List<Modules> modules = new ArrayList<>();

        public ScenarioBuilder() {
        }

        public ScenarioBuilder setScenarioModules(List<ReportNode> reportNodes) {

            List<Modules> modules = new ArrayList<>();

            for (ReportNode reportNode : reportNodes) {
                modules.add(new Modules.ModulesBuilder()
                        .setModuleDescription(reportNode.getData().getDescription())
                        .setModuleDuration(reportNode.getData().getDuration())
                        .setModuleName(reportNode.getData().getName())
                        .setModuleResult(reportNode.getData().getResult())
                        .setModuleSteps(reportNode.getReportNode())
                        .build());
            }

            this.modules = modules;
            return this;
        }

        public ScenarioBuilder setScenarioId(Long id) {
            this.id = id;
            return this;
        }

        public ScenarioBuilder setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }

        public ScenarioBuilder setScenarioResult(String result) {

            if (result.equalsIgnoreCase("Done")) {
                this.scenarioResult = Boolean.TRUE;
            } else {
                this.scenarioResult = Boolean.FALSE;
            }
            return this;
        }

        public ScenarioBuilder setScenarioDuration(String scenarioDuration) {
            this.scenarioDuration = scenarioDuration;
            return this;
        }

        public ScenarioBuilder setScenarioDescription(String scenarioDescription) {
            this.scenarioDescription = scenarioDescription;
            return this;
        }

        public Scenario build() {

            return new Scenario(this);

        }

    }

}
