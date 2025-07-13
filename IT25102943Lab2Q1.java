public class IT25102943Lab1Q1
{
    public static void main(String[] args)
	{ double perimeter = 100;
	  double width,length;
	  double width_ratio = 0.75;
	  length = perimeter / (2*(1+width_ratio));
	  width = width_ratio*length;
	  System.out.println("length is:" + length);
	  System.out.println("width is:" + width);
	}
}
