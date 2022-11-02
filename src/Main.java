import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.*;

public class Main {
    private static ArrayList<Object> ArrayUtils;

    public static void main(String[] args) {
        // Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки обьеденить в одну.
        //Дубли удалил,обьеденил 2 способами, в конце прописал через заглавные и прописью.

        String[] Ser = new String[]{"Иванов", "Юра", "Юра", "дом", "Иван", "Иванович", "Иванов", "Иван", "Иванович"};

        String[] result = new HashSet<String>(Arrays.asList(Ser)).toArray(new String[0]);

        String delimiter = "";
        String rten = String.join(delimiter, result);

        String name = String.join("", Arrays.asList(Arrays.copyOf(result, result.length)));

        System.out.println(Arrays.toString(result));
        System.out.println(name);
        System.out.println(rten);


        String name1 = name.toUpperCase();
        System.out.println(name1);
        String name2 = name.toLowerCase();
        System.out.println(name2);

}}



















