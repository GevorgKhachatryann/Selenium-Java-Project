package Selectors;

import java.util.HashMap;

public class Selectors {

    public HashMap<String,String> selectors = new HashMap<>();

    public Selectors(){
        selectors.put("Elements","[class=\"card mt-4 top-card\"]:nth-child(1)");
        selectors.put("Elements page","elements");
        selectors.put("","");


    }

}
