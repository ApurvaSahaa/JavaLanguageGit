package JavaLanguage;

import JavaBasicFeatures.JavaBasicFeaturesMain;
import JavaCollectionFeatures.JavaCollectionFeaturesMain;

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

    // JavaCollectionFeatures methods

    public static String readCollectionOverview1(){
        String collectionOverview1FileName = JavaCollectionFeaturesMain.getCollectionsOverview1FileName();
        return ReadFile.readFileContent(collectionOverview1FileName);
    }

    public static String readCollectionOverview2(){
        String collectionOverview2FileName = JavaCollectionFeaturesMain.getCollectionsOverview1FileName();
        return ReadFile.readFileContent(collectionOverview2FileName);
    }

}
