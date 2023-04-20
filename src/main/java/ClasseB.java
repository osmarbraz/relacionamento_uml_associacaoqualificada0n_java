
public class ClasseB {

    private String atributo1;
    private String atributo2;

    public ClasseB() {
        this("", "");
    }

    public ClasseB(String atributo1, String atributo2) {
        setAtributo1(atributo1);
        setAtributo2(atributo2);
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    public String getAtributo2() {
        return atributo2;
    }
}
