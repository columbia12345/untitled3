package exercise0120;

 class Outer {
    public void f(){}
    private int i =1;
     /*静态内部类和嵌套内部类的用法：
      * 这两种嵌套的做法都是为了将内部类隐藏，使得外部类以外的类无法直接使用它们
      * 但是当内部类要访问外部类的成员和方法时，就用嵌套内部类
      * 当不想让内部类访问外部类的成员和方法是，就用静态内部类*/
    public static class Inner{ //静态内部类
        public void g(){
           //静态内部类无法访问外部类的对象，
        }
        class Inner1{}
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        //静态内部类对象的创建无需外部类的对象
    }
}
//内部类生成class文件后，文件名称是外部类$内部类