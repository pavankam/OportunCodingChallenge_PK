package com.oportun;

public class Payload {
    private int creditScore;
    private float income;
    private float debtToIncomeRatio;
    private String creditRating;
    private String residencyStatus;


    public Payload(int creditScore, float income, float debtToIncomeRatio,
                   String creditRating, String residencyStatus) {
        this.creditScore = creditScore;
        this.income = income;
        this.debtToIncomeRatio = debtToIncomeRatio;
        this.creditRating = creditRating;
        this.residencyStatus = residencyStatus;
    }

    public int getCreditScore() {
        if (creditScore < 300 || creditScore > 850 )
            throw new IllegalArgumentException("Enter a valid credit score between 300 and 850");
        return creditScore;
    }

    public double getIncome() {
        if (income < 0)
            throw new IllegalArgumentException("Enter a valid income greater than or equal to 0");
        return income;
    }

    public float getDebtToIncomeRatio() {
        if (debtToIncomeRatio < 0)
            throw new IllegalArgumentException("Enter a valid debt-to-income ratio greater than or equal to 0");
        return debtToIncomeRatio;
    }

    public String getCreditRating() {
        if (creditRating == null)
            throw new IllegalArgumentException("Enter a valid credit rating");
        return creditRating;
    }

    public String getResidencyStatus() {
        if (residencyStatus == null)
            throw new IllegalArgumentException("Enter a valid residency status");
        return residencyStatus;
    }
}

