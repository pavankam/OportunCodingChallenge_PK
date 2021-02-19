# OportunCodingChallenge_PK

Problem statement: 
-------------------

Find program eligibility for an applicant based on a given criteria and show the status. 
Incase the applicant is ineligible for the program, show the reason and associated message which triggered their ineligibility.
If there are multiple reasons for ineligibility, show all the reasons

Eligibility Criteria:
---------------------

An applicant is assessed based on five conditions:
  1. Credit Score should be greater than 600
  2. Annual income should be greater than 10,000
  3. Debt-to-Income ratio should be less than 80%
  4. Credit rating should not be POOR
  5. Residency status shouldn't be UNDOCUMENTED
  
**Success Scenario:** Any candidate who satisfies all these conditions is eligible for the program 
Output:
Status: Program Eligible


Any candidate who doesn't satisfy atleast one of these conditions is not eligible for the program

**Failure Scenario-1:** Poor, but valid credit score 
Output: 
Status: Program ineligible 
Reason: Poor Credit Score
Message: Credit Score is less than 600

**Failure Scenario-2:** Annual income valid but lower than 10,000
Output: 
Status: Program ineligible 
Reason: Low income
Message: Income less than 10,000

**Failure Scenario-3:** High Debt-to-Income ratio
Output: 
Status: Program ineligible 
Reason: High Debt
Message: Debt-to-Income Ratio greater than 80

**Failure Scenario-4:** Credit rating is BAD
Output: 
Status: Program ineligible 
Reason: Bad Credit Rating
Message: Credit Rating classified as BAD

**Failure Scenario-5:** Ineligible residency status
Output:
Status: Program ineligible 
Reason: Ineligible Residency
Message: Undocumented residency status

**Failure Scenario-6:** All or some of the eligibility criteria are not fulfilled
Output: multiple reasons modeled. For example:
Status: Program ineligible 
Reason: Ineligible Residency
Message: Undocumented residency status
Reason: High Debt
Message: Debt-to-Income Ratio greater than 80
Reason: Poor Credit Score
Message: Credit Score is less than 600



**Test cases:** 
Total 10 test cases --> All passed (screenshot attached)


  
