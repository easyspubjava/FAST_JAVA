package chapter10;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.day == date.day && this.year == date.year && this.month == date.month)
				return true;
			return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return day*11 +  month*101+ year * 1001;
	}

}


public class MyDateTest {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);
		
		System.out.println(date1.equals(date2));
	}

}
