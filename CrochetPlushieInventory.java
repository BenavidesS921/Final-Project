import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CrochetPlushieInventory
{
    private ArrayList<String> crochetPlushies = new ArrayList<>();
    private String[] soldOutPlushies = new String[12];
    private int soldOutCount = 0;
    Scanner CPInput = new Scanner(System.in);

    public void saveData(String inventoryFile, String soldOutFile)
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(inventoryFile))){
            for (String cPlush: crochetPlushies)
            {
                writer.write(cPlush);
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Error saving data: " + e);
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(soldOutFile))){
            for (int i = 0; i < soldOutCount; i++)
            {
                writer.write(soldOutPlushies[i]);
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Error saving data: " + e);
        }
    }
       public void loadData(String inventoryFile, String soldOutFile)
    {
          try(BufferedReader reader = new BufferedReader(new FileReader(inventoryFile))){
            String line = reader.readLine();
            while (line != null){
                crochetPlushies.add(line); 
            }
        }
        catch (IOException e)
        {
            System.out.println("Error loading data: " + e);
        }

         try(BufferedReader reader = new BufferedReader(new FileReader(soldOutFile))){
            String line = reader.readLine();
            while (line != null){
               soldOutPlushies[soldOutCount++] = line;
            }
        }
        catch (IOException e)
        {
            System.out.println("Error loading data: " + e);
        }
    }

    public void addPlushie()
    {
        System.out.print("Enter crochet plushie to add: ");
        String cPlush = CPInput.nextLine();
        crochetPlushies.add(cPlush);
    }
    public void sellPlushie() throws IndexOutOfBoundsException
    {
        if(crochetPlushies.isEmpty())
        {
            System.out.println("No plushies available to sell.");
            return;
        }

        viewInventory();
        System.out.print("Enter the index of the plushie to sell: ");
        int CPIndex = InputValidation.getValidInt("Enter the index of the plushie to sell: ", 0, crochetPlushies.size() - 1);
        
        if(soldOutCount >= soldOutPlushies.length)
        {
            System.out.println("Sold out inventory is full. Cannot sell more plushies.");
            return;
        }
        soldOutPlushies[soldOutCount++] = crochetPlushies.remove(CPIndex);
        System.out.println(soldOutPlushies[soldOutCount - 1] + " plushie sold successfully.");
    }
    public void viewInventory()
    {
        System.out.println("Available Crochet Plushies: " + crochetPlushies);
        System.out.println("Sold Out Crochet Plushies: ");
        for(int i = 0; i < soldOutCount; i++)
        {
            System.out.println(soldOutPlushies[i] + " ");
        }
    }
}
