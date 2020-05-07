public class CicloTres{
 public static void main(String args[]){
 //sucesion fibonacci
  int a=0, b=1, c=0;
  System.out.println("Serie con for: ");
  
  for(int i=0; i<10; i++){
   System.out.print(a + ",");
   c = a+b;
   a=b;
   b=c;
  }
  
 }
}