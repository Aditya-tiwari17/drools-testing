package de.jonashackt.springdrools;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;
import de.jonashackt.springdrools.internalmodel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static org.junit.Assert.assertEquals;

@DroolsFiles(ruleFiles = {"rules/givenlenderminstatedincome.drl"})
@RunWith(DroolsJUnitRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class GivenLenderMinStatedIncomeTests {
    ApplicationFeatures applicationFeatures = new ApplicationFeatures();
    ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();
    LenderGenericRuleResult lenderGenericRuleResult = new LenderGenericRuleResult();

    @StatefulDroolsSession
    private DroolsSession<?> kieSession;

    private void insertObjects(ApplicationFeatures applicationFeatures,
                               ApplicationRuleResult applicationRuleResult,
                               LenderGenericRuleResult lenderGenericRuleResult) {
        kieSession.insert(applicationFeatures);
        kieSession.insert(applicationRuleResult);
        kieSession.insert(lenderGenericRuleResult);
    }

    @Test
    public void givenLenderMinStatedIncomeTest1() {
        applicationFeatures.setLender("FULLERTON");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("METRO");
        applicationFeatures.setStatedIncome(500);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest2() {
        applicationFeatures.setLender("FULLERTON");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("METRO");
        applicationFeatures.setStatedIncome(20000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest3() {
        applicationFeatures.setLender("FULLERTON");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("NON_METRO");
        applicationFeatures.setStatedIncome(18000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest4() {
        applicationFeatures.setLender("IIFL");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("METRO");
        applicationFeatures.setStatedIncome(15000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest5() {
        applicationFeatures.setLender("IIFL");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("NON_METRO");
        applicationFeatures.setStatedIncome(18000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest6() {
        applicationFeatures.setLender("KSF");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("METRO");
        applicationFeatures.setStatedIncome(20000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest7() {
        applicationFeatures.setLender("KSF");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("NON_METRO");
        applicationFeatures.setStatedIncome(18000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest8() {
        applicationFeatures.setLender("NORTHERN_ARC");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("METRO");
        applicationFeatures.setStatedIncome(20000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest9() {
        applicationFeatures.setLender("NORTHERN_ARC");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("NON_METRO");
        applicationFeatures.setStatedIncome(18000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest10() {
        applicationFeatures.setLender("PAYUFIN");
        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("METRO");
        applicationFeatures.setStatedIncome(20000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest11() {
        applicationFeatures.setLender("PAYUFIN");
        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("NON_METRO");
        applicationFeatures.setStatedIncome(18000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest12() {
        applicationFeatures.setLender("IDFC");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("METRO");
        applicationFeatures.setStatedIncome(18000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest13() {
        applicationFeatures.setLender("IDFC");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("NON_METRO");
        applicationFeatures.setStatedIncome(12000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(false, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest14() {
        applicationFeatures.setStatedIncome(13000);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(true, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }

    @Test
    public void givenLenderMinStatedIncomeTest15() {
        applicationFeatures.setStatedIncome(0);

        insertObjects(applicationFeatures, applicationRuleResult, lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals(true, applicationRuleResult.getGivenLenderMinStatedIncomeRuleDecision());
    }
}
