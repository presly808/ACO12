package ua.artcode.recursion.tree_task;

import java.util.Arrays;

/**
 * Created by serhii on 09.04.16.
 */
public class TestCreationTree {

    public static void main(String[] args) {
        TreeNode employee1 = new TreeNode(1000);
        TreeNode employee2 = new TreeNode(1000);
        TreeNode employee3 = new TreeNode(1000);
        TreeNode employee4 = new TreeNode(1000);

        TreeNode manager1 = new TreeNode(200, Arrays.asList(employee1,employee2));
        TreeNode manager2 = new TreeNode(200, Arrays.asList(employee3,employee4));
        TreeNode manager3 = new TreeNode(200, Arrays.asList(new TreeNode(1000)));


        TreeNode director = new TreeNode(1000,
                Arrays.asList(manager1,manager2,manager3));

        int amount = TreeNodeUtils.count(director);
        System.out.println(amount);
    }

}
