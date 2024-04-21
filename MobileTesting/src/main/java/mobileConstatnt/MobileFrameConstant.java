package mobileConstatnt;



import mobileUtils.MobilePropertyUtils;

public class MobileFrameConstant {
	private MobileFrameConstant() {

	}

	private static final String RESOURCESPATH = System.getProperty("user.dir");
	private static final String ANDROID_APPLICATION_PATH = RESOURCESPATH + "/src/test/resources/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "/src/test/resources/config/config.properties";
	private static final String EXCELFILEPATH = RESOURCESPATH + "/src/test/resources/excelFiles/MobileTestData.xlsx";
	private static final String JSONFILEPATH = RESOURCESPATH + "/src/test/resources/jsonFile/desireCapability.json";
	private static final String EXTENTREPORTFOLDERPATH = RESOURCESPATH + "/extent-test-output";
	private static  String extentReportFilePath = "";
	private static final String RUNMANAGERSHEET="Sheet1";
	private static final String ITERATIONDATASHEET="Data";

	public static String getExtentReportFilePath() throws Exception {
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath=createReportPath();
			
		}
		return extentReportFilePath;
	}
	private static String createReportPath() throws Exception {
		if(MobilePropertyUtils.get(MobileEnums.ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
		}
		else {
			return EXTENTREPORTFOLDERPATH+"/index.html";
		}
	}

	public static String getAndroidApplication() {
		return ANDROID_APPLICATION_PATH;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

	public static String excelFilePath() {
		return EXCELFILEPATH;
	}

	public static String jsonFilePath() {
		return JSONFILEPATH;
	}
	
	public static String runManagerSheet() {
		return RUNMANAGERSHEET;
	}
	public static String iterationSheet() {
		return ITERATIONDATASHEET;
	}

	/*public static String extentReportPath() throws Exception {
		if (PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
			return EXTENTREPORTPATH + "/" + System.currentTimeMillis() + "/index.html";
		}
		else {
			return EXTENTREPORTPATH+"/index.html";
			
		}
		
	}*/


}
