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
public class Users {
    
    private Long id;
    
    private String userName;
    
    private String userComputerHostName;
    
    private String userComputerMemory;
    
    private String userComputerOperatingSystem;
    
    private String userComputerNumberOfCores;
    
    private String userComputerCpuInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserComputerHostName() {
        return userComputerHostName;
    }

    public void setUserComputerHostName(String userComputerHostName) {
        this.userComputerHostName = userComputerHostName;
    }

    public String getUserComputerMemory() {
        return userComputerMemory;
    }

    public void setUserComputerMemory(String userComputerMemory) {
        this.userComputerMemory = userComputerMemory;
    }

    public String getUserComputerOperatingSystem() {
        return userComputerOperatingSystem;
    }

    public void setUserComputerOperatingSystem(String userComputerOperatingSystem) {
        this.userComputerOperatingSystem = userComputerOperatingSystem;
    }

    public String getUserComputerNumberOfCores() {
        return userComputerNumberOfCores;
    }

    public void setUserComputerNumberOfCores(String userComputerNumberOfCores) {
        this.userComputerNumberOfCores = userComputerNumberOfCores;
    }

    public String getUserComputerCpuInfo() {
        return userComputerCpuInfo;
    }

    public void setUserComputerCpuInfo(String userComputerCpuInfo) {
        this.userComputerCpuInfo = userComputerCpuInfo;
    }
    
}
