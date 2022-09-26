import models.Constants;
import models.JavaClass;

public class Main {

    public static void main(String[] args) {
        JavaClass myObj = new JavaClass(10);
        System.out.println(myObj);

        // myObj.sum2numbers();
        myObj.sum2numbers(12);
    }

//        public static void main(String[] args) {
//
//            // System.out.println("hello horld!");
//
//            JavaClass obj = new JavaClass();
//            obj.setMyInt(10);
//            System.out.println(obj);
//            // System.out.println(obj.getClass());
//
//            /* comparacao */
//            // String otherString = "Hello World";
//            String otherString = Constants.HELLO_WORLD;
//            String myString = obj.getMyString();
//            // System.out.println(myString.trim());
//            if (otherString.equalsIgnoreCase(myString)) { // equals = compara string
//                System.out.println("Essas Strings são iguais");
//            } else {
//                System.out.println("Essas Strings não são iguais");
//            }
//
//            String substring = otherString.substring(1, 3);
//            System.out.println(substring);
//
//            /* substituicao */
//            String replace = otherString.replace("hello", "");
//            System.out.println(replace.trim()); // thim() = tira o espaco
//
//            int wo = otherString.indexOf("wo");
//            System.out.println(wo);
//
//            /* SPLIT */
//            String myOtherString = "ola rayssa tudo bom com voce";
//            String[] strings = myOtherString.split(" ");
//            for (int i = 0; i < strings.length; i++) {
//                System.out.println(strings[i]);
//            }
//        }

}