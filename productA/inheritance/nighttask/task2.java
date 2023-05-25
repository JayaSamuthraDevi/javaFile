public class Cricket {
    public static void main(String[] args) {
        match b1 = new batsman();
        match b2 = new bowler();
        b1.quality();
        b2.quality();
    }
}

interface match{
    void quality();
}

class batsman implements match{
    public void quality(){
        System.out.println("I am BATSMAN");
    }
    
}

class bowler implements match{
    public void quality(){
        System.out.println("I am BOWLER too");
    }
}