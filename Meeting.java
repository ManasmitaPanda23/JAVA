package Generics;

public class Meeting<E extends Employee> {
	private E head;

	public Meeting(E head) {
		this.head = head;
	}

	public E getHead() {
		return head;
	}

	public void setHead(E head) {
		this.head = head;
	}

	public void printMeeting() {
		System.out.println("head is=" + head.getClass().getSimpleName());
	}

}
