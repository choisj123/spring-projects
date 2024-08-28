import house.houseChoi;

// private < default < protected < public
// private : 해당 클래스 안에서만
// default : 동일한 패키지
// protected : 동일 패키지의 클래스 또는 해당 클래스를 상속받은 클래스
public class ProtectTest {
    public static void main(String[] args){
        houseChoi choi = new houseChoi();
        System.out.println(choi.info);
    }

}
