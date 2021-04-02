package de.jonashackt.springdrools;

import static org.junit.Assert.*;
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

//@DroolsFiles(value = "agerule.drl", location = "/rules/")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class AgeRuleTests {

	EmploymentDetail employmentDetail = new EmploymentDetail();
	BirthDetail birthDetail = new BirthDetail();
	ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();

	@Autowired
	KieSession kieSession;

	@Test
	public void ageRuleTest1() {
//		EmploymentDetail employmentDetail = new EmploymentDetail();
//		BirthDetail birthDetail = new BirthDetail();
//		ApplicationRuleResult applicationRuleResult = new ApplicationRuleResult();
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(25f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		System.out.println("Before "+applicationRuleResult.getAgeRuleDecision());

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		System.out.println("After "+applicationRuleResult.getAgeRuleDecision());

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest2() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(21f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest3() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(58f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest4() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(59f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest5() {
		employmentDetail.setEmployementType("SALARIED");
		birthDetail.setAge(20f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest6() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(25f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest7() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(35f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest8() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(60f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(true,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest9() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(61f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}

	@Test
	public void ageRuleTest10() {
		employmentDetail.setEmployementType("SELF_EMP");
		birthDetail.setAge(24f);

		FactHandle e = kieSession.insert(employmentDetail);
		FactHandle b = kieSession.insert(birthDetail);
		FactHandle a = kieSession.insert(applicationRuleResult);

		kieSession.fireAllRules();

		kieSession.delete(e);
		kieSession.delete(b);
		kieSession.delete(a);

		assertEquals(false,applicationRuleResult.getAgeRuleDecision());
	}

//	@Test
//	public void contextLoads() {
//		// Given
//	    Address address = new Address();
//	    address.setPostcode("99425");
//	    address.setStreet("Haalstreet");
//	    address.setState("ALBANIA");
//
//	    // When
//	    // Let´s give the Drools Knowledge-Base an Object, we can then apply rules on
//	    kieSession.insert(address);
//		int ruleFiredCount = kieSession.fireAllRules();
//
//
//
//		// Then
//		assertEquals("there´s 1 rule, so there should be 1 fired", 1, ruleFiredCount);
//		LOG.debug("Rules checked: {}" + ruleFiredCount);
//	}

}
