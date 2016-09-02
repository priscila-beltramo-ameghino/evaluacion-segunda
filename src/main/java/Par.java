/**
 * Created by damian on 02/09/16.
 */
public class Par <P, S>{

    private P first;
    private S second;

    public Par(P i, S i1) {
        this.first=i;
        this.second=i1;
    }

    public P first() {
        return this.first;
    }

    public S second() {
        return this.second;
    }
}
