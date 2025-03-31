package RecursionAdvance;

public class Tower_of_Hanoi {
	public static void tower_hanoi_2(int disk,int source,int auxilary,int destination) {
		if(disk==0) {
			return;
		}
		tower_hanoi_2(disk-1, source, destination,auxilary);
		System.out.println(source+" "+destination);
		tower_hanoi_2(disk-1, auxilary, source, destination);
		
	}
	
	public static void tower_hanoi(int disks,char source,char auxilary,char destination) {
		if(disks==0) {
			return;
		}
		tower_hanoi(disks-1, source, destination,auxilary);
		System.out.println(source+" "+destination);
		tower_hanoi(disks-1, auxilary, source, destination);
	}

	public static void main(String[] args) {
		int disk = 3;
		tower_hanoi(disk, 'a', 'b', 'c');
		tower_hanoi_2(disk, 1, 2, 3);

	}

}
