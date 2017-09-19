package com.leetcode;

/**
 * @author chengyongjun
 * @date 2017/9/18
 * @time 19:38
 * @description
 */
public class Node {

    protected Node next; //指针域
    public  int data;//数据域

    public Node( int data) {
        this. data = data;
    }

    //显示此节点
    public void display() {
        System. out.print( data + " ");
    }
}
