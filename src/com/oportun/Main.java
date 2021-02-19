package com.oportun;

public class Main {
    public static void main(String[] args) {
        var payload = new Payload(800,100_000, 30, "GOOD","UNDOCUMENTED");
        var ec = new EligibilityCriteria();
        var programEligibilityStatus = new ProgramEligibilityStatus();
        var status = programEligibilityStatus.isEligible(payload,ec);
        System.out.println(status);
    }
}
