package nullsafety;

import org.jetbrains.annotations.*;

import java.util.*;

public class Cache {
    private Map<String,String> cache = new HashMap<>();


    public String getValueOrNull(String key){
        return cache.get(key);
    }
    
    public static void main(String[] args)
    {
        Cache cache = new Cache();
        String value = cache.getValueOrNull("ex");

        if(value != null)
        {
            System.out.println(value.length());
        }

        if(Objects.nonNull(value)){
            System.out.println(value.length());
        }

        System.out.println(value.length());

    }
}


