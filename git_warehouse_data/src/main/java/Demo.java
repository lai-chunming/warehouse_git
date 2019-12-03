
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set set = new HashSet();
        while (set.size() < 6) {
            int num=(int)(Math.random()*31 +1);
            set.add(num);
        }
        int blueBall = (int) (Math.random() * 15 + 1);
        System.out.println("redBall="+set +"\t"+"blueBall="+blueBall);
        }
}
