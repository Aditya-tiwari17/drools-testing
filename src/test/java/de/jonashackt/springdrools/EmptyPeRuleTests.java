package de.jonashackt.springdrools;

import de.jonashackt.springdrools.internalmodel.ApplicationRuleResult;
import de.jonashackt.springdrools.internalmodel.EmploymentDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class EmptyPeRuleTests {
    EmploymentDetail employmentDetail = new EmploymentDetail();
    ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();

    @Autowired
    KieSession kieSession;

    @Test
    public void emptyPeRuleTest1() {
        employmentDetail.setEmployementType("SALARIED");
        FactHandle e = kieSession.insert(employmentDetail);
        FactHandle a = kieSession.insert(applicationRuleResult);

        kieSession.fireAllRules();

        kieSession.delete(e);
        kieSession.delete(a);

        assertEquals(true,applicationRuleResult.getEmpTypeEnabledDecision());
    }

    @Test
    public void emptyPeRuleTest2() {
        employmentDetail.setEmployementType("SELF_EMP");
        FactHandle e = kieSession.insert(employmentDetail);
        FactHandle a = kieSession.insert(applicationRuleResult);

        kieSession.fireAllRules();

        kieSession.delete(e);
        kieSession.delete(a);

        assertEquals(true,applicationRuleResult.getEmpTypeEnabledDecision());
    }

    @Test
    public void emptyPeRuleTest3() {
        employmentDetail.setEmployementType("UNEMPLOYED");
        FactHandle e = kieSession.insert(employmentDetail);
        FactHandle a = kieSession.insert(applicationRuleResult);

        kieSession.fireAllRules();

        kieSession.delete(e);
        kieSession.delete(a);

        assertEquals(false,applicationRuleResult.getEmpTypeEnabledDecision());
    }
}
