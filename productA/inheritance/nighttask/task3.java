interface both
{
    void bat_bowl();
}

class batsman {
    public void bat(){
        System.out.println("I am BATSMAN");
    }

    
}

class bowler extends batsman{
    public void bowl(){
        System.out.println("I am BOWLER too");
    }
}

class bat_bowl implements both 
{
static void both()
{
    System.out.println("I am BATSMAN and BOWLER too");
}

public static void main(String args[])
{
    bat_bowl b=new bat_bowl();
    b.both();
}
}

