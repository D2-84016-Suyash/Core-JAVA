import java.util.Arrays;

public class TESTER {

	public static void main(String[] args) {
		product [] p= {
						new product(11,"s23_samsung", "mobile", 1000),
						new product(12,"ac", " ele appliances", 30000),
						new product(13,"tv", "ele appliances", 50000),
						new product(14,"iwacth", "wacth", 2500),
						new product(15,"macbookair", "laptop", 1000),
						new product(16,"earphones", "music", 1000),
						new product(17,"shoes", "lifetstyle", 1000),
						new product(18,"tshirts", "lifetstyle", 1000),
						new product(19,"iphone15pro", "mobile", 1000),
						new product(20,"sofa", "furniture", 1000),
						
		};
		
		Arrays.sort(p);
		
		for(product e:p)
			System.out.println(e);
		

	}

}
