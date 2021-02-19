package com.oportun;

import java.util.HashMap;
import java.util.Map;

public class EligibilityCriteria {
    Map<String, String> inEligibilityReasons = new HashMap<>();

    public boolean isCreditScoreEligible(Payload payload) {
        if (payload.getCreditScore() < 600) {
            inEligibilityReasons.put("Poor Credit Score", "Credit Score is less than 600");
            return false;
        }
        return true;
    }

    public boolean isIncomeEligible(Payload payload) {
        if (payload.getIncome() < 10_000) {
            inEligibilityReasons.put("Low income", "Income less than 10,000");
            return false;
        }
        return true;
    }

    public boolean isDebtToIncomeRatioEligible(Payload payload) {
        if (payload.getDebtToIncomeRatio() > 80) {
            inEligibilityReasons.put("High Debt", "Debt-to-Income Ratio greater than 80");
            return false;
        }
        return true;
    }

    public boolean isCreditRatingEligible (Payload payload) {
        if (payload.getCreditRating().equalsIgnoreCase("BAD")) {
            inEligibilityReasons.put("Bad Credit Rating","Credit Rating classified as BAD");
            return false;
        }
        return true;
    }

    public boolean isResidencyStatusEligible (Payload payload) {
        if (payload.getResidencyStatus().equalsIgnoreCase("UNDOCUMENTED")) {
            inEligibilityReasons.put("Ineligible Residency", "Undocumented residency status");
            return false;
        }
        return true;
    }
}
