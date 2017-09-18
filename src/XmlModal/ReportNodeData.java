/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlModal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Faruk-pc
 */
@XmlRootElement(name = "Data")
public class ReportNodeData {

    private String name;

    private String description;

    private String startTime;

    private String result;

    private String duration;
    
    private String toolVersion;

    public String getName() {
        return name;
    }

    @XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement(name = "Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    @XmlElement(name = "StartTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getResult() {
        return result;
    }

    @XmlElement(name = "Result")
    public void setResult(String result) {
        this.result = result;
    }

    public String getDuration() {
        return duration;
    }

    @XmlElement(name = "Duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getToolVersion() {
        return toolVersion;
    }

    @XmlElement(name = "ToolVersion")
    public void setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
    }
    
}
