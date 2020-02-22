package com.ios;

public class Sample31 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(new Node("A"));
        ll.add(new Node("B"));
        ll.add(new Node("C"));
        ll.add(new Node("D"));
        ll.add(new Node("E"));
        System.out.println(ll.getNthNodeFromLast(3));
    }
}

class LinkedList {

    private Node rootNode;
    public LinkedList(Node node) {
        this.rootNode = node;
    }

    public void add(Node node) {
        addNode(rootNode, node);
    }

    private void addNode(Node parent, Node node) {
        if (parent.getLink() == null) {
            parent.setLink(node);
        } else {
            addNode(parent.getLink(), node);
        }


    }

    public Node getNthNodeFromLast(int n) {
        Node n1 = rootNode;
        Node n2 = null;
        for (int i = 0; i < n-1; i++) {
            n1 = n1.getLink();
        }
        n2 = rootNode;
        while (true) {
            if (n1.getLink() == null) {
                break;
            }
            n1 = n1.getLink();
            n2 = n2.getLink();
        }

        return n2;
    }
}

class Node {

    private String value;

    private Node link;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", link=" + link +
                '}';
    }
}
