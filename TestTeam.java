import java.util.Scanner;
public class TestTeam {

    //test our team class

    Team team1 = setTeamData();
    display(team1);

    Team team2 = setTeamData();
     display(team2);

    Team team3 = setTeamData();
     display(team3);


    
}//ends our main method

public static Team setTeamData(){
    Scanner input = new Scanner(System.in);

    Team temp;
    String name, sport, mascot;
    System.out.println("Enter school name>>>");
    name = input.nextLine();
    System.out.println("Enter sport>>>");
    sport = input.nextLine();
    System.out.println("Enter mascot name>>>");
    mascot = input.nextLine();

    temp = new Team(name, sport, mascot);

    return temp;


    
}//ends our team data method

public static void display(Team t){

    System.out.println(t.getSchool()+ " " + t.getSport() + " team " + t.getMascot() );
}


}


