public class AddIndex {
    public static void main(String[] args) {
         LinkedList list = new LinkedList();

        
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);

        list.addIndex(4,55);

        list.display();


    }

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;

        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public void addIndex(int idx , int val){
            Node node = new Node();
            node.data = val;

            Node temp = head;

            for(int i = 0 ; i<idx-1; i++){
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;

            size ++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            
            System.out.println("null");

            System.out.println( "Size of LinkedList : "+ size);
        }
    }
    
}
