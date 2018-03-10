package common;

//万年蒙逼的 方法调用。
public class JavaQuestionTwo {
    public  static  void main(String[] args){
        A a = new B();
        a.pWapper();
    }
}
    class A {
        private void  print(){
            System.out.println("A print");
        }
        public void pWapper(){
            print();
        }
    }

    class B extends A {
        private  void  print(){
            System.out.println("B print");
        }
    }

