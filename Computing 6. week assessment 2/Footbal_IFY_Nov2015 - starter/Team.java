import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Patrick
 * @version 1/5/2012
 */
public class Team
{
    // goals for and against are set at zero and then can be increased by accessing a match involving the team
    private String teamName;
    private int totalGoalsFor;
    private int totalGoalsAgainst;
    private int totalPoints;
 
    /**
     * constructor function - sets name of team
     */
    public  Team(String tname)
    {
        teamName=tname;
    }

    /**
     * this method checks if the match involves this team by 
     * checking the home team name and the away team name.
     * If this team is involved it then gets the goals for by calling the getGoalsFor
     * and getGoalsAgainst methods in the thisMatch object
     * It then calls the updateStats method and passes the ourGoals and theirGoals
     * values as parameters
     */
    public void getMatchResult(FootMatch match)
    {   
        String hteam = match.getHomeTeamName();
        String ateam = match.getAwayTeamName();
        int hgoals = match.getHomeGoals();
        int agoals = match.getAwayGoals();
        if(teamName.equals(hteam))
        {
            int ourGoals=hgoals;
            int theirGoals=agoals;   
            UpDateStats(ourGoals,theirGoals);
        }
        else if(teamName.equals(ateam))
        {
            int ourGoals=agoals;
            int theirGoals=hgoals;
            UpDateStats(ourGoals,theirGoals);
        }
        else
        {
            System.out.println("Neither of the teams were involved in the match.");
        }
    }

    /**
     * This method receives the goals for and goal against as parameter
     * values. 
     * It calculates the points for this match. If it's a win then the points
     * will be 3, if a draw 1 and if the match was lost 0  points
     * It then updates the totalGoalFor, totalGoalsAgainst and totalPoints fields.
     * It calls the printStats method and passes all these values as parmeters.
     */
    private void UpDateStats(int ourGoals, int theirGoals)
    {
        totalGoalsFor+=ourGoals;
        totalGoalsAgainst+=theirGoals;
        int pts;
        if(ourGoals>theirGoals)
        {
            totalPoints+=3;
            pts = 3;
        }
        else if(ourGoals==theirGoals)
        {
            totalPoints++;
            pts = 1;
        }
        else
        {
            totalPoints+=0;
            pts = 0;
        } 
        printStats(ourGoals,theirGoals,pts,totalGoalsFor,totalGoalsAgainst,totalPoints);
    }

    /**
     * This method just prints out the statistics so far in a readable way with labels
     */
    private void printStats(int ourG, int theirG, int pts,  int totalGFor, int totalGAgainst, int ttlPoints )
    {
        System.out.println("Our goals are "+ourG);
        System.out.println("Their goals are "+theirG);
        System.out.println("The point gained is "+pts);
        System.out.println("Total goals for are "+totalGFor);
        System.out.println("Total goals against are "+totalGAgainst);
        System.out.println("The total point is "+totalPoints);
    }

    public String getTeamName()
    {
        return teamName;
    }

    public int getTotalGoalsFor()
    {
        return totalGoalsFor;
    }

    public int getTotalGoalsAgainst()
    {
        return totalGoalsAgainst;
    }

    /**
     * this method will return the name of the team, the total goals for and against
     * and the total points 
     */
    public String toString()
    {
        return "";
    }


}