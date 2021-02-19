package com.oportun;

public class ProgramEligibilityStatus {
    public String isEligible(Payload payload, EligibilityCriteria ec) throws IllegalArgumentException {
        String successResult;
        StringBuffer sb = new StringBuffer();

        if (ec.isCreditScoreEligible(payload)
            & ec.isIncomeEligible(payload)
            & ec.isDebtToIncomeRatioEligible(payload)
            & ec.isCreditRatingEligible(payload)
            & ec.isResidencyStatusEligible(payload)) {
            successResult = "\nStatus: Program Eligible";
            return successResult;
        }

        sb.append("\nStatus: Program ineligible \n");
        for (var reason : ec.inEligibilityReasons.entrySet()) {
            sb.append("Reason: " +reason.getKey() +"\n");
            sb.append("Message: " +reason.getValue() +"\n");
        }
        return sb.toString();
    }
}
