// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class SortedLinkedList {
//     Node head;

//     // Function to insert a node into its proper sorted position
//     void insertSorted(int newData) {
//         Node newNode = new Node(newData);

//         // If the list is empty or the new node should be the first node
//         if (head == null || newData < head.data) {
//             newNode.next = head;
//             head = newNode;
//             return;
//         }

//         // Find the node before the point of insertion
//         Node current = head;
//         while (current.next != null && current.next.data < newData) {
//             current = current.next;
//         }

//         // Insert the new node into the sorted position
//         newNode.next = current.next;
//         current.next = newNode;
//     }

//     // Function to print the linked list
//     void printList() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         SortedLinkedList sortedList = new SortedLinkedList();

//         // Insert nodes into the sorted linked list
//         sortedList.insertSorted(5);
//         sortedList.insertSorted(10);
//         sortedList.insertSorted(7);
//         sortedList.insertSorted(3);
//         sortedList.insertSorted(8);

//         // Print the sorted linked list
//         System.out.println("Sorted Linked List:");
//         sortedList.printList();
//     }
// }
//   // Question2 : Write a java program to compute the height of the binary tree.
// class Node {
//     int data;
//     Node left, right;

//     public Node(int item) {
//         data = item;
//         left = right = null;
//     }
// }

// class BinaryTreeHeight {
//     Node root;

//     // Function to compute the height of the binary tree
//     int height(Node root) {
//         if (root == null) {
//             return 0;
//         } else {
//             // Compute the height of the left and right subtrees
//             int leftHeight = height(root.left);
//             int rightHeight = height(root.right);

//             // Return the maximum of the left and right subtree heights, plus 1 for the
//             // current level
//             return Math.max(leftHeight, rightHeight) + 1;
//         }
//     }

//     public static void main(String[] args) {
//         BinaryTreeHeight tree = new BinaryTreeHeight();

//         // Construct a sample binary tree
//         tree.root = new Node(1);
//         tree.root.left = new Node(2);
//         tree.root.right = new Node(3);
//         tree.root.left.left = new Node(4);
//         tree.root.left.right = new Node(5);
//         tree.root.right.left = new Node(6);
//         tree.root.right.right = new Node(7);

//         // Compute and print the height of the binary tree
//         System.out.println("Height of the binary tree is: " + tree.height(tree.root));
//     }
// }

// class TreeNode {
//     int data;
//     TreeNode left, right;

//     public TreeNode(int item) {
//         data = item;
//         left = right = null;
//     }
// }

// class BinaryTreeIsBST {
//     TreeNode root;

//     // Helper function to check if a binary tree is a BST
//     boolean isBSTUtil(TreeNode node, int min, int max) {
//         // Base case: an empty tree is a BST
//         if (node == null) {
//             return true;
//         }

//         if (node.data < min || node.data > max) {
//             return false;
//         }

//         return isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max);
//     }

//     // Function to check if a binary tree is a BST
//     boolean isBST() {
//         // Use Integer.MIN_VALUE and Integer.MAX_VALUE as initial constraints
//         return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
//     }

//     public static void main(String[] args) {
//         BinaryTreeIsBST tree = new BinaryTreeIsBST();

//         // Construct a sample binary tree
//         tree.root = new TreeNode(4);
//         tree.root.left = new TreeNode(2);
//         tree.root.right = new TreeNode(5);
//         tree.root.left.left = new TreeNode(1);
//         tree.root.left.right = new TreeNode(3);

//         // Check and print whether the binary tree is a BST or not
//         if (tree.isBST()) {
//             System.out.println("The binary tree is a Binary Search Tree (BST).");
//         } else {
//             System.out.println("The binary tree is not a Binary Search Tree (BST).");
//         }
//     }
// }

import java.util.Stack;

class BalancedExpressionChecker {

    // Function to check if the given expression is balanced
    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the expression
        for (char ch : expression.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // If the character is a closing bracket, pop from the stack and check if it
                // matches
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; // Mismatched closing bracket
                }
            }
        }

        // If the stack is empty, the expression is balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{ { [ [ ( ( ) ) ] ) } }";

        if (isBalanced(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}
