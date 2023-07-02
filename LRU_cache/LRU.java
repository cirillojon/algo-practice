import java.util.Map;
import java.util.HashMap;

public class LRU {
        public static void main(String[] args){
            problem p = new problem(6);
            p.put(5, 8);
            p.put(3,4);
            System.out.println(p.get(5));
            System.out.println(p.map);
        }
    }
    class problem{
            Node head = new Node(0,0);
            Node tail = new Node(0,0);
            Map<Integer, Node> map = new HashMap<>();
            int cap = 0;

            problem(int capacity){
                head.next = tail;
                tail.prev = head;
                cap = capacity;
            }

            public int get(int key){
                if(map.containsKey(key)){
                    Node temp = map.get(key);
                    remove(temp);
                    insert(temp);
                    return temp.val;
                } return -1;
            }

            public void put(int key, int val){  
                if(map.containsKey(key)){
                    remove(map.get(key));
                }
                if(map.size() == cap){
                    remove(tail.prev);
                }
                insert(new Node(key, val));
            }

            public void insert(Node node){
                map.put(node.key, node);
                node.next = head.next;
                node.next.prev = node;
                head.next = node;
                node.prev = head;
            }

            public void remove(Node node){
                map.remove(node.key);
                node.next.prev = node.prev;
                node.prev.next = node.next;
            }
        }

        class Node{
            Node prev, next;
            int key, val;
            Node(int k, int v){
                key = k;
                val = v;
        }
}
