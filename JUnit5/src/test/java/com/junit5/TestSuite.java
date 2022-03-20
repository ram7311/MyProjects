package com.junit5;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite //if we run this class, Entire classes inside of the @SelectPackages will be executed 
@SuiteDisplayName(value = "TEST Suites")
@SelectPackages("com.junit5.testcases")// Alert : it will detect Test classes based on the name, class name must contain "Test" ex: MyTest
public class TestSuite {

}
