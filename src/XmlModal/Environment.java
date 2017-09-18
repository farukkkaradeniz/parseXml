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
@XmlRootElement(name = "Environment")
public class Environment {
    
    private String user;
    
    private String cpuInfo;
    
    private String numberOfCores;
    
    private String totalMemory;
    
    private String hostName;
    
    private String osInfo;

    public String getUser() {
        return user;
    }

    @XmlElement(name = "User")
    public void setUser(String user) {
        this.user = user;
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    @XmlElement(name = "CpuInfo")
    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public String getNumberOfCores() {
        return numberOfCores;
    }

    @XmlElement(name = "NumberOfCores")
    public void setNumberOfCores(String numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getTotalMemory() {
        return totalMemory;
    }

    @XmlElement(name = "TotalMemory")
    public void setTotalMemory(String totalMemory) {
        this.totalMemory = totalMemory;
    }

    public String getHostName() {
        return hostName;
    }

    @XmlElement(name = "HostName")
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getOsInfo() {
        return osInfo;
    }

    @XmlElement(name = "OSInfo")
    public void setOsInfo(String osInfo) {
        this.osInfo = osInfo;
    }
    
    
    
}
