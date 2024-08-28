public class Counter {
    static int count = 0; // static 붙임으로써 공유 되어 count 값 증가됨
                          // 공유 목적, 메모리 효율 증가
    Counter(){
        count++;
        System.out.println(count);
    }

    protected static int getCount(){
        return count;
        // 스태틱 메서드 안에서는 객체 변수 접근이 불가능하다.
        // 이 예에서는 count 변수가 static 변수이기 때문에 스태틱 메서드에서 접근이 가능하다.
    }

}

class Sample {
    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println("최종 값 : " + Counter.getCount());
    }
}