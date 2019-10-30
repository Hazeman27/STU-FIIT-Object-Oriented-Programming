package privacy;

public class Observer {

    Private p = new Private();
    public String secret = p.secret;

    // can't access p.theScret, because it is private
}