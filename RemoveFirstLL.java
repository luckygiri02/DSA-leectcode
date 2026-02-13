public class RemoveFirstLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.display();

        list.removeFirst();
        System.out.println("After remove of Firts node");
        list.display();
    }

    public static class Node{
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

        void removeFirst(){
            if(size == 0){
                System.out.println("List is empty");
            }else if(size == 1){
                head = tail = null;
                size =0;
            }else{
                head = head.next;
                size --;
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
