
public class Principal {

    public static void main(String args[]) {
        ClasseA a = new ClasseA();
        ClasseB b1 = new ClasseB("B1", "BUm");
        a.incluir(b1.getAtributo1(), b1);
        ClasseB b2 = new ClasseB("B2", "BDois");
        a.incluir(b2.getAtributo1(), b2);
        ClasseB b3 = new ClasseB("B3", "BTres");
        a.incluir(b3.getAtributo1(), b3);
        //Consultando um elemento
        ClasseB bc = a.consulta("B1");
        System.out.println("Atributo:" + bc.getAtributo2());
        //Listando todos
        a.listar();
    }
}
