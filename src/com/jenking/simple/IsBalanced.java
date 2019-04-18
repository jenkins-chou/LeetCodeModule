package com.jenking.simple;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 */
public class IsBalanced {
    private boolean isBalance=true;
    public boolean isBalanced(IsSameTree.TreeNode root) {
        depth(root,isBalance);
        return isBalance;
    }
    public int depth(IsSameTree.TreeNode root, boolean isBanlance){
        if(root==null||isBalance==false)
            return 0;
        int hl=depth(root.left,isBalance);
        if(isBalance==true){
            int hr=depth(root.right,isBalance);
            if(isBalance){
                isBalance=Math.abs(hl-hr)<=1;
                return Math.max(hr,hl)+1;
            }
        }
        return 0;
    }
}
