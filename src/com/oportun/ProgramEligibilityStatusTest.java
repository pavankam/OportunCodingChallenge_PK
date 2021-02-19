package com.oportun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramEligibilityStatusTest {
    @Test
    public void testHighCreditScore() {
        var payload = new Payload(800,100_000, 30, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program Eligible", actualResult);
    }

    @Test
    public void testLowButValidCreditScore() {
        var payload = new Payload(500,100_000, 30, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program ineligible \n" +
                     "Reason: Poor Credit Score\n" +
                     "Message: Credit Score is less than 600\n", actualResult);
    }

    @Test
    public void testHighIncome() {
        var payload = new Payload(800,100_000, 30, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program Eligible", actualResult);
    }

    @Test
    public void testLowButValidIncome() {
        var payload = new Payload(800,9_000, 30, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program ineligible \n" +
                     "Reason: Low income\n" +
                     "Message: Income less than 10,000\n", actualResult);
    }

    @Test
    public void testLowDebtToIncomeRatio() {
        var payload = new Payload(800,100_000, 30, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program Eligible", actualResult);
    }

    @Test
    public void testHighDebtToIncomeRatio() {
        var payload = new Payload(800,100_000, 90, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program ineligible \n" +
                     "Reason: High Debt\n" +
                     "Message: Debt-to-Income Ratio greater than 80\n", actualResult);
    }

    @Test
    public void testGoodCreditRating() {
        var payload = new Payload(800,100_000, 30, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program Eligible", actualResult);
    }

    @Test
    public void testBadCreditRating() {
        var payload = new Payload(800,100_000, 30, "BAD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program ineligible \n" +
                     "Reason: Bad Credit Rating\n" +
                     "Message: Credit Rating classified as BAD\n", actualResult);
    }

    @Test
    public void testEligibleResidency() {
        var payload = new Payload(800,100_000, 30, "GOOD","CITIZEN");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program Eligible", actualResult);
    }

    @Test
    public void testIneligibleResidency() {
        var payload = new Payload(800,100_000, 30, "GOOD","UNDOCUMENTED");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        String actualResult = programEligibilityStatus.isEligible(payload,ec);
        assertEquals("\nStatus: Program ineligible \n" +
                     "Reason: Ineligible Residency\n" +
                     "Message: Undocumented residency status\n", actualResult);
    }
}

