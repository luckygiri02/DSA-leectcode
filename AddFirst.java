public class AddFirst {
    public static void main(String[] args) {
         LinkedList list = new LinkedList();

        
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);

        list.display();

        System.out.println("Add new at first");

        list.addFirst(10);

        list.display();
    }

    public static class Node {
        int data ;
        Node next;
    }

    public static class LinkedList{
        Node head ;
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


        public void addFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next= head;
            head = temp;
            size ++;

            if(size == 0){
                tail = temp;
            }
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
