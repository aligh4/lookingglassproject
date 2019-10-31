package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class ReportManager {

    private ReportManager(){   }

    static private ExtentReports extentReports;
    static private String reportName = "LookingGlass Cyber Test Report" + ".html";
    static private String reportLocation = System.getProperty("user.dir" + "\\src\\main\\reports\\");

    static public ExtentReports getReportCreator() {
        if(extentReports == null){
            String fileName= reportLocation + reportName;
            ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(fileName);
            extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
            extentHtmlReporter.config().setDocumentTitle("LookingGlass Cyber Report");
            extentHtmlReporter.config().setReportName(fileName);

            extentReports = new ExtentReports();
            extentReports.attachReporter(extentHtmlReporter);
            return extentReports;

        }
        else{
            return extentReports;
        }
    }




    }

