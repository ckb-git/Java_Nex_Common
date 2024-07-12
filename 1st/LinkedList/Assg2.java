package LinkedList;
import java.util.*;
class Book
{
	int bookId;
	String author;
	String bookname;
	Book(int bookId,String author,String bookname)
	{
		this.bookId=bookId;
		this.author=author;
		this.bookname=bookname;
	}
}
public class Assg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Book> L1=new LinkedList<>();
		Book B1= new Book(12,"S.Chand","M1");
		Book B2= new Book(13,"S.Chand","EM");
		Book B3= new Book(14,"S.Chand","TE");
		
		L1.add(B1);
		L1.add(B2);
		L1.add(B3);
		for(Book b:L1)
		{
			System.out.println(b.bookId+" "+b.author+" "+b.bookname);
		}
	}

}
