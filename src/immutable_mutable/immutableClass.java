package immutable_mutable;

//model

public class immutableClass {
    private int first;
    private int Second;
    //Constructor
    public void ImmutableClass(int first, int Second ){
        this.first = first;
        this.Second = Second;

    }

    public immutableClass() {
    }

    //Getter
    public int getFirst() { return this.first;}
    public int getSecond() { return this.Second;}
    // Behavior
    public int add(){
        return this.first + this.Second;

    }

