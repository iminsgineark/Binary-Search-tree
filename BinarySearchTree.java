package com.JAVA_DSA;

public class BinarySearchTree {
    public static class Node{
        int data;
        Node Left;
        Node Right;
        Node(int data){
            this.data = data;
            this.Left = null;
            this.Right = null;
        }
    }
    public static Node Insert(Node root,int Value){
        if (root == null){
            root = new Node(Value);
            return root;
        }

        if (root.data > Value){
            root.Left = Insert(root.Left,Value);
        }

       else if (root.data < Value){
            root.Right = Insert(root.Right, Value);
        }
       return root;
    }
    public static void Inorder(Node root){
        if (root == null){
            return;
        }
        Inorder(root.Left);
        System.out.println(root.data + " ");
        Inorder(root.Right);
    }
    public static void PreOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println();
        PreOrder(root.Left);
        PreOrder(root.Right);
    }
    public static boolean Search(Node root,int key){
        if (root == null) {
            return false;
        }
        else if (root.data > key){
            return Search(root.Left, key);
        }
        else if (root.data == key){
            return true;
        }
        else {
            return Search(root.Right,key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {423,414,524,856,121,429,978,2113};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = Insert(root,arr[i]);
        }
        Inorder(root);
        System.out.println();
        if (Search(root,524){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found!!!");
        }
    }
}
