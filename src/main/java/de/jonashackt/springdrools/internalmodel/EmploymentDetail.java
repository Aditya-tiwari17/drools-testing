package de.jonashackt.springdrools.internalmodel;

public class EmploymentDetail {
    private String employer;
    private String employerId;
    private String employerCategory;
    private String employementType;
    private String employmentPaymentMode;
    private String employerIndustry;
    private String employerSubIndustry;

    public EmploymentDetail() {
    }

    public String getEmployer() {
        return this.employer;
    }

    public String getEmployerId() {
        return this.employerId;
    }

    public String getEmployerCategory() {
        return this.employerCategory;
    }

    public String getEmployementType() {
        return this.employementType;
    }

    public String getEmploymentPaymentMode() {
        return this.employmentPaymentMode;
    }

    public String getEmployerIndustry() {
        return this.employerIndustry;
    }

    public String getEmployerSubIndustry() {
        return this.employerSubIndustry;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setEmployerId(String employerId) {
        this.employerId = employerId;
    }

    public void setEmployerCategory(String employerCategory) {
        this.employerCategory = employerCategory;
    }

    public void setEmployementType(String employementType) {
        this.employementType = employementType;
    }

    public void setEmploymentPaymentMode(String employmentPaymentMode) {
        this.employmentPaymentMode = employmentPaymentMode;
    }

    public void setEmployerIndustry(String employerIndustry) {
        this.employerIndustry = employerIndustry;
    }

    public void setEmployerSubIndustry(String employerSubIndustry) {
        this.employerSubIndustry = employerSubIndustry;
    }

    public String toString() {
        return "EmploymentDetail(employer=" + this.getEmployer() + ", employerId=" + this.getEmployerId() + ", employerCategory=" + this.getEmployerCategory() + ", employementType=" + this.getEmployementType() + ", employmentPaymentMode=" + this.getEmploymentPaymentMode() + ", employerIndustry=" + this.getEmployerIndustry() + ", employerSubIndustry=" + this.getEmployerSubIndustry() + ")";
    }
}
