package de.jonashackt.springdrools;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;
import de.jonashackt.springdrools.internalmodel.ApplicationFeatures;
import de.jonashackt.springdrools.internalmodel.ApplicationRuleResult;
import de.jonashackt.springdrools.internalmodel.EmploymentDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static org.junit.Assert.assertEquals;

@DroolsFiles(ruleFiles = {"rules/givenlendersupportedemptyperule.drl"})
@RunWith(DroolsJUnitRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class GivenLenderSupportedEmptyPeRuleTests {
    EmploymentDetail employmentDetail = new EmploymentDetail();
    ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();
    ApplicationFeatures applicationFeatures = new ApplicationFeatures();

    @StatefulDroolsSession
    private DroolsSession<?> kieSession;

    private void insertObjects(EmploymentDetail employmentDetail,
                               ApplicationRuleResult applicationRuleResult,
                               ApplicationFeatures applicationFeatures) {
        kieSession.insert(employmentDetail);
        kieSession.insert(applicationRuleResult);
        kieSession.insert(applicationFeatures);
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest1() {
        applicationFeatures.setLender("FULLERTON");
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest2() {
        applicationFeatures.setLender("IIFL");
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest3() {
        applicationFeatures.setLender("KSF");
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest4() {
        applicationFeatures.setLender("NORTHERN_ARC");
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest5() {
        applicationFeatures.setLender("PAYUFIN");
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest6() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest7() {
        applicationFeatures.setLender("ABC");
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest8() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SELF_EMP");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest9() {
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest10() {
        applicationFeatures.setLender("IDFC");

        insertObjects(employmentDetail, applicationRuleResult, applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }

    @Test
    public void givenLenderSupportedEmptyPeRuleTest11() {

        kieSession.insert(applicationRuleResult);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderSupportedEmpTypeDecision());
    }
}
