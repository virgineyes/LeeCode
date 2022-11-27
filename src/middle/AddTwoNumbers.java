package middle;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode root = null;
    int flag = 0;
    while (l1 != null || l2 != null || flag != 0) {
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      sum += flag;
      int result;
      if (sum > 9) {
        result = sum % 10;
        flag = 1;
      } else {
        result = sum;
        flag = 0;
      }
      ListNode newNode = new ListNode(result);
      if (root == null) {
        root = newNode;
      } else {
        ListNode current = root;
        while (current.next != null) {
          current = current.next;
        }
        current.next = newNode;
      }
    }
    return root;
  }

  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
