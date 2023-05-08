
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class DeletionOfDuplicateWords_Filing {

    public static String[] replaceCommaTypeSymbols(String s1, String s2) {
        s1 = s1.replaceAll(",", "");
        //s1 = s1.replaceAll(".", "");
        s2 = s2.replaceAll(",", "");
        //s2 = s2.replaceAll(".", "");
        String[]arr=new String[2];
        arr[0]=s1;
        arr[1]=s2;
        return arr;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(
                "E:\\BSCS_III\\Data_Structures_And_Algorithms\\Second_Mid_Tasks\\text.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            //System.out.println(st);

            String[] arr = st.split(" ");
            /*String[] array = new String[10];
            int index = -1;
            HashSet<String> hs = new HashSet<String>();
            for (int i = 0; arr.length > i; i++) {
                if (hs.add(arr[i])) {
                    array[++index] = arr[i];
                }
            }*/
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; arr.length > j; j++) {
                     String[]array=replaceCommaTypeSymbols(arr[i],arr[j]);
                     arr[i]=array[0];
                     arr[j]=array[1];
                    if (arr[i].equals(arr[j])) {
                        arr[i] = "1";
                    }
                }
            }

            StringBuilder sentence = new StringBuilder();

            for (int i = 0; arr.length > i; i++) {
                if (arr[i] != "1") {
                    sentence.append(arr[i] + " ");
                }
            }
            String[] array = sentence.toString().split(" ");
            for (int i = 0; array.length > i; i++) {
                if (array[i] != null) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
        }

    }
}
