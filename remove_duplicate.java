package assignments;

import java.util.Scanner;

public class remove_duplicate {
	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String arg[]) {
		remove_duplicate li = new remove_duplicate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			insertion(li, num);
		}
		System.out.println("Elements of Array after removing duplicate elemnts");
		display(li);
	}

	public static void display(remove_duplicate li) {
		Node temp = li.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static remove_duplicate insertion(remove_duplicate li, int num) {
		Node newNode = new Node(num);
		int flag = 0;
		newNode.next = null;
		if (li.head == null) {
			li.head = newNode;
		} else {
			Node temp = li.head;
			while (temp != null) {
				if (temp.data == num) {
					flag = 1;
					break;
				}
				temp = temp.next;
			}
			if (flag == 0) {
				Node temp1 = li.head;
				while (temp1.next != null) {
					temp1 = temp1.next;
				}
				temp1.next = newNode;
			}
		}
		return li;
	}
}
