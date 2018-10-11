
public class CSX_351_HW7_16103080 {
	public static void main(String[] args) throws MyException, IndexException{
		Student s = new Student(1);
		s.input(0);
//		Student s = new Student(2);
//		for(int i=0; i<2; i++) {
//			s.input(i);
////			catch(MyException e) {
////				System.out.println(e);
////			}
////			catch(IndexException e) {
////				System.out.println(e);
////			}
//		}
//		for(int i=0; i<2; i++){
//			System.out.println(s.getName(i));
//			System.out.println(s.getGrade(i));
//		}
		System.out.println(s.getAvg(0));
		System.out.println(s.getGrade(0));
	}
}