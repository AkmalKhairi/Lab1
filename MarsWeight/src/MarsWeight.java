import java.util.Scanner;
public class MarsWeight {
	
	private static Weight weight = new Weight();

	public static void main(String[] args) {
        System.out.println(" ===== Human weight on Mars =====\n");
        weight();
   }

    static double weightkg;

    public static void weight() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        System.out.println("\n1). Please type 1 to view weight on Mars in KG." + "\n2). Please type 2 to display Human Weight on Earth & Mars " + "\n3). Please type 3 to exit this program.");
        int choice = in.nextInt();
        if (choice == 1)
        {
        	System.out.println("You have chosen weight in kg, please enter your weight in kilograms (KG).");
            weightkg = in.nextDouble();
            System.out.printf("Your weight on Earth is: " + weightkg + " kg\n", (weightkg * 0.38));
            System.out.printf("Your weight on Mars is: %.1f kg\n\n", (weightkg * 0.38));
            weight();
        }
        if (choice == 2)
        {
        	WeightM();
        	System.out.printf("\n");
        	weight();
        }
        if (choice == 3)
        {
        	System.out.println("Thank You!");
            System.exit(0);
        }
    }
    public static void WeightM()
    {
    	weight.Weights();
    }
}