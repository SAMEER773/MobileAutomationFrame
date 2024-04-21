package mobileListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import mobileDataProvider.MobileDataProvider;

public class MobileAnnotationTransfer implements IAnnotationTransformer {
	@Override
	public void transform(ITestAnnotation annotation, @SuppressWarnings("rawtypes") Class testClass,
			@SuppressWarnings("rawtypes") Constructor testConstructor, Method testMethod) {
		annotation.setDataProvider("getData");
		annotation.setDataProviderClass(MobileDataProvider.class);
		// annotation.setRetryAnalyzer(RateShopperRetry.class);
		annotation.getAlwaysRun();

	}

}
