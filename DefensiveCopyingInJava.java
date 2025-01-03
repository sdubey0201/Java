import java.util.ArrayList;
import java.util.List;

public class DefensiveCopyingInJava {
    private  List<String> data;

    public DefensiveCopyingInJava(List<String> data) {
        this.data = new ArrayList<>(data);
    }

    public List<String> getData() {
        return new ArrayList<>(this.data);
    }

    public void setData(List<String> data) {
        this.data = new ArrayList<>(data);
    }

    public static void main(String[] args) {
     List<String> data = new ArrayList<>();
     data.add("hello");
     data.add("world");
     DefensiveCopyingInJava defensiveCopyingInJava = new DefensiveCopyingInJava(data);
     List<String> data1 = defensiveCopyingInJava.getData();
     data1.add("Java");
        System.out.println(data);
        System.out.println(data1);
//        [hello, world]
//        [hello, world, Java]

    }
}
