import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        System.out.println("Usando uma anotation com reflexion");

        Produto prod = new Produto("produto", 10d, "A");
        Class clazz = prod.getClass();

        Field[] fields = prod.getClass().getDeclaredFields();
        for (Field field : fields){
            if (field.isAnnotationPresent(Tabela.class)){
                Tabela tabela = field.getAnnotation(Tabela.class);
                System.out.println(tabela.value());
            }
        }
    }

//        Field[] fields = prod.getClass().getDeclaredFields();
//        for (Field field : fields){
//            if (field.isAnnotationPresent(Tabela.class)){
//                Tabela tabela = field.getAnnotation(Tabela.class);
//                String nomeMetodo = tabela.value();
//                try {
//                    Method metodo = prod.getClass().getMethod(nomeMetodo);
//                    Long value = (Long) metodo.invoke(prod);
//                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
}