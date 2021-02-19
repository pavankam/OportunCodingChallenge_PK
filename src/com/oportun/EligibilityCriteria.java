package com.oportun;

import java.util.HashMap;
import java.util.Map;

public class EligibilityCriteria {
    Map<String, String> inEligibilityReasons = new HashMap<>();
    final int MIN_CREDIT_SCORE = 600;
    final float MIN_ANNUAL_INCOME = 10_000;
    final float MAX_DEBT_TO_INCOME = 80;
    final String BAD_CREDIT_RATING = "BAD";
    final String UNDOCUMENTED_RESIDENCY = "UNDOCUMENTED";


    public boolean isCreditScoreEligible(Payload payload) {
        if (payload.getCreditScore() < MIN_CREDIT_SCORE) {
            inEligibilityReasons.put("Poor Credit Score", "Credit Score is less than 600");
            return false;
        }
        return true;
    }

    public boolean isIncomeEligible(Payload payload) {
        if (payload.getIncome() < MIN_ANNUAL_INCOME) {
            inEligibilityReasons.put("Low income", "Income less than 10,000");
            return false;
        }
        return true;
    }

    public boolean isDebtToIncomeRatioEligible(Payload payload) {
        if (payload.getDebtToIncomeRatio() > MAX_DEBT_TO_INCOME) {
            inEligibilityReasons.put("High Debt", "Debt-to-Income Ratio greater than 80");
            return false;
        }
        return true;
    }

    public boolean isCreditRatingEligible (Payload payload) {
        if (payload.getCreditRating().equalsIgnoreCase(BAD_CREDIT_RATING)) {
            inEligibilityReasons.put("Bad Credit Rating","Credit Rating classified as BAD");
            return false;
        }
        return true;
    }

    public boolean isResidencyStatusEligible (Payload payload) {
        if (payload.getResidencyStatus().equalsIgnoreCase(UNDOCUMENTED_RESIDENCY)) {
            inEligibilityReasons.put("Ineligible Residency", "Undocumented residency status");
            return false;
        }
        return true;
    }
}
