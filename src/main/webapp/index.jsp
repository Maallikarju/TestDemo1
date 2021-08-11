<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Scanner"%>

<html>
<body>
<h1>Hello World!

	<br>	TestDemo1 <br>

Hello Hcl How are you.
</h1>
<%
Scanner sc=new Scanner(System.in);
out.println("Enter you Name");
String Name=sc.nextLine();
out.println("Hello " +Name+ "\nEnter you age");
int num =sc.nextInt();
if (num<=17) {
	out.println("Hi "+Name+ "\nYou are not Eligible for vote");
} else {
	out.println("Hi "+Name+ "\nYou are  Eligible for vote");
}
out.println("ok");%>
</body>
</html>

