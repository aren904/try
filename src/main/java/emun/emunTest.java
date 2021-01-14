package emun;

import com.sun.org.apache.regexp.internal.REDebugCompiler;

public enum emunTest {
    Green(1),
    BLACK(2),
    RED(3);

    private int value;

    emunTest(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



    public static emunTest getCode(int v){
        for (emunTest code:emunTest.values()){
            if (code.getValue()==v){
                return code;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        emunTest code = emunTest.getCode(3);
        System.out.println(code);
    }

}
