
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    private ArrayList<Item> itemsList = new ArrayList<>();
    private File file;

    Simulation(String itemsFile) {
        file = new File(itemsFile);
    }

    /*
     Read the text file line by line and create an Item object
     for each and then add it to an ArrayList of Items.
     The method should then return that ArrayList
    */
    public ArrayList<Item> loadItems() throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String line = scanner.next();
            String[] lineSplit = line.split("=",2);
            //Create new object of Item class which has name and weight of items to be added to rocket.
            Item item = new Item();
            // Add item name
            item.name = lineSplit[0];
            //Add item weight
            item.weight = Integer.valueOf(lineSplit[1]);
            // Add item to the itemList created above.
            itemsList.add(item);
        }
        scanner.close();
        // Return the list of items loaded.
        return itemsList;

    }

    /*
     takes the ArrayList of Items returned from loadItems and starts creating U1 rockets.
     It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object
     and filling that one until all items are loaded.
     The method then returns the ArrayList of those U1 rockets that are fully loaded
     */

    public ArrayList<Rocket> loadU1(ArrayList<Item> list) {
        ArrayList<Rocket> rocketU1 = new ArrayList<>();
        U1 rocket = new U1();
        rocketU1.add(rocket);

        for (Item item : list) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rocket = new U1();
                rocketU1.add(rocket);
                rocket.carry(item);
            }
        }
        return rocketU1;
    }

    /*
     this method also takes the ArrayList of Items and starts creating U2 rockets
     and filling them with those items the same way as with U1 until all items are loaded.
     The method then returns the ArrayList of those U2 rockets that are fully loaded.
     */
    public ArrayList<Rocket> loadU2(ArrayList<Item> list) {
        ArrayList<Rocket> rocketU2 = new ArrayList<>();
        U2 rocket = new U2();
        rocketU2.add(rocket);

        for (Item item : list) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rocket = new U2();
                rocketU2.add(rocket);
                rocket.carry(item);
            }
        }
        return rocketU2;
    }
    public int runSimulation(ArrayList<Rocket> list) {
        int failedTrials = 0;
        int indexSuccess = 1;
        for (Rocket r : list) {

            while (!r.launch()) {
                r.launch();
                failedTrials++;
            }

            while (!r.land()) {
                r.land();
                failedTrials++;
            }
            indexSuccess++;
        }
        int budget = list.get(0).cost * (list.size() + failedTrials);
        System.out.println(list.size() + " rockets and " + failedTrials + " extra trials = "
                + (list.size() + failedTrials) + " in total");
        return budget;
    }
}
