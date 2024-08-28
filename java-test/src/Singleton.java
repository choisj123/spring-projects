// 자바의 디자인 패턴 중 하나인 싱글톤
// 싱글톤은 단 하나의 객체만을 생성하게 강제하는 디자인 패턴이다.
// 즉, 클래스를 통해 생성할 수 있는 객체가 한 개만 되도록 만드는 것

public class Singleton {

    private static Singleton one; // 3.
    private Singleton(){}

    // 2. Singleton 클래스의 객체를 생성하려면 이렇게 사용
    public static Singleton getInstance2(){
        return new Singleton(); // 같은 클래스이므로 생성자 호출이 가능하다.
    }

    // 3.
    public static Singleton getInstance3(){
       if(one==null){
           one = new Singleton();
       }
        return one;
    }
}

class Sample3{
    public static void main(String[] args){
//        Singleton singleton = new Singleton(); // 컴파일 오류 발생
        // private 사용하면 Singleton 클래스를 다른 클래스에서 new를 이용하여 생성할 수 없다.

        Singleton singleton2 = Singleton.getInstance2();
        // 2.
        // Singleton 클래스의 객체를 생성하려면 이렇게 사용 가능하지만
        // 이 또한 getInstance()를 호출할 때마다 새로운 객체가 생성되기 때문에 싱글톤이 아니다.

        Singleton singleton3 = Singleton.getInstance3();
        Singleton singleton3_1 = Singleton.getInstance3();
        System.out.println(singleton3 == singleton3_1); // true 출력
        // 3.
        // Singleton 클래스에 one이라는 static 변수를 작성하고, getInstance 메서드에서 one값이 null인 경우에만 객체를 생성하도록 하여 one 객체가 딱 한 번만 만들어지도록 했다.
        // 처음 getInstance가 호출되면 one이 null이므로 new에 의해서 one 객체가 생성된다. 이렇게 한 번 생성되면 one은 static 변수이기 때문에 그 이후로는 null이 아니다.
        // 이어서 다시 getInstance 메서드가 호출되면 이미 만들어진 싱글톤 객체인 one을 항상 리턴한다.

    }

}