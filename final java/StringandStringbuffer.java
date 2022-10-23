//to show use of string and string buffer class
class StringandStringbuffer
{
	public static void main(String ar[])
	{
		//setCharAt()
		StringBuffer sb=new StringBuffer("abc");
		System.out.println("string : "+sb);
		sb.setCharAt(1,'x');
		System.out.println("new string : "+sb);
		
		//setLength()
		System.out.println("length : "+sb.length());
		sb.setLength(7);
		System.out.println("new length : "+sb.length());
		
		//append()
		sb.append("de");
		System.out.println("new string : "+sb);
		
		//insert()
		sb.insert(1,"java");
		System.out.println("new string : " + sb);
		
		//concat()
		String a1="hello";
		String a2="java";
		String a3=a1.concat(a2);
		System.out.println(a3);
		
		//equals()
		System.out.println(a1.equals(a2));

	}
}
