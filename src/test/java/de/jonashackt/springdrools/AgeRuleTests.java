package de.jonashackt.springdrools;

import static org.junit.Assert.*;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;
import de.jonashackt.springdrools.internalmodel.ApplicationRuleResult;
import de.jonashackt.springdrools.internalmodel.BirthDetail;
import de.jonashackt.springdrools.internalmodel.EmploymentDetail;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@DroolsFiles(ruleFiles = {"rules/agerule.drl"})
@RunWith(DroolsJUnitRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class AgeRuleTests {

	EmploymentDetail employmentDetail = new EmploymentDetail();
	BirthDetail birthDetail = new BirthDetail();
	ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();

	@StatefulDroolsSession
	private DroolsSession<?> kieSession;

	private void insertObjects(EmploymentDetail employmentDetail,
							   BirthDetail birthDetail,
							   ApplicationRuleResult applicationRuleResult) {
		kieSession.insert(employmentDetail);
		kieSession.insert(birthDetail);
		kieSession.insert(applicationRuleResult);
	}

	@Test
	public void ageRuleTest1() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(25f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest2() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(21f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest3() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(58f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest4() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(59f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest5() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(20f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest6() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(25f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest7() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(35f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest8() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(60f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest9() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(61f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest10() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(24f);

		insertObjects(employmentDetail,birthDetail,applicationRuleResult);

		kieSession.fireAllRules();

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}
}
