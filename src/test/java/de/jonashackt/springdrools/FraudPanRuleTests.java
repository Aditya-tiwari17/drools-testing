package de.jonashackt.springdrools;

import de.jonashackt.springdrools.internalmodel.ApplicationFeatures;
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
public class FraudPanRuleTests {
    EmploymentDetail employmentDetail = new EmploymentDetail();
    ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();
    ApplicationFeatures applicationFeatures = new ApplicationFeatures();

    @Autowired
    KieSession kieSession;

    @Test
    public void FraudPanRuleTest1() {
        employmentDetail.setEmployementType("SALARIED");
        FactHandle ed = kieSession.insert(employmentDetail);
        FactHandle arr = kieSession.insert(applicationRuleResult);
        FactHandle af = kieSession.insert(applicationFeatures);

        kieSession.fireAllRules();

        kieSession.delete(ed);
        kieSession.delete(arr);

        assertEquals(true,applicationRuleResult.getEmpTypeEnabledDecision());
    }
}
