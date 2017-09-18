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
        this.scenarioDuration = builder.scenarioDescription;
        this.scenarioName = builder.scenarioName;
        this.scenarioResult = builder.scenarioResult;
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

    public class ScenarioBuilder {

        private Long id;

        private String scenarioName;

        private Boolean scenarioResult;

        private String scenarioDuration;

        private String scenarioDescription;

        private List<Modules> modules = new ArrayList<>();

        private String moduleName;

        private Boolean moduleResult;

        private String moduleDuration;

        private String moduleDescription;

        private List<Steps> steps = new ArrayList<>();

        public ScenarioBuilder setScenarioId(Long id) {
            this.id = id;
            return this;
        }

        public ScenarioBuilder setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }

        public ScenarioBuilder setScenarioResult(Boolean scenarioResult) {
            this.scenarioResult = scenarioResult;
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
