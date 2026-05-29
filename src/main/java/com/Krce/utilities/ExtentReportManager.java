package com.Krce.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir")
                    + "/reports/TestReport.html";

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter(reportPath);

            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("Ecommerce Test Report");
            sparkReporter.config().setReportName("Automation Test Results");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Project", "Ecommerce-Automation-Framework");
            extent.setSystemInfo("Tester", "Shanawaz");
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }
}