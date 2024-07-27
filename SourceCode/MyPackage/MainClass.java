package SourceCode.MyPackage;

import SourceCode.Utility.MathsClass;
import SourceCode.Utility.StringClass;

public class MainClass{
    public static void main(String[] args) {
        int num = 20; 
        int num2 = 10; 
        String name1 = "Chandra Sreas";
        String name2 = "Gop";

        MathsClass.addition(num, num2);
        MathsClass.subtration(num, num2);
        MathsClass.multiplication(num, num2);
        MathsClass.division(num, num2);

        StringClass.concat(name1, name2);
    }
}