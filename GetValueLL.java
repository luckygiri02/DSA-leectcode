public class GetValueLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);

        System.out.println("First node data: " + list.getfirst());

        System.out.println("Last Node data: " + list.getLast());

        int idx = 4;
        System.out.println("Index " + idx + " data: " + list.getIdx(idx));

    }

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
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

        public int getLast() {
            if (size == 0) {
                System.out.println("Empty LinkedList");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getfirst() {
            if (size == 0) {
                System.out.println("Empty LinkedList");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getIdx(int idx) {
            if (size == 0) {
                System.out.println("Empty LinkedList");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invlalid argument");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }
    }

}
