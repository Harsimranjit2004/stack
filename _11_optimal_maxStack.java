package Stack;
import java.Util.*;

public class _11_optimal_maxStack{
    public class MaxStack{
        private static class Node{
            int data;
            Node pre;
            Node next;
            Node(int x){
                data  = x;
            }
        }
        final private Node head;
        final private Node tail;
        private TreeMap<Integer , ArrayList<Node>> map;
        private Node addTop(int x ){
            Node temp = new Node(x);
            Node pre = tail.pre;
            temp.next = tail;
            tail.pre = temp;

            temp.pre  = pre;
            pre.next = temp;
            return temp;
        }
        private Node getTop(){
            return tail.pre;
        }
        private void remove(Node temp){
            Node next = temp.next;
            Node pre = temp.pre ; 
            pre.next = next;
            next.pre = pre;
        }
        public MaxStack(){
            tmap = new TreeMap<>();
            head = new Node(-1);
            tail = new Node(-1);
            head.next = tail;
            tail.pre = head;
        }
        public void push(int x){
           Node temp =  addTop(x);
           ArrayList<Node> al = new ArrayList<>();
           if(tmap.containkey(x)){
                al = tmap.get(x);
           }else{
            tmap.put(x,al);
           }
           al.add(temp);
        }
        public int pop(){
            Node high = getTop();
            ArrayList<Node> al = tmap.get(high.data);
            al.remove(al.size()-1);
            if(al.size() == 0){
                tmap.remove(high.data);
            }
            return high.data;
        }
        public int top(){
            Node high = getTop();
            return high.data;
        }
        public int peekMax(){
            int x = tmap.laskey();
            return x;
        }
        public int popMax(){
            int x = tmap.laskey();
            ArrayList<Node> al = tmap.get(x);
            Node temp = al.remove(al.size()-1);
            remove(temp);
            if(al.size() == 0){
                tmap.remove(x);
            }
            return x;
        }
    }
}