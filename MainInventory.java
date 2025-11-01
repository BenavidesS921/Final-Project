public class MainInventory
{
    private static CrochetPlushieInventory cP;
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Crochet Plush Inventory System!");
        mainMenu();
        cP = new CrochetPlushieInventory();
        makeChoice();
        cP.loadData("inventoryFile.txt", "soldOutFile.txt");
    }
    public static void mainMenu()
    {
        System.out.println("Main Menu:");
        System.out.println("1. View inventory");
        System.out.println("2. Add a new crochet plushie");
        System.out.println("3. Sell a crochet plushie");
        System.out.println("4. Exit");
    }
    public static void makeChoice()
    {
        int choice;
        do
        {
            System.out.print("Enter your choice (1-4): ");
            choice = InputValidation.getValidInt("Enter your choice (1-4): ", 1, 4);
            System.out.println("You selected option: " + choice);
            menuChoice(choice);
        }
        while (choice != 4);
    }
    public static void menuChoice(int choice)
    {
         switch (choice) 
        {
            case 1:
                cP.viewInventory();
                break;
            case 2:
                cP.addPlushie();
                break;
            case 3:
                cP.sellPlushie();
                break;
            case 4:

                cP.saveData("inventoryFile.txt", "soldOutFile.txt");
                System.out.println("Data Saved. Exiting Program.");
                break;
        }
    }
}
