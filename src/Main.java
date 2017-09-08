public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nstudents;
		String stName;
		int stID;
		double stmarks;
		Date stdob;

		System.out.print("How many students would you like to enter?");
		nstudents = sc.nextInt();
		sc.nextLine();
		Student[] students= new Student[nstudent];
		//ArrayList studentArray = new ArrayList(nstudents);
		
		for (int i = 0; i < nstudents; i++) {
			System.out.print("Enter name: ");
			stName = sc.nextLine();
			System.out.print("Enter ID: ");
			stID = sc.nextInt();
			System.out.print("Enter marks:");
			stMarks = sc.nextDouble();
			sc.nextInt();
			System.out.print("Enter dob:");
			stDob = sc.nextLine();
			studentArray.add(new Student( stID, stName,stDob,stMarks));
		}
		
		
		
		for (ListIterator stIterator = studentArray.listIterator(); stIterator.hasNext(); ) {
			Student st = (Student)stIterator.next();
			System.out.println(st);
		}
		
		ListIterator studentIterator = studentArray.listIterator();
		
		while (studentIterator.hasNext()) {
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}
		
		System.out.print("Who would you like to delete?");
		String nameToRemove = sc.nextLine();
	
		Student tempStudent = new Student();
		tempStudent.setName(nameToRemove);
		int stIndex = studentArray.indexOf(tempStudent);
		studentArray.remove(stIndex);
		

		
		studentIterator = studentArray.listIterator();
		
		while (studentIterator.hasNext()) {
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}

		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
