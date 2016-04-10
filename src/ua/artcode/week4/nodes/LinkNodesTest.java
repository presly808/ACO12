package ua.artcode.week4.nodes;

import ua.artcode.data_structure.dynamic.Node;
import ua.artcode.utils.ds.NodeUtils;
import ua.artcode.utils.time.ITimeAction;
import ua.artcode.utils.time.TimeCounter;

/**
 * Created by serhii on 10.04.16.
 */
public class LinkNodesTest {

    public static void main(String[] args) {
        test1();

        test2();

        test3();


        test4();

        final Node head = NodeUtils.createChain(1000);

        long time1 = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                System.out.println(NodeUtils.toStringR(head));
            }
        });
        System.out.println(time1);

        long time2 = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                System.out.println(NodeUtils.toString(head));

            }
        });
        System.out.println(time2);


        Node newHead = NodeUtils.addToHead(head, new Node(-34, null));
        System.out.println(newHead.val);




    }

    public static String test(){
        String abc = "abc";
        return abc = "cde";
    }

    private static void test4() {
        Node head = new Node(1,null);
        Node last = head;

        for (int i = 0; i < 10; i++) {
            last = new Node(i, last);
        }
    }

    private static void test3() {
        Node head = new Node(1,null);

        for (int i = 0; i < 10; i++) {
            Node newNode = new Node(i, head);
            head = newNode;
        }
    }

    private static void test2() {
        Node head = new Node(1,null);

        Node second = new Node(2, head);
        Node third = new Node(3, second);

        head = null;
        second = null;
    }

    private static void test1() {
        Node head = new Node(1,null);

        Node second = new Node(2, head);
        Node third = new Node(3, second);
    }
}
