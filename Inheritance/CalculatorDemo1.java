package Inheritance;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    // 근데 위의 절차를 왜 해야하는 거지?
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator { // Cal를 하위 클래스 Sub가 확장extend(=상속)하고 있어서 Sub 얘도 Cal의 것들을 사용할 수 있다. 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator(); // 여기서 c1은 인스턴스화 된 것
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}