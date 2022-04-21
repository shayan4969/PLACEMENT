class shayan{
  int count(int x){
    int a=0;
    while(x>0){
      x=x/10;
      a++;
    }
    return a;
  }
}
class Main {
  public static void main(String[] args) {
     shayan s=new shayan();
    int c=s.count(3456);
    System.out.print(c);
  }
}