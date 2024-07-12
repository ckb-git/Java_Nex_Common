package LinkedList;
import java.util.*;
class Book1
{
	int bookId;
	String author;
	String bookname;
	Book1(int bookId,String author,String bookname)
	{
		this.bookId=bookId;
		this.author=author;
		this.bookname=bookname;
	}
}
public class Assg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Book1> L1=new HashSet<>();
		Book1 B1= new Book1(12,"S.Chand","M1");
		Book1 B2= new Book1(13,"S.Chand","EM");
		Book1 B3= new Book1(14,"S.Chand","TE");
		
		L1.add(B1);
		L1.add(B2);
		L1.add(B3);
		for(Book1 b:L1)
		{
			System.out.println(b.bookId+" "+b.author+" "+b.bookname);
		}
	}

}
