
public class J015_String_Methods {

    public static void main(String[] args) {

        // String = a reference data type that can store one or more characters
        // reference data types have access to useful methods

        String name = "Bro";

        // boolean result = name.equalsIgnoreCase("bro"); // true
        // int result = name.length(); // 3
        // char result = name.charAt(0); // B
        // int result = name.indexOf("B"); // 0
        // boolean result = name.isEmpty(); // si esta vacio
        // String result = name.toUpperCase(); // Las hace mayusculas
        // String result = name.toLowerCase(); // Las hace minusculas
        // String result = name.trim(); // Elimina los espacios en blanco
        String result = name.replace('o', 'a'); // Reemplaza los caracteres

        System.out.println(result);
    }

}