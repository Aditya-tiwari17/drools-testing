package de.jonashackt.springdrools;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;
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

@DroolsFiles(ruleFiles = {"rules/emptyperule.drl"})
@RunWith(DroolsJUnitRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class EmptyPeRuleTests {
    EmploymentDetail employmentDetail = new EmploymentDetail();
    ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();

    @StatefulDroolsSession
    private DroolsSession<?> kieSession;

    private void insertObjects(EmploymentDetail employmentDetail,
                               ApplicationRuleResult applicationRuleResult) {
        kieSession.insert(employmentDetail);
        kieSession.insert(applicationRuleResult);
    }

    @Test
    public void emptyPeRuleTest1() {
        employmentDetail.setEmployementType("SALARIED");

        insertObjects(employmentDetail,applicationRuleResult);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getEmpTypeEnabledDecision());
    }

    @Test
    public void emptyPeRuleTest2() {
        employmentDetail.setEmployementType("SELF_EMP");

        insertObjects(employmentDetail,applicationRuleResult);

        kieSession.fireAllRules();

        assertEquals(true,applicationRuleResult.getEmpTypeEnabledDecision());
    }

    @Test
    public void emptyPeRuleTest3() {
        employmentDetail.setEmployementType("UNEMPLOYED");

        insertObjects(employmentDetail,applicationRuleResult);

        kieSession.fireAllRules();

        assertEquals(false,applicationRuleResult.getEmpTypeEnabledDecision());
    }
}