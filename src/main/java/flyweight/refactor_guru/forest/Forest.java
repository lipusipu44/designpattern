package flyweight.refactor_guru.forest;

import flyweight.refactor_guru.trees.Tree;
import flyweight.refactor_guru.trees.TreeFactory;
import flyweight.refactor_guru.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> treeList=new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherData){
        TreeType treeType= TreeFactory.getTreeType(name,color,otherData);
        Tree tree=new Tree(x,y,treeType);
        treeList.add(tree);
    }

    @Override
    public void paint(Graphics g) {
        for (Tree tree:
             treeList) {
            tree.draw(g);
        }
    }
}
