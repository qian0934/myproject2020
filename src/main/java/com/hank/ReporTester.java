package com.hank;

import java.util.ArrayList;
import java.util.List;

public class ReporTester {
    public static void main(String[] args) {
        Report financereport = new FinanceReport();
        Report healthreport = new HealthReport();
        List<Report> reports = new ArrayList<>();
        reports.add(financereport);
        reports.add(healthreport);
        for(Report report : reports){
            report.load();
            report.print();
        }
    }
}
