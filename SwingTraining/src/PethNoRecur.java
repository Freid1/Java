import java.io.File;
import java.util.*;

public class PethNoRecur {
    public static void main(String[] args) {
        String root="D:/";

        List<String> absolutPath=new LinkedList<>();
        Queue<File> fileQueue=new PriorityQueue<>();

        File file=new File(root);

        Collections.addAll(fileQueue,file.listFiles());

        while (!fileQueue.isEmpty()){
            File remFile=fileQueue.remove();
            if (remFile.isDirectory()){
                Collections.addAll(fileQueue,remFile.listFiles());
            }
            else{
                absolutPath.add(remFile.getAbsolutePath());
            }
        }

        for (String s : absolutPath) {
            System.out.println(s);
        }


    }
}
