import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RunSimulation {

    private static final String phase1File = "phase-1.txt";
    private static final String phase1 = "Phase - 1";
    private static final String phase2 = "Phase - 2";
    private static final String phase2File = "phase-2.txt";


    public static void main(String [] args) throws FileNotFoundException {

        Simulation simulation = new Simulation(phase1File);
        ArrayList<Item> items = simulation.loadItems();

        Simulation simulation2 = new Simulation(phase2File);
        ArrayList<Item> items2 = simulation2.loadItems();


        ArrayList<Rocket> rocketsU1P1 = simulation.loadU1(items);
        ArrayList<Rocket> rocketsU2P1 = simulation.loadU2(items);

        ArrayList<Rocket> rocketsU1P2 = simulation.loadU1(items2);
        ArrayList<Rocket> rocketsU2P2 = simulation.loadU2(items2);

        U1 rocketU1TrialP1 = new U1();
        U2 rocketU2TrialP1 = new U2();


        System.out.println("************* Phase 1 Trial *****************");
        System.out.println("<<<<<<< Rocket: U1 >>>>>>>>");

        System.out.println("Cost of one U1 rocket is: "+ rocketU1TrialP1.cost);
        System.out.println("Maximum capacity of U2 rocket is: "+ rocketU1TrialP1.maxWeight);
        int budgetU1phase1 = simulation.runSimulation(rocketsU1P1);
        System.out.println("Budget of U1 fleet for phase 1 = " + budgetU1phase1 + " (millions)");


        System.out.println("<<<<<<< Rocket: U2 >>>>>>>>");
        System.out.println("Cost of one U2 rocket is: "+ rocketU2TrialP1.cost);
        System.out.println("Maximum capacity of U2 rocket is: "+ rocketU2TrialP1.maxWeight);
        int budgetU2phase1 = simulation.runSimulation(rocketsU2P1);
        System.out.println("Budget of U2 fleet for phase 1 = " + budgetU2phase1 + " (millions)");

        System.out.println(">>>>>>>>>>>> VERDICT PHASE 1 <<<<<<<<<<<<<<<");
        if(budgetU2phase1 > budgetU1phase1) {
            System.out.println("U2 rocket is ideal for Phase 1");
        }else if(budgetU2phase1 < budgetU1phase1) {
            System.out.println("U1 rocket is ideal for Phase 1");
        }else {
            System.out.println("Any of U1/U2 rocket can be used for Phase 1");
        }

        System.out.println("************* Phase 2 Trial *****************");
        System.out.println("<<<<<<< Rocket: U1 >>>>>>>>");

        System.out.println("Cost of one U1 rocket is: "+ rocketU1TrialP1.cost);
        System.out.println("Maximum capacity of U2 rocket is: "+ rocketU1TrialP1.maxWeight);
        int budgetU1phase2 = simulation.runSimulation(rocketsU1P2);
        System.out.println("Budget of U1 fleet for phase 1 = " + budgetU1phase2 + " (millions)");


        System.out.println("<<<<<<< Rocket: U2 >>>>>>>>");
        System.out.println("Cost of one U2 rocket is: "+ rocketU2TrialP1.cost);
        System.out.println("Maximum capacity of U2 rocket is: "+ rocketU2TrialP1.maxWeight);
        int budgetU2phase2 = simulation.runSimulation(rocketsU2P2);
        System.out.println("Budget of U2 fleet for phase 1 = " + budgetU2phase2 + " (millions)");

        System.out.println(">>>>>>>>>>>> VERDICT PHASE 2 <<<<<<<<<<<<<<<");
        if(budgetU2phase2 > budgetU1phase2) {
            System.out.println("U2 rocket is ideal for Phase 2");
        }else if(budgetU2phase2 < budgetU1phase2) {
            System.out.println("U1 rocket is ideal for Phase 2");
        }else {
            System.out.println("Any of U1/U2 rocket can be used for Phase 2");
        }
    }
}
