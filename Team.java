public class Team {

    //create instance variables
    private String school;
    private String sport;
    private String mascot;
    

    public final static String MOTTO = "sportsmanship!";

    public Team (String aSchool, String aSport, String aMascot) {
        
        school = aSchool;
        sport = aSport;
        mascot = aMascot;
         


    }// ends our Team constructor
    //ends our constructor methods

    //begin creating getter/setter methods

    //getter for our school

    public String getSchool(){

        return school;
    }// ends our getschool method

    //getter for our sport
    public String getSport(){

        return sport;


    }// ends our getsport method
    
}
