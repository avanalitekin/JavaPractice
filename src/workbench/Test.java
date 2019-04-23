package workbench;




public class Test {
	public static void main(String[] args) {
		String dburl="jdbc:oracle:thin:@35.182.169.110:1521:xe";
		String dburl2="jdbc:oracle:thin:@35.182.169.110:1521:xe";
		System.out.println(dburl.equals(dburl2));
		
		String postgreurl="jdbc:postgresql://mypostgresqldb.cvo9fvyryw8d.ca-central-1.rds.amazonaws.com:5432/mypostgresqldb";
		String postgreurl2="jdbc:postgresql://mypostgresqldb.cvo9fvyryw8d.ca-central-1.rds.amazonaws.com:5432/mypostgresqldb";
		System.out.println(postgreurl.equals(postgreurl2));
	}
	
}