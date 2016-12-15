package rpctool;

import java.util.ArrayList;
import java.util.List;

import rpctool.bean.TestGroupBy;

public class Test {
	public static void main(String[] args) {
		TestGroupBy testGroupBy = new TestGroupBy();
		testGroupBy.setGameId(12345);
		testGroupBy.setName("HOU");

		List<TestGroupBy> testGroupByList = new ArrayList<TestGroupBy>();
		testGroupByList.stream().filter(e -> test(e));
	}

	public static boolean test(TestGroupBy testGroupBy) {
		if (testGroupBy.getGameId() == 123456) {
			return true;
		}
		return false;
	}
}
