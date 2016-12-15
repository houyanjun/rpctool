package rpctool.bean;

/**
 * @author Administrator
 *
 */
public class TestGroupBy {
	private Integer gameId;
	private String name;
	
	
	public Integer getGameId() {
		return gameId;
	}


	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "TestGroupBy [gameId=" + gameId + ", name=" + name + "]";
	}
	
	
}
