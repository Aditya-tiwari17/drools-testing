package de.jonashackt.springdrools.internalmodel;

import java.util.Date;
import java.util.Map;

public class ApplicationFeatures {
    private Map<String, Object> features;
    private String lender;
    private String vendor;
    private Boolean isPerfiosFcuDetected;
    private Boolean livesInNegativeArea;
    private Boolean premiumEnabled;
    private String panNumber;
    private String accountNumber;
    private Boolean isLocationServiceable;
    private String userStatus;
    private String applicationStatus;
    private Boolean isSelfEmployed;
    private Object passbookDetails;
    private Boolean consumerPullConsent;
    private Integer statedIncome;
    private Integer salaryInPayslip;
    private Integer perfiosIncome;
    private Boolean salarySeenByOps;
    private Boolean isSubvention;
    private Integer latestLoanStatus;
    private Date latestLoanCreatedAt;
    private Integer incomeToConsiderForFOIR;
    private String sourceName;
    private Integer sourceId;
    private Integer payuFinIncomeToConsider;
    private Integer ficclIncomeToConsider;
    private Integer iiflIncomeToConsider;
    private Integer narcIncomeToConsider;
    private Integer ksfIncomeToConsider;
    private Integer idfcIncomeToConsider;
    private Integer payuFinVIIncomeToConsider;
    private Integer payuFinBSIncomeToConsider;
    private Integer payuFinBUSIncomeToConsider;
    private Integer payuFinSMSIncomeToConsider;
    private Integer ficclVIIncomeToConsider;
    private Integer ficclBSIncomeToConsider;
    private Integer ficclBUSIncomeToConsider;
    private Integer ficclSMSIncomeToConsider;
    private Integer iiflVIIncomeToConsider;
    private Integer iiflBSIncomeToConsider;
    private Integer iiflBUSIncomeToConsider;
    private Integer iiflSMSIncomeToConsider;
    private Integer narcVIIncomeToConsider;
    private Integer narcBSIncomeToConsider;
    private Integer narcBUSIncomeToConsider;
    private Integer narcSMSIncomeToConsider;
    private Integer ksfVIIncomeToConsider;
    private Integer ksfBSIncomeToConsider;
    private Integer ksfBUSIncomeToConsider;
    private Integer ksfSMSIncomeToConsider;
    private Integer idfcVIIncomeToConsider;
    private Integer idfcBSIncomeToConsider;
    private Integer idfcBUSIncomeToConsider;
    private Integer idfcSMSIncomeToConsider;
    private String loanReason;
    private Boolean isOpsRejected;
    private String envType;
    private Boolean isRbpUser;
    private String breChannel;
    private Boolean isPayuFin10LIntent;
    private Boolean isPayuFin10LEligible;
    private Boolean isPayuFinKycCompleted;
    private Boolean hasTopUpIntent;
    private Boolean isPayuFinSurrogateEnabledDSA;
    private Boolean isKSFSurrogateEnabledDSA;
    private Boolean isSalaryDetectedByOps;

    public ApplicationFeatures() {
    }

    public Map<String, Object> getFeatures() {
        return this.features;
    }

    public String getLender() {
        return this.lender;
    }

    public String getVendor() {
        return this.vendor;
    }

    public Boolean getIsPerfiosFcuDetected() {
        return this.isPerfiosFcuDetected;
    }

    public Boolean getLivesInNegativeArea() {
        return this.livesInNegativeArea;
    }

    public Boolean getPremiumEnabled() {
        return this.premiumEnabled;
    }

