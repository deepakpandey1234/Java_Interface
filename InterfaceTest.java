public class InterfaceTest {
    interface  InterfaceA {
         int  len =  1 ;
         void  output();
    }

    interface  InterfaceB {
           int  len =  2 ;
           void  output();
    }

    interface  InterfaceSub  extends  InterfaceA, InterfaceB {            }

    public class Xyz implements  InterfaceSub {

         public   void  output() {
            System.out.println( "output in class Xyz." );
        }

          public   void  outputLen(int  type) {
              switch (type) {
                      case  InterfaceA.len:
                             System.out.println( "len of InterfaceA=." +type);
                              break ;
                      case  InterfaceB.len:
                             System.out.println( "len of InterfaceB=." +type);
                              break ;
             }
        }
    }
            
    public   static   void  main(String[] args) {
           Xyz xyz = new InterfaceTest().new Xyz();
           xyz.output();
           xyz.outputLen(1);
   }
}
