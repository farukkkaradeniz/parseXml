/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlModal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Faruk-pc
 */
@XmlRootElement(name = "Results")
public class Results {

    private GeneralInfo generalInfo;

    private List<ReportNode> reportNodes = new ArrayList<>();

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    @XmlElement(name = "GeneralInfo")
    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public List<ReportNode> getReportNodes() {
        return reportNodes;
    }

    @XmlElement(name = "ReportNode")
    public void setReportNodes(List<ReportNode> reportNodes) {
        this.reportNodes = reportNodes;
    }

}