    public String getPanNumber() {
        return this.panNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Boolean getIsLocationServiceable() {
        return this.isLocationServiceable;
    }

    public String getUserStatus() {
        return this.userStatus;
    }

    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    public Boolean getIsSelfEmployed() {
        return this.isSelfEmployed;
    }

    public Object getPassbookDetails() {
        return this.passbookDetails;
    }

    public Boolean getConsumerPullConsent() {
        return this.consumerPullConsent;
    }

    public Integer getStatedIncome() {
        return this.statedIncome;
    }

    public Integer getSalaryInPayslip() {
        return this.salaryInPayslip;
    }

    public Integer getPerfiosIncome() {
        return this.perfiosIncome;
    }

    public Boolean getSalarySeenByOps() {
        return this.salarySeenByOps;
    }

    public Boolean getIsSubvention() {
        return this.isSubvention;
    }

    public Integer getLatestLoanStatus() {
        return this.latestLoanStatus;
    }

    public Date getLatestLoanCreatedAt() {
        return this.latestLoanCreatedAt;
    }

    public Integer getIncomeToConsiderForFOIR() {
        return this.incomeToConsiderForFOIR;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public Integer getPayuFinIncomeToConsider() {
        return this.payuFinIncomeToConsider;
    }

    public Integer getFicclIncomeToConsider() {
        return this.ficclIncomeToConsider;
    }

    public Integer getIiflIncomeToConsider() {
        return this.iiflIncomeToConsider;
    }

    public Integer getNarcIncomeToConsider() {
        return this.narcIncomeToConsider;
    }

    public Integer getKsfIncomeToConsider() {
        return this.ksfIncomeToConsider;
    }

    public Integer getIdfcIncomeToConsider() {
        return this.idfcIncomeToConsider;
    }

    public Integer getPayuFinVIIncomeToConsider() {
        return this.payuFinVIIncomeToConsider;
    }

    public Integer getPayuFinBSIncomeToConsider() {
        return this.payuFinBSIncomeToConsider;
    }

    public Integer getPayuFinBUSIncomeToConsider() {
        return this.payuFinBUSIncomeToConsider;
    }

    public Integer getPayuFinSMSIncomeToConsider() {
        return this.payuFinSMSIncomeToConsider;
    }

    public Integer getFicclVIIncomeToConsider() {
        return this.ficclVIIncomeToConsider;
    }

    public Integer getFicclBSIncomeToConsider() {
        return this.ficclBSIncomeToConsider;
    }

    public Integer getFicclBUSIncomeToConsider() {
        return this.ficclBUSIncomeToConsider;
    }

    public Integer getFicclSMSIncomeToConsider() {
        return this.ficclSMSIncomeToConsider;
    }

    public Integer getIiflVIIncomeToConsider() {
        return this.iiflVIIncomeToConsider;
    }

    public Integer getIiflBSIncomeToConsider() {
        return this.iiflBSIncomeToConsider;
    }

    public Integer getIiflBUSIncomeToConsider() {
        return this.iiflBUSIncomeToConsider;
    }

    public Integer getIiflSMSIncomeToConsider() {
        return this.iiflSMSIncomeToConsider;
    }

    public Integer getNarcVIIncomeToConsider() {
        return this.narcVIIncomeToConsider;
    }

    public Integer getNarcBSIncomeToConsider() {
        return this.narcBSIncomeToConsider;
    }

    public Integer getNarcBUSIncomeToConsider() {
        return this.narcBUSIncomeToConsider;
    }

    public Integer getNarcSMSIncomeToConsider() {
        return this.narcSMSIncomeToConsider;
    }

    public Integer getKsfVIIncomeToConsider() {
        return this.ksfVIIncomeToConsider;
    }

    public Integer getKsfBSIncomeToConsider() {
        return this.ksfBSIncomeToConsider;
    }

    public Integer getKsfBUSIncomeToConsider() {
        return this.ksfBUSIncomeToConsider;
    }

    public Integer getKsfSMSIncomeToConsider() {
        return this.ksfSMSIncomeToConsider;
    }

    public Integer getIdfcVIIncomeToConsider() {
        return this.idfcVIIncomeToConsider;
    }

    public Integer getIdfcBSIncomeToConsider() {
        return this.idfcBSIncomeToConsider;
    }

    public Integer getIdfcBUSIncomeToConsider() {
        return this.idfcBUSIncomeToConsider;
    }

    public Integer getIdfcSMSIncomeToConsider() {
        return this.idfcSMSIncomeToConsider;
    }

    public String getLoanReason() {
        return this.loanReason;
    }

    public Boolean getIsOpsRejected() {
        return this.isOpsRejected;
    }

    public String getEnvType() {
        return this.envType;
    }

    public Boolean getIsRbpUser() {
        return this.isRbpUser;
    }

    public String getBreChannel() {
        return this.breChannel;
    }

    public Boolean getIsPayuFin10LIntent() {
        return this.isPayuFin10LIntent;
    }

    public Boolean getIsPayuFin10LEligible() {
        return this.isPayuFin10LEligible;
    }

    public Boolean getIsPayuFinKycCompleted() {
        return this.isPayuFinKycCompleted;
    }

    public Boolean getHasTopUpIntent() {
        return this.hasTopUpIntent;
    }

    public Boolean getIsPayuFinSurrogateEnabledDSA() {
        return this.isPayuFinSurrogateEnabledDSA;
    }

    public Boolean getIsKSFSurrogateEnabledDSA() {
        return this.isKSFSurrogateEnabledDSA;
    }

    public Boolean getIsSalaryDetectedByOps() {
        return this.isSalaryDetectedByOps;
    }

    public void setFeatures(Map<String, Object> features) {
        this.features = features;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setIsPerfiosFcuDetected(Boolean isPerfiosFcuDetected) {
        this.isPerfiosFcuDetected = isPerfiosFcuDetected;
    }

    public void setLivesInNegativeArea(Boolean livesInNegativeArea) {
        this.livesInNegativeArea = livesInNegativeArea;
    }

    public void setPremiumEnabled(Boolean premiumEnabled) {
        this.premiumEnabled = premiumEnabled;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setIsLocationServiceable(Boolean isLocationServiceable) {
        this.isLocationServiceable = isLocationServiceable;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public void setIsSelfEmployed(Boolean isSelfEmployed) {
        this.isSelfEmployed = isSelfEmployed;
    }

    public void setPassbookDetails(Object passbookDetails) {
        this.passbookDetails = passbookDetails;
    }

    public void setConsumerPullConsent(Boolean consumerPullConsent) {
        this.consumerPullConsent = consumerPullConsent;
    }

    public void setStatedIncome(Integer statedIncome) {
        this.statedIncome = statedIncome;
    }

    public void setSalaryInPayslip(Integer salaryInPayslip) {
        this.salaryInPayslip = salaryInPayslip;
    }

    public void setPerfiosIncome(Integer perfiosIncome) {
        this.perfiosIncome = perfiosIncome;
    }

    public void setSalarySeenByOps(Boolean salarySeenByOps) {
        this.salarySeenByOps = salarySeenByOps;
    }

    public void setIsSubvention(Boolean isSubvention) {
        this.isSubvention = isSubvention;
    }

    public void setLatestLoanStatus(Integer latestLoanStatus) {
        this.latestLoanStatus = latestLoanStatus;
    }

    public void setLatestLoanCreatedAt(Date latestLoanCreatedAt) {
        this.latestLoanCreatedAt = latestLoanCreatedAt;
    }

    public void setIncomeToConsiderForFOIR(Integer incomeToConsiderForFOIR) {
        this.incomeToConsiderForFOIR = incomeToConsiderForFOIR;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public void setPayuFinIncomeToConsider(Integer payuFinIncomeToConsider) {
        this.payuFinIncomeToConsider = payuFinIncomeToConsider;
    }

    public void setFicclIncomeToConsider(Integer ficclIncomeToConsider) {
        this.ficclIncomeToConsider = ficclIncomeToConsider;
    }

    public void setIiflIncomeToConsider(Integer iiflIncomeToConsider) {
        this.iiflIncomeToConsider = iiflIncomeToConsider;
    }

    public void setNarcIncomeToConsider(Integer narcIncomeToConsider) {
        this.narcIncomeToConsider = narcIncomeToConsider;
    }

    public void setKsfIncomeToConsider(Integer ksfIncomeToConsider) {
        this.ksfIncomeToConsider = ksfIncomeToConsider;
    }

    public void setIdfcIncomeToConsider(Integer idfcIncomeToConsider) {
        this.idfcIncomeToConsider = idfcIncomeToConsider;
    }

    public void setPayuFinVIIncomeToConsider(Integer payuFinVIIncomeToConsider) {
        this.payuFinVIIncomeToConsider = payuFinVIIncomeToConsider;
    }

    public void setPayuFinBSIncomeToConsider(Integer payuFinBSIncomeToConsider) {
        this.payuFinBSIncomeToConsider = payuFinBSIncomeToConsider;
    }

    public void setPayuFinBUSIncomeToConsider(Integer payuFinBUSIncomeToConsider) {
        this.payuFinBUSIncomeToConsider = payuFinBUSIncomeToConsider;
    }

    public void setPayuFinSMSIncomeToConsider(Integer payuFinSMSIncomeToConsider) {
        this.payuFinSMSIncomeToConsider = payuFinSMSIncomeToConsider;
    }

    public void setFicclVIIncomeToConsider(Integer ficclVIIncomeToConsider) {
        this.ficclVIIncomeToConsider = ficclVIIncomeToConsider;
    }

    public void setFicclBSIncomeToConsider(Integer ficclBSIncomeToConsider) {
        this.ficclBSIncomeToConsider = ficclBSIncomeToConsider;
    }

    public void setFicclBUSIncomeToConsider(Integer ficclBUSIncomeToConsider) {
        this.ficclBUSIncomeToConsider = ficclBUSIncomeToConsider;
    }

    public void setFicclSMSIncomeToConsider(Integer ficclSMSIncomeToConsider) {
        this.ficclSMSIncomeToConsider = ficclSMSIncomeToConsider;
    }

    public void setIiflVIIncomeToConsider(Integer iiflVIIncomeToConsider) {
        this.iiflVIIncomeToConsider = iiflVIIncomeToConsider;
    }

    public void setIiflBSIncomeToConsider(Integer iiflBSIncomeToConsider) {
        this.iiflBSIncomeToConsider = iiflBSIncomeToConsider;
    }

    public void setIiflBUSIncomeToConsider(Integer iiflBUSIncomeToConsider) {
        this.iiflBUSIncomeToConsider = iiflBUSIncomeToConsider;
    }

    public void setIiflSMSIncomeToConsider(Integer iiflSMSIncomeToConsider) {
        this.iiflSMSIncomeToConsider = iiflSMSIncomeToConsider;
    }

    public void setNarcVIIncomeToConsider(Integer narcVIIncomeToConsider) {
        this.narcVIIncomeToConsider = narcVIIncomeToConsider;
    }

    public void setNarcBSIncomeToConsider(Integer narcBSIncomeToConsider) {
        this.narcBSIncomeToConsider = narcBSIncomeToConsider;
    }

    public void setNarcBUSIncomeToConsider(Integer narcBUSIncomeToConsider) {
        this.narcBUSIncomeToConsider = narcBUSIncomeToConsider;
    }

    public void setNarcSMSIncomeToConsider(Integer narcSMSIncomeToConsider) {
        this.narcSMSIncomeToConsider = narcSMSIncomeToConsider;
    }

    public void setKsfVIIncomeToConsider(Integer ksfVIIncomeToConsider) {
        this.ksfVIIncomeToConsider = ksfVIIncomeToConsider;
    }

    public void setKsfBSIncomeToConsider(Integer ksfBSIncomeToConsider) {
        this.ksfBSIncomeToConsider = ksfBSIncomeToConsider;
    }

    public void setKsfBUSIncomeToConsider(Integer ksfBUSIncomeToConsider) {
        this.ksfBUSIncomeToConsider = ksfBUSIncomeToConsider;
    }

    public void setKsfSMSIncomeToConsider(Integer ksfSMSIncomeToConsider) {
        this.ksfSMSIncomeToConsider = ksfSMSIncomeToConsider;
    }

    public void setIdfcVIIncomeToConsider(Integer idfcVIIncomeToConsider) {
        this.idfcVIIncomeToConsider = idfcVIIncomeToConsider;
    }

    public void setIdfcBSIncomeToConsider(Integer idfcBSIncomeToConsider) {
        this.idfcBSIncomeToConsider = idfcBSIncomeToConsider;
    }

    public void setIdfcBUSIncomeToConsider(Integer idfcBUSIncomeToConsider) {
        this.idfcBUSIncomeToConsider = idfcBUSIncomeToConsider;
    }

    public void setIdfcSMSIncomeToConsider(Integer idfcSMSIncomeToConsider) {
        this.idfcSMSIncomeToConsider = idfcSMSIncomeToConsider;
    }

    public void setLoanReason(String loanReason) {
        this.loanReason = loanReason;
    }

    public void setIsOpsRejected(Boolean isOpsRejected) {
        this.isOpsRejected = isOpsRejected;
    }

    public void setEnvType(String envType) {
        this.envType = envType;
    }

    public void setIsRbpUser(Boolean isRbpUser) {
        this.isRbpUser = isRbpUser;
    }

    public void setBreChannel(String breChannel) {
        this.breChannel = breChannel;
    }

    public void setIsPayuFin10LIntent(Boolean isPayuFin10LIntent) {
        this.isPayuFin10LIntent = isPayuFin10LIntent;
    }

    public void setIsPayuFin10LEligible(Boolean isPayuFin10LEligible) {
        this.isPayuFin10LEligible = isPayuFin10LEligible;
    }

    public void setIsPayuFinKycCompleted(Boolean isPayuFinKycCompleted) {
        this.isPayuFinKycCompleted = isPayuFinKycCompleted;
    }

    public void setHasTopUpIntent(Boolean hasTopUpIntent) {
        this.hasTopUpIntent = hasTopUpIntent;
    }

    public void setIsPayuFinSurrogateEnabledDSA(Boolean isPayuFinSurrogateEnabledDSA) {
        this.isPayuFinSurrogateEnabledDSA = isPayuFinSurrogateEnabledDSA;
    }

    public void setIsKSFSurrogateEnabledDSA(Boolean isKSFSurrogateEnabledDSA) {
        this.isKSFSurrogateEnabledDSA = isKSFSurrogateEnabledDSA;
    }

    public void setIsSalaryDetectedByOps(Boolean isSalaryDetectedByOps) {
        this.isSalaryDetectedByOps = isSalaryDetectedByOps;
    }

    public String toString() {
        return "ApplicationFeatures(features=" + this.getFeatures() + ", lender=" + this.getLender() + ", vendor=" + this.getVendor() + ", isPerfiosFcuDetected=" + this.getIsPerfiosFcuDetected() + ", livesInNegativeArea=" + this.getLivesInNegativeArea() + ", premiumEnabled=" + this.getPremiumEnabled() + ", panNumber=" + this.getPanNumber() + ", accountNumber=" + this.getAccountNumber() + ", isLocationServiceable=" + this.getIsLocationServiceable() + ", userStatus=" + this.getUserStatus() + ", applicationStatus=" + this.getApplicationStatus() + ", isSelfEmployed=" + this.getIsSelfEmployed() + ", passbookDetails=" + this.getPassbookDetails() + ", consumerPullConsent=" + this.getConsumerPullConsent() + ", statedIncome=" + this.getStatedIncome() + ", salaryInPayslip=" + this.getSalaryInPayslip() + ", perfiosIncome=" + this.getPerfiosIncome() + ", salarySeenByOps=" + this.getSalarySeenByOps() + ", isSubvention=" + this.getIsSubvention() + ", latestLoanStatus=" + this.getLatestLoanStatus() + ", latestLoanCreatedAt=" + this.getLatestLoanCreatedAt() + ", incomeToConsiderForFOIR=" + this.getIncomeToConsiderForFOIR() + ", sourceName=" + this.getSourceName() + ", sourceId=" + this.getSourceId() + ", payuFinIncomeToConsider=" + this.getPayuFinIncomeToConsider() + ", ficclIncomeToConsider=" + this.getFicclIncomeToConsider() + ", iiflIncomeToConsider=" + this.getIiflIncomeToConsider() + ", narcIncomeToConsider=" + this.getNarcIncomeToConsider() + ", ksfIncomeToConsider=" + this.getKsfIncomeToConsider() + ", idfcIncomeToConsider=" + this.getIdfcIncomeToConsider() + ", payuFinVIIncomeToConsider=" + this.getPayuFinVIIncomeToConsider() + ", payuFinBSIncomeToConsider=" + this.getPayuFinBSIncomeToConsider() + ", payuFinBUSIncomeToConsider=" + this.getPayuFinBUSIncomeToConsider() + ", payuFinSMSIncomeToConsider=" + this.getPayuFinSMSIncomeToConsider() + ", ficclVIIncomeToConsider=" + this.getFicclVIIncomeToConsider() + ", ficclBSIncomeToConsider=" + this.getFicclBSIncomeToConsider() + ", ficclBUSIncomeToConsider=" + this.getFicclBUSIncomeToConsider() + ", ficclSMSIncomeToConsider=" + this.getFicclSMSIncomeToConsider() + ", iiflVIIncomeToConsider=" + this.getIiflVIIncomeToConsider() + ", iiflBSIncomeToConsider=" + this.getIiflBSIncomeToConsider() + ", iiflBUSIncomeToConsider=" + this.getIiflBUSIncomeToConsider() + ", iiflSMSIncomeToConsider=" + this.getIiflSMSIncomeToConsider() + ", narcVIIncomeToConsider=" + this.getNarcVIIncomeToConsider() + ", narcBSIncomeToConsider=" + this.getNarcBSIncomeToConsider() + ", narcBUSIncomeToConsider=" + this.getNarcBUSIncomeToConsider() + ", narcSMSIncomeToConsider=" + this.getNarcSMSIncomeToConsider() + ", ksfVIIncomeToConsider=" + this.getKsfVIIncomeToConsider() + ", ksfBSIncomeToConsider=" + this.getKsfBSIncomeToConsider() + ", ksfBUSIncomeToConsider=" + this.getKsfBUSIncomeToConsider() + ", ksfSMSIncomeToConsider=" + this.getKsfSMSIncomeToConsider() + ", idfcVIIncomeToConsider=" + this.getIdfcVIIncomeToConsider() + ", idfcBSIncomeToConsider=" + this.getIdfcBSIncomeToConsider() + ", idfcBUSIncomeToConsider=" + this.getIdfcBUSIncomeToConsider() + ", idfcSMSIncomeToConsider=" + this.getIdfcSMSIncomeToConsider() + ", loanReason=" + this.getLoanReason() + ", isOpsRejected=" + this.getIsOpsRejected() + ", envType=" + this.getEnvType() + ", isRbpUser=" + this.getIsRbpUser() + ", breChannel=" + this.getBreChannel() + ", isPayuFin10LIntent=" + this.getIsPayuFin10LIntent() + ", isPayuFin10LEligible=" + this.getIsPayuFin10LEligible() + ", isPayuFinKycCompleted=" + this.getIsPayuFinKycCompleted() + ", hasTopUpIntent=" + this.getHasTopUpIntent() + ", isPayuFinSurrogateEnabledDSA=" + this.getIsPayuFinSurrogateEnabledDSA() + ", isKSFSurrogateEnabledDSA=" + this.getIsKSFSurrogateEnabledDSA() + ", isSalaryDetectedByOps=" + this.getIsSalaryDetectedByOps() + ")";
    }
}
