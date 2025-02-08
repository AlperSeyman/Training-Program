import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome the Training Program");
		
		String exercise_list = "Burpee\n"
						+ "Push Up\n"
						+ "Sit Up\n"
						+ "Squat";
		System.out.println(exercise_list);
		
		System.out.println("Create a new training program...");
		
		System.out.println("Burpee Reps : ");
		int burpee = scanner.nextInt();
		
		System.out.println("Push Up Reps : ");
		int push_up = scanner.nextInt();
		
		System.out.println("Sit Up Reps : ");
		int sit_up = scanner.nextInt();
		
		System.out.println("Squat Reps : ");
		int squat = scanner.nextInt();
		
		scanner.nextLine();
		
		Training training = new Training(burpee, push_up, sit_up, squat);
		
		System.out.println("Training is starting....");
		
		while(training.train_is_over() == false) {
			
			System.out.print("Exercises (Burpee, Push Up, Sit Up, Squat)");
			String exercise = scanner.nextLine();
			System.out.print("Reps : ");
			int reps = scanner.nextInt();
			scanner.nextLine();
			
			training.do_exercise(exercise, reps);
		}
		
	}

}
