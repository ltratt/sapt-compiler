package expressions;


public class $int implements AbstractExpression {

    private int val;

    public $int(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String pp() {
        return String.valueOf(val);
    }
}
