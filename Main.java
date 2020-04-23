
public class Main {
	public static final String[] testData= {"s","1","t","2","3","s","p","p","p","s","1","2","p","p"};
	
	public static void test(String[] data,Stack s) {
		for(int i=0;i<data.length;i++) {
			String currentData=data[i];
			if(currentData.contains("s")) {
				System.out.println(s.size());
			}else if(currentData.contains("t")) {
				System.out.println(s.peek());
			}else if(currentData.contains("p")) {
				System.out.println(s.pop());
			}else{
				s.push(Integer.parseInt(currentData));
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Stack myStack=new Stack();
		test(testData,myStack);
	}
}
