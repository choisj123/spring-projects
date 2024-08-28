import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    // 스태틱 메서드는 유틸리티성 메서드를 작성할 때 많이 사용된다.
    // 유틸리티성 메서드는 특정 클래스나 인스턴스에 종속되지 않고, 재사용이 가능하고 범용 기능을 제공하는 스태틱 메서드를 말한다.
    // 이 메서드들은 코드의 중복을 줄이고 가독성을 향상시킨다.
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

class Sample2{
    public static void main(String[] args){

        // static이 아니라면 인스턴트 생성 필요
//        Util util = new Util();
//        String currentDate = util.getCurrentDate("yyyy:MM:dd");
//        System.out.println(currentDate);

        System.out.println(Util.getCurrentDate("yyyy-MM-dd"));
    }

}