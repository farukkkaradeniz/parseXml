/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlModal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Faruk-"pc
 */
@XmlRootElement(name = "ReportNode")
public class ReportNode {

    private String type;

    private ReportNodeData data;

    private List<ReportNode> reportNode = new ArrayList<>();

    public String getType() {
        return type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public ReportNodeData getData() {
        return data;
    }

    @XmlElement(name = "Data")
    public void setData(ReportNodeData data) {
        this.data = data;
    }

    public List<ReportNode> getReportNode() {
        return reportNode;
    }

    @XmlElement(name = "ReportNode")
    public void setReportNode(List<ReportNode> reportNode) {
        this.reportNode = reportNode;
    }

}
