import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }

    // Method to convert input string like "[1,2,3]" to ListNode
    public static ListNode deserialize(String data) {
        if (data == null || data.length() <= 2) return null;

        data = data.substring(1, data.length() - 1); // remove [ and ]
        String[] parts = data.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String part : parts) {
            current.next = new ListNode(Integer.parseInt(part.trim()));
            current = current.next;
        }

        return dummy.next;
    }

    // Optional: Convert ListNode to readable string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode curr = this;
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) sb.append("->");
            curr = curr.next;
        }
        return sb.toString();
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
