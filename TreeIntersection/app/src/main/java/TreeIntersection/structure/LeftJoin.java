package TreeIntersection.structure;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class LeftJoin {
    public LeftJoin() {
    }

    public ArrayList<ArrayList<String>> leftJoin (HashMap<String,String> synonyms, HashMap<String,String> antonyms){

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        if(synonyms.isEmpty())
            return ans ;

        ArrayList<String> e = synonyms.keys();
        for(int i=0 ; i< e.size();i++){
            String key = e.get(i);
            ArrayList <String> element = new ArrayList<>();
            element.add(key);
            element.add(synonyms.get(key));
            element.add(antonyms.get(key));
            ans.add(element);
        }

        return ans ;
    }

}
