
public class PermitHolder extends Person1 {
    int identity;

    public PermitHolder(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format( "PermitHolder{" +
                "identity=" + identity +
                '}');
    }
}
