package de.jonashackt.springdrools;

import com.github.jeichler.junit.drools.DroolsJUnitRunner;
import com.github.jeichler.junit.drools.annotation.DroolsFiles;
import com.github.jeichler.junit.drools.annotation.StatefulDroolsSession;
import com.github.jeichler.junit.drools.session.DroolsSession;
import de.jonashackt.springdrools.internalmodel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

@DroolsFiles(ruleFiles = {"rules/metrodefinitionrule.drl"})
@RunWith(DroolsJUnitRunner.class)
@SpringApplicationConfiguration(classes = SpringdroolsApplication.class)
public class MetroDefinitionRuleTests {
    AddressDetail addressDetail = new AddressDetail();
    LenderGenericRuleResult lenderGenericRuleResult = new LenderGenericRuleResult();

    @StatefulDroolsSession
    private DroolsSession<?> kieSession;

    List<String> cities1 = new ArrayList<>(
            Arrays.asList("new delhi", "delhi", "gurgaon", "gurugram", "noida", "greater noida", "ghaziabad", "faridabad", "mumbai", "navi mumbai", "thane"));

    List<String> cities2 = new ArrayList<>(
            Arrays.asList("bengaluru", "bangalore", "new delhi", "delhi", "mumbai", "navi mumbai", "hyderabad", "secunderabad", "chennai", "kolkata", "thane", "gurgaon", "gurugram", "noida", "greater noida", "ghaziabad", "faridabad"));

    Random rand = new Random();

    private void insertObjects(AddressDetail addressDetail ,
                               LenderGenericRuleResult lenderGenericRuleResult) {
        kieSession.insert(addressDetail);
        kieSession.insert(lenderGenericRuleResult);
    }

    @Test
    public void MetroDefinitionRuleTest1() {

        String city = cities1.get(rand.nextInt(cities1.size()));
        System.out.println(city);

        addressDetail.setCity(city);

        lenderGenericRuleResult.setFicclMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("METRO",lenderGenericRuleResult.getPayuFinMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest2() {
        addressDetail.setCity("jaipur");

        lenderGenericRuleResult.setFicclMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("NON_METRO",lenderGenericRuleResult.getPayuFinMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest3() {

        String city = cities1.get(rand.nextInt(cities1.size()));
        System.out.println(city);

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        addressDetail.setCity(city);

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("METRO",lenderGenericRuleResult.getFicclMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest4() {
        addressDetail.setCity("jaipur");

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("NON_METRO",lenderGenericRuleResult.getFicclMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest5() {

        String city = cities1.get(rand.nextInt(cities1.size()));
        System.out.println(city);

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("");

        addressDetail.setCity(city);

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("METRO",lenderGenericRuleResult.getIfflMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest6() {
        addressDetail.setCity("jaipur");

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("NON_METRO",lenderGenericRuleResult.getIfflMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest7() {

        String city = cities1.get(rand.nextInt(cities1.size()));
        System.out.println(city);

        addressDetail.setCity(city);

        lenderGenericRuleResult.setFicclMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("METRO",lenderGenericRuleResult.getKsfMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest8() {
        addressDetail.setCity("jaipur");

        lenderGenericRuleResult.setFicclMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("NON_METRO",lenderGenericRuleResult.getKsfMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest9() {

        String city = cities2.get(rand.nextInt(cities1.size()));
        System.out.println(city);

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        addressDetail.setCity(city);

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("METRO",lenderGenericRuleResult.getNarcMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest10() {
        addressDetail.setCity("jaipur");

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIdfcMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("NON_METRO",lenderGenericRuleResult.getNarcMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest11() {

        String city = cities1.get(rand.nextInt(cities1.size()));
        System.out.println(city);

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("");

        addressDetail.setCity(city);

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("METRO",lenderGenericRuleResult.getIdfcMetroRuleDefinition());
    }

    @Test
    public void MetroDefinitionRuleTest12() {
        addressDetail.setCity("jaipur");

        lenderGenericRuleResult.setPayuFinMetroRuleDefinition("");
        lenderGenericRuleResult.setIfflMetroRuleDefinition("");
        lenderGenericRuleResult.setKsfMetroRuleDefinition("");
        lenderGenericRuleResult.setNarcMetroRuleDefinition("");
        lenderGenericRuleResult.setFicclMetroRuleDefinition("");

        insertObjects(addressDetail,lenderGenericRuleResult);

        kieSession.fireAllRules();

        assertEquals("NON_METRO",lenderGenericRuleResult.getIdfcMetroRuleDefinition());
    }
}
