package ua.artcode.recursion.tree_task;

import java.util.List;

/**
 * Created by serhii on 09.04.16.
 */
public class TreeNode {

    public int amount;
    public List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(int amount){
        this.amount = amount;
    }

    public TreeNode(int amount, List<TreeNode> children) {
        this.amount = amount;
        this.children = children;
    }

}
