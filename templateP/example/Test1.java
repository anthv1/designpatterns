package example;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("\n*** Generate CSV report ... ... ");
		
		CSVReport rep1 = new CSVReport("src/example/data.csv", true);
		rep1.genReport();
		
		System.out.println("\n*** Generate XML report ... ... ");
		
		XMLReport rep2 = new XMLReport("src/example/data.xml");
		rep2.genReport();
		
		System.out.println("----------------- ------- ");


	}

}
