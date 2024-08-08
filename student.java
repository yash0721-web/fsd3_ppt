import java.io.*;
class student
{
public static void main(String args[]) throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println(" enter the Rollno,Name and Percentage--->");
 int rno=Integer.parseInt(br.readLine());
 String snm=br.readLine();
 float per=Float.parseFloat(br.readLine());
 System.out.println("student ROllno="+rno+" \t Name = "+snm+" \t Percentage="+per);
 }
 }
