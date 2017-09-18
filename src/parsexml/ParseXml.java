/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsexml;

import Entities.Scenario;
import XmlModal.ReportNode;
import XmlModal.Results;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Faruk-pc
 */
public class ParseXml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File xmlFile = new File("C:\\Users\\Faruk-pc\\Downloads\\Report\\Report\\run_results.xml");
        
        try {
            
            JAXBContext jAXBContext = JAXBContext.newInstance(Results.class);
            
            Unmarshaller jaxbUnmarshaller = jAXBContext.createUnmarshaller();
            
            Results results = (Results) jaxbUnmarshaller.unmarshal(xmlFile);
            MeaningResults(results);
            System.out.println(results.getGeneralInfo().getResultName());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void MeaningResults(Results result) {
        ReportNode reportnodes = result.getReportNodes().get(0).getReportNode().get(0).getReportNode().get(0);
        Scenario scenario;
        scenario = new Scenario.ScenarioBuilder()
                .setScenarioDescription(reportnodes.getData().getDescription())
                .setScenarioDuration(reportnodes.getData().getDuration())
                .setScenarioName(reportnodes.getData().getName())
                .setScenarioResult(reportnodes.getData().getResult())
                .setScenarioModules(reportnodes.getReportNode())
                .build();
        
        System.out.println(scenario.getScenarioName());
        
    }
    
}
