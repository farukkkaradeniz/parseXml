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
@XmlRootElement(name = "GeneralInfo")
public class GeneralInfo {

    
    private String resultName;

    
    private String runStartTime;

    
    private String timeZone;

    public String getResultName() {
        return resultName;
    }

    @XmlElement(name = "ResultName")
    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getRunStartTime() {
        return runStartTime;
    }

    @XmlElement(name = "RunStartTime")
    public void setRunStartTime(String runStartTime) {
        this.runStartTime = runStartTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    @XmlElement(name = "Timezone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
