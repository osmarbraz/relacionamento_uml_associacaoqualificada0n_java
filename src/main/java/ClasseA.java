
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ClasseA {

    private Map<String, ClasseB> mapa;

    public ClasseA() {
        mapa = new HashMap<String, ClasseB>();
    }

    public boolean verifica(String atributo1) {
        return mapa.containsKey(atributo1);
    }

    public ClasseB consulta(String atributo1) {
        return (ClasseB) mapa.get(atributo1);
    }

    public boolean incluir(String atributo1, ClasseB b) {
        mapa.put(atributo1, b);
        return true;
    }

    public void listar() {
        Iterator<Map.Entry<String, ClasseB>> entries = mapa.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, ClasseB> entrada = entries.next();
            String atributo1 = entrada.getKey();
            ClasseB b = (ClasseB) entrada.getValue();
            System.out.println("Atributo1/Chave :" + atributo1 + " => Atributo2:" + b.getAtributo2());
        }
    }
}
