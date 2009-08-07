
 
  
  class B extends A
 {
  static {
   System.out.println("B in Static");
   }
   B()
   {
   System.out.println("B Cons");
   }
  }
  class A
 {
  static {
   System.out.println("A in Static");
   }
   A()
   {
   System.out.println("A Cons");
   }
  }
  class c
  {
   public static void main(String args[])
   {
		B b = new B();
	}
	}