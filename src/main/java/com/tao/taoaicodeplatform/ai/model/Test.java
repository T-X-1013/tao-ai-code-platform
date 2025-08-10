package com.tao.taoaicodeplatform.ai.model;

import java.util.*;


/**
 * 	根据一棵树的前序遍历与中序遍历返回其后续遍历
 *
 * 	注意:你可以假设树中没有重复的元素。
 *
 * 	例如，给出
 *
 * 	前序遍历 preorder = [3,9,20,15,7]
 * 	中序遍历 inorder = [9,3,15,20,7]
 * 输出 output=[9,15,7,20,3]
 */

public class Test {

    static Map<Integer,Integer> map = new HashMap<Integer,Integer>();


    public static TreeNode travel(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBegin, int inEnd) {
        if(preBegin >= preEnd || inBegin >= inEnd) {
            return null;
        }

        int rootIndex = map.get(preorder[preBegin]);
        int len = rootIndex - inBegin;
        TreeNode root = new TreeNode(inorder[rootIndex]);
        root.left = travel(preorder,preBegin+1,preBegin+1+len,inorder,inBegin,rootIndex);
        root.right = travel(preorder,preBegin+1+len,preEnd,inorder,rootIndex+1,inEnd);
        return root;
    }

    public static void out(TreeNode root, List<Integer> list) {
        if(root==null) {
            return;
        }

        out(root.left,list);
        out(root.right,list);
        list.add(root.val);
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        for(int i=0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }
        TreeNode root = travel(preorder,0,preorder.length,inorder,0,inorder.length);

        List<Integer> list = new ArrayList<>();
        out(root,list);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {};
    TreeNode(int val) {
        this.val = val;
    };
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    };
}