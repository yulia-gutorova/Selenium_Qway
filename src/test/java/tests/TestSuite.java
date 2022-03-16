package tests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(JUnitPlatform.class)
@SelectClasses({HurMycketFarJagLanaWebbPageTest.class})

public class TestSuite {

    public static void main(String[] args) throws IOException {

    }

}
