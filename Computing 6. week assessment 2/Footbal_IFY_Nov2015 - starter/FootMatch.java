public class FootMatch
{
    private String homeTeamName;
    private String awayTeamName;
    private int homeGoals;
    private int awayGoals;
    private String result;

    /**
     *constructor 
     */
    public FootMatch(String hteam, String ateam)
    {
        homeTeamName=hteam;
        awayTeamName=ateam;
        homeGoals=0;
        awayGoals=0;
    }

    /**
     * After match is played set the result
     */
    public void setResult(int hgoals, int agoals)
    {      
        homeGoals=hgoals;
        awayGoals=agoals;
    }

    /**
     * get methods for the team object to invoke
     */
    public String getHomeTeamName()
    {
        return homeTeamName;
    }

    public String getAwayTeamName()
    {
        return awayTeamName;
    }

    public int getHomeGoals()
    {
        return homeGoals;
    }

    public int getAwayGoals()
    {
        return awayGoals;
    }

    public void printResult()
    {
        if(homeGoals>awayGoals)
        {
            System.out.println(homeTeamName+", as home team scored, "+homeGoals+" and "+awayTeamName+", as away team scored, "+awayGoals);
            System.out.println(homeTeamName+" wins!");
        }
        else if(awayGoals>homeGoals)
        {
            System.out.println(homeTeamName+", as home team scored, "+homeGoals+" and "+awayTeamName+", as away team scored, "+awayGoals);
            System.out.println(awayTeamName+" wins!");
        }
        else
        {
            System.out.println(homeTeamName+", as home team scored, "+homeGoals+" and "+awayTeamName+", as away team scored, "+awayGoals);
            System.out.println("The match ends with a draw!");
        }
    }
}
