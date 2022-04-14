package day31CustomSlassConstructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    String PO, BA, SM;
   public  ArrayList<Tester> testersList = new ArrayList<>();
   public  ArrayList<Developer> devopsList = new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;

    }

    public void addTester(Tester tester){
        testersList.add(tester);

    }
    public void addTesters(Tester[] tester){
        testersList.addAll(Arrays.asList(tester));

    }

    public void addDevoper(Developer developer){
        devopsList.add(developer);

    }

    public void addDevopers(Developer[] developer){
        devopsList.addAll(Arrays.asList(developer));

    }

    // removeTester(long employeeID): removes the given tester from the testers ArrayList

    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeID==employeeID);
    }

    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", totgal number of testers=" + testersList.size()+
                ", total number of developers=" + devopsList.size()+
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
