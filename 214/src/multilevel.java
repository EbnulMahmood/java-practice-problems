public class multilevel {

public static void main(String[] args) {
int[] course = new int[10];
try{
System.out.println("Outer try");
try{
System.out.println( "Start Change" );
course[ 10 ] = 1;
System.out.println( "End Change" );
} catch(NumberFormatException e) {
	System.out.println( "Inner Catch: " + e.getMessage());
}
finally{
	System.out.println("Inner Finally");
}
}catch (ArrayIndexOutOfBoundsException e) {
	System.out.println( "Outer Catch: " + e.getMessage());
}finally{
	System.out.println("Outer Finally");
}
}
}
