package flyweight.refactor_guru.trees;

import java.awt.*;
import java.util.HashMap;

public class TreeFactory {
    static HashMap<String,TreeType> treeTypeHashMap=new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherData){
        TreeType treeType=treeTypeHashMap.get(name);
        if(treeType==null){
            treeType=new TreeType(name,color,otherData);
            treeTypeHashMap.put(name,treeType);
        }
        return treeType;
    }
}
