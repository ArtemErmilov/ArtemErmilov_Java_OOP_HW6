package Homework.JAVA_HW12_OOP.Model.ModelMethod;

import Homework.JAVA_HW12_OOP.Model.ModelInterface.InterDiv;

public class MetDiv extends MetSum implements InterDiv {

    public Integer[] getDiv() {

        mRes = mX * nY;
        nRes = nX * mY;

        result[0] = mRes;
        result[1] = nRes;
        return result;
    }
    
}
