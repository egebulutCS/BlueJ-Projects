
public class TestAss2
{
    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;
    //number of match signifies which teams playing
    private FootMatch match12;
    private FootMatch match31;
    private FootMatch match23;
    private FootMatch match42;
  
    
    public void testResults()
    {
        match12 = new FootMatch("1","2");
        match31 = new FootMatch("3","1");
        match23 = new FootMatch("2","3");
        match42 = new FootMatch("4","2");
        team1 = new Team("1");
        team2 = new Team("2");
        team3 = new Team("3");
        team4 = new Team("4");
        match12.setResult(3,1);
        match31.setResult(4,2);
        match23.setResult(6,5);
        match42.setResult(7,0);
        match12.printResult();
        match31.printResult();
        match23.printResult();
        match42.printResult();
        team1.getMatchResult(match12);
        team2.getMatchResult(match12);
        team1.getMatchResult(match31);
        team3.getMatchResult(match31);
        team2.getMatchResult(match23);
        team3.getMatchResult(match23);
        team2.getMatchResult(match42);
        team4.getMatchResult(match42);
        team1.getTeamName();
        team2.getTeamName();
        team3.getTeamName();
        team4.getTeamName();
        team1.getTotalGoalsFor();
        team2.getTotalGoalsFor();
        team3.getTotalGoalsFor();
        team4.getTotalGoalsFor();
        team1.getTotalGoalsAgainst();
        team2.getTotalGoalsAgainst();
        team3.getTotalGoalsAgainst();
        team4.getTotalGoalsAgainst();

    }
    
   
}
