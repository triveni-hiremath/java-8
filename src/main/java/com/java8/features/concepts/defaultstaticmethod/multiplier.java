package com.java8.features.concepts.defaultstaticmethod;

import java.util.List;

public interface multiplier {
    int multiply(List<Integer>toList);
    default int sizeInput(List<Integer>lst)
    {

return lst.size();
    }
    static boolean isEmpty(List<Integer>intList)
    {
return intList!=null && intList.size()>0;
    }
}
