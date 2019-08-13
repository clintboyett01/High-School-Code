import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.println("loading...");
        FileReader fileReader = new FileReader();
        DataMiner dataMiner = new DataMiner(fileReader.getConfrences());

        do {
            System.out.println("What Data would you like to see?");
            System.out.println("1: Team average by confrence");
            System.out.println("2: Individual average by confrence");
            System.out.println("Type \"exit\" to quit");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
            switch(choice){
                case "1":
                    System.out.println("Which confrence? 1,2,3,4,5,or 6");
                    int cho = sc.nextInt();
                    System.out.println(dataMiner.averageTeamScore(cho+1));
                    break;
                case "2":
                    System.out.println("Which confrence? 1,2,3,4,5,or 6");
                    int cho1 = sc.nextInt();
                    System.out.println(dataMiner.averageIndividualScore(cho1+1));
                    break;
                case "exit": break;
                default:
                    System.out.println("Invalad input, please try again");
            }
        }
        while (choice.equalsIgnoreCase("exit"));


    }
}

class DataMiner{
    private ArrayList<Confrence> confrences = new ArrayList<>();

    DataMiner(ArrayList<Confrence> confrences){
        this.confrences = confrences;
    }

    public double averageIndividualScore(int confrenceNumber){
        Confrence confrence = confrences.get(confrenceNumber);
        double average = 0;
        for(Individual individual: confrence.individuals){
            average += individual.score;
        }
        average/=confrence.individuals.size();
        return average;
    }

    public double averageTeamScore(int confrenceNumber){
        //Confrence confrence = confrences.get(confrenceNumber);
        //System.out.println(confrences.get(0).teams.get(0).score);
        double average = 0;
       // System.out.println(confrences.get(0).teams.get(3).score);
        //System.out.println(confrences.get(confrenceNumber).teams.size());
        for (int i = 0; i < confrences.get(confrenceNumber).teams.size(); i++) {
            average+=confrences.get(confrenceNumber).teams.get(i).score;
        //    System.out.println(confrences.get(confrenceNumber).teams.get(i).score);
        }
       // System.out.println(average);
        average/=confrences.get(confrenceNumber).teams.size();

        return average;
    }

}

class FileReader{
    private ArrayList<Confrence> confrences = new ArrayList<>();
    private ArrayList<District>  districts = new ArrayList<>();
    private ArrayList<Individual> individuals = new ArrayList<>();
    private ArrayList<Team> teams = new ArrayList<>();
    FileReader()throws IOException{
        Scanner sc = new Scanner(new File("compSciUilDist2019.txt"));
        sc.nextLine();
        String next = sc.nextLine().trim();
        for (int i = 0; i < 6; i++) {
            Confrence confrence = new Confrence(1+i+"A");

            while (!(""+next.charAt(1)).equals("A")){
                System.out.println(next);
                next = next.charAt(next.length()-1)+"";

                District district = new District(1+i+"A",Integer.parseInt(next));
                sc.nextLine();sc.nextLine();
                String ind = sc.nextLine();
                if((ind.substring(1,2)).equals("A")){
                    next = ind;
                    continue;
                }
                while (!(ind.equals("Team Results")||(ind.substring(0,8)).equals("Computer"))){
                    Scanner split = new Scanner(ind);
                    String lastName = split.next();
                    String firstName = split.next();
                    split.useDelimiter(",");
                    String School = split.next().trim();
                    split.useDelimiter("\\d");
                    split.next();
                    String town = split.next();
                    Scanner iCouldFindNoOtherWay = new Scanner(ind);
                    while (!iCouldFindNoOtherWay.hasNextInt()){
                        iCouldFindNoOtherWay.next();
                    }
                    int score = iCouldFindNoOtherWay.nextInt();
                    Individual individual = new Individual(1+i+"A",score,firstName,lastName,School,town);
                    individuals.add(individual);
                    confrence.individuals.add(individual);
                    ind = sc.nextLine().trim();
                    split.close();
                }
                if((ind.substring(0,8)).equals("Computer")){
                    continue;
                }
                String t = sc.nextLine();
                if((!(t.substring(1,2)).equals("A")||(t.substring(0,8)).equals("Computer"))){
                    t = sc.nextLine();
                }
                else if((t.substring(1,2)).equals("A")){

                    continue;
                }
                while (!((t.substring(1,2)).equals("A")||(t.substring(0,8)).equals("Computer"))){
                    Scanner split = new Scanner(t);
                    split.useDelimiter(",");
                    String school = split.next();
                    split.useDelimiter("\\s");
                    split.next();
                    String town = split.next();
                    Scanner iCouldFindNoOtherWay = new Scanner(t);
                    iCouldFindNoOtherWay.useDelimiter("\\s");
                    while (!iCouldFindNoOtherWay.hasNextInt()){
                        iCouldFindNoOtherWay.next();
                    }
                    int score = iCouldFindNoOtherWay.nextInt();
                    Team team = new Team(1+i+"A",score,school,town);
                    confrence.teams.add(team);
                    teams.add(team);
                    t = sc.nextLine();
                    split.close();
                }
                confrence.districts.add(district);
                districts.add(district);
                next = t;
            }
            confrences.add(confrence);
            next = sc.nextLine();
            System.out.println("Done with confrence " + (1+i));
        }
    }

    public ArrayList<Confrence> getConfrences(){
        return confrences;
    }
}

class Confrence {
    public String confrence;
    public ArrayList<Individual> individuals = new ArrayList<>();
    public ArrayList<Team> teams = new ArrayList<>();
    public ArrayList<District> districts = new ArrayList<>();
    Confrence(String confrence){
        this.confrence = confrence;
    }
}

class Region{
    public String confrence;
    public ArrayList<Individual> individuals = new ArrayList<>();
    public ArrayList<Team> teams = new ArrayList<>();
    public ArrayList<District> districts = new ArrayList<>();
}

class District{
    public String confrence;
    int distroctNumber;
    public ArrayList<Individual> individuals = new ArrayList<>();
    public ArrayList<Team> teams = new ArrayList<>();
    District(String confrence, int distroctNumber ){
        this.confrence = confrence;
        this.distroctNumber = distroctNumber;
    }
}

class Team{
    public String confrence;
    public int score;
    String school;

    public Team(String confrence, int score, String school, String town) {
        this.confrence = confrence;
        this.score = score;
        this.school = school;
        this.town = town;
    }

    String town;
}

class Individual{
    public String confrence;
    public int score;
    public String firstName;
    public String lastName;
    public String schoolName;
    public String homeTown;


    public Individual(String confrence, int score, String firstName, String lastName, String schoolName, String homeTown) {
        this.confrence = confrence;
        this.score = score;
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.homeTown = homeTown;
    }
}

