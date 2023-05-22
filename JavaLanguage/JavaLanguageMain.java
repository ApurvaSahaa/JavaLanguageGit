package JavaLanguage;

import JavaBasicFeatures.JavaBasicFeaturesMain;

public class JavaLanguageMain {

    public static String start(){
        return "We will be learning more about the Java Language.";
    }

    // JavaBasicFeatures methods

    public static String readJvmStructure(){
        String jvmFileName = JavaBasicFeaturesMain.getJvmStructureFileName();
        return ReadFile.readFileContent(jvmFileName);
    }

    public static String readOopFeatures(){
        String oopFileName = JavaBasicFeaturesMain.getOopFileName();
        return ReadFile.readFileContent(oopFileName);
    }


}
