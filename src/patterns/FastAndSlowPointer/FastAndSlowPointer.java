package patterns.FastAndSlowPointer;


import patterns.FastAndSlowPointer.codes.LinkedListUtils;

public class FastAndSlowPointer {

    LinkedListUtils linkedListUtils = new LinkedListUtils();

    public void fastAndSlowPointerExample(){

        // Shorter alias for node class
        LinkedListUtils.ListNode head = new LinkedListUtils.ListNode(1);
        head.next = new LinkedListUtils.ListNode(2);
        head.next.next = new LinkedListUtils.ListNode(3);
        head.next.next.next = new LinkedListUtils.ListNode(4);
        head.next.next.next.next = new LinkedListUtils.ListNode(5);
        head.next.next.next.next.next = new LinkedListUtils.ListNode(6);

        // Create cycle: 6 -> 3
        head.next.next.next.next.next.next = head.next.next;

        // 1. Detect cycle
        boolean cycle = LinkedListUtils.hasCycle(head);
        System.out.println("Cycle exists: " + cycle);

        // 2. Find start of cycle
        LinkedListUtils.ListNode start = LinkedListUtils.detectCycleStart(head);
        if (start != null) {
            System.out.println("Cycle starts at node with value: " + start.val);
        }

        // 3. Create another non-cyclic list to test findMiddle
        LinkedListUtils.ListNode head2 = new LinkedListUtils.ListNode(10);
        head2.next = new LinkedListUtils.ListNode(20);
        head2.next.next = new LinkedListUtils.ListNode(30);
        head2.next.next.next = new LinkedListUtils.ListNode(40);
        head2.next.next.next.next = new LinkedListUtils.ListNode(50);

        LinkedListUtils.ListNode middle = LinkedListUtils.findMiddle(head2);
        System.out.println("Middle node value: " + middle.val);

    }
}
