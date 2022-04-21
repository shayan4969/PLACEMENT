/*class shayan{
  int factorial(int n){
    int a=1;
    for(int i=2;i<=n;i++){
      a=a*i;
    }
    return a;
  }
}*/
class shayan{
  int factorial(int n){
    if (n==0){
      return 1;
    }
    else{
      return n*factorial(n-1);
    }
  }
}
class Main {
  public static void main(String[] args) {
    shayan s= new shayan();
    int c= s.factorial(10);
    System.out.print(c);
    }
}