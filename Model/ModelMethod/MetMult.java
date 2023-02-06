package Homework.JAVA_HW12_OOP.Model.ModelMethod;

import Homework.JAVA_HW12_OOP.Model.ModelInterface.InterMult;

public class MetMult extends MetSum implements InterMult {

    

    public Integer[] getMult() {

 
        mRes = mX * mY;
        nRes = nX * nY;

        result[0] = mRes;
        result[1] = nRes;
        return result;
    }
    
}
