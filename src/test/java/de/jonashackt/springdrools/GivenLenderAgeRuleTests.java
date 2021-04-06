package de.jonashackt.springdrools;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;
import de.jonashackt.springdrools.internalmodel.ApplicationFeatures;
import de.jonashackt.springdrools.internalmodel.ApplicationRuleResult;
import de.jonashackt.springdrools.internalmodel.BirthDetail;
import de.jonashackt.springdrools.internalmodel.EmploymentDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static org.junit.Assert.assertEquals;

@DroolsFiles(ruleFiles = {"rules/givenlenderagerule.drl"})
@RunWith(DroolsJUnitRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class GivenLenderAgeRuleTests {
    EmploymentDetail employmentDetail = new EmploymentDetail();
    BirthDetail birthDetail = new BirthDetail();
    ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();
    ApplicationFeatures applicationFeatures = new ApplicationFeatures();

    @StatefulDroolsSession
    private DroolsSession<?> kieSession;

    private void insertObjects(EmploymentDetail employmentDetail,
                               BirthDetail birthDetail,
                               ApplicationRuleResult applicationRuleResult,
                               ApplicationFeatures applicationFeatures) {
        kieSession.insert(employmentDetail);
        kieSession.insert(birthDetail);
        kieSession.insert(applicationRuleResult);
        kieSession.insert(applicationFeatures);
    }

    @Test
    public void givenLenderAgeRuleTest1() {
        applicationFeatures.setLender("FULLERTON");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(21f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest2() {
        applicationFeatures.setLender("FULLERTON");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(35f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest3() {
        applicationFeatures.setLender("FULLERTON");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(55f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest4() {
        applicationFeatures.setLender("FULLERTON");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(25f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest5() {
        applicationFeatures.setLender("FULLERTON");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(38f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest6() {
        applicationFeatures.setLender("FULLERTON");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(55f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest7() {
        applicationFeatures.setLender("IIFL");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(21f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest8() {
        applicationFeatures.setLender("IIFL");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(32f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest9() {
        applicationFeatures.setLender("IIFL");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(56f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest10() {
        applicationFeatures.setLender("KSF");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(21f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest11() {
        applicationFeatures.setLender("KSF");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(32f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest12() {
        applicationFeatures.setLender("KSF");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(57f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest13() {
        applicationFeatures.setLender("KSF");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(25f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest14() {
        applicationFeatures.setLender("KSF");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(46f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest15() {
        applicationFeatures.setLender("KSF");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(60f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest16() {
        applicationFeatures.setLender("NORTHERN_ARC");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(21f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest17() {
        applicationFeatures.setLender("NORTHERN_ARC");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(35f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest18() {
        applicationFeatures.setLender("NORTHERN_ARC");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(58f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest19() {
        applicationFeatures.setLender("PAYUFIN");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(21f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest20() {
        applicationFeatures.setLender("PAYUFIN");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(35f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest21() {
        applicationFeatures.setLender("PAYUFIN");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(55f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest22() {
        applicationFeatures.setLender("PAYUFIN");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(25f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest23() {
        applicationFeatures.setLender("PAYUFIN");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(50f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest24() {
        applicationFeatures.setLender("PAYUFIN");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(55f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest25() {
        birthDetail.setAge(5f);

        kieSession.insert(birthDetail);
        kieSession.insert(applicationRuleResult);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest26() {
        birthDetail.setAge(26f);

        kieSession.insert(birthDetail);
        kieSession.insert(applicationRuleResult);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest27() {
        birthDetail.setAge(145f);

        kieSession.insert(birthDetail);
        kieSession.insert(applicationRuleResult);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest28() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(23f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest29() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(37f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest30() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SALARIED");
        birthDetail.setAge(55f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest31() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(25f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest32() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(43f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }

    @Test
    public void givenLenderAgeRuleTest33() {
        applicationFeatures.setLender("IDFC");
        employmentDetail.setEmployementType("SELF_EMP");
        birthDetail.setAge(55f);

        insertObjects(employmentDetail,birthDetail,applicationRuleResult,applicationFeatures);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getGivenLenderAgeRuleDecision());
    }
}
