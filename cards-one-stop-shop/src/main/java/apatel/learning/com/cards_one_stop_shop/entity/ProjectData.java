package apatel.learning.com.cards_one_stop_shop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "project_data")
public class ProjectData {

    @Id
    @Column(name = "projectId", nullable = false)
    private String projectId;

    @NotBlank
    @Column(name = "projectDescription", nullable = false)
    private String projectDescription;

    @NotBlank
    @Column(name = "clientId", nullable = false)
    private String clientId;

    @NotBlank
    @Column(name = "platform", nullable = false)
    private String platform;

    @Column(name = "releaseDate")
    private String releaseDate;

    @Column(name = "status")
    private String status;

    @Column(name = "catagory")
    private String catagory;

    @Column(name = "estimate")
    private String estimate;

    @Column(name = "solWalkThroughDt")
    private String solWalkThroughDt;

    @Column(name = "designWalkThroughDt")
    private String designWalkThroughDt;

    @Column(name = "techReviewDt")
    private String techReviewDt;

    @Column(name = "qMigrationDt")
    private String qMigrationDt;

    @Column(name = "vMigrationDt")
    private String vMigrationDt;

    @Column(name = "clientTestVerDt")
    private String clientTestVerDt;

    @Column(name = "pMigrationDt")
    private String pMigrationDt;

    @NotBlank
    @Column(name = "assignedTo", nullable = false)
    private String assignedTo;

    // // Getters and Setters

    public String getProjectId() { return projectId; }
    public void setProjectId(String projectId) { this.projectId = projectId; }

    public String getProjectDescription() { return projectDescription; }
    public void setProjectDescription(String projectDescription) { this.projectDescription = projectDescription; }

    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getCatagory() { return catagory; }
    public void setCatagory(String catagory) { this.catagory = catagory; }

    public String getEstimate() { return estimate; }
    public void setEstimate(String estimate) { this.estimate = estimate; }

    public String getSolWalkThroughDt() { return solWalkThroughDt; }
    public void setSolWalkThroughDt(String solWalkThroughDt) { this.solWalkThroughDt = solWalkThroughDt; }

    public String getDesignWalkThroughDt() { return designWalkThroughDt; }
    public void setDesignWalkThroughDt(String designWalkThroughDt) { this.designWalkThroughDt = designWalkThroughDt; }

    public String getTechReviewDt() { return techReviewDt; }
    public void setTechReviewDt(String techReviewDt) { this.techReviewDt = techReviewDt; }

    public String getQMigrationDt() { return qMigrationDt; }
    public void setQMigrationDt(String qMigrationDt) { this.qMigrationDt = qMigrationDt; }

    public String getVMigrationDt() { return vMigrationDt; }
    public void setVMigrationDt(String vMigrationDt) { this.vMigrationDt = vMigrationDt; }

    public String getClientTestVerDt() { return clientTestVerDt; }
    public void setClientTestVerDt(String clientTestVerDt) { this.clientTestVerDt = clientTestVerDt; }

    public String getPMigrationDt() { return pMigrationDt; }
    public void setPMigrationDt(String pMigrationDt) { this.pMigrationDt = pMigrationDt; }

    public String getAssignedTo() { return assignedTo;}
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
}

