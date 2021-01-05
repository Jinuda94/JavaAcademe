package java_1230;

public class Movie_actor extends Movie{

	Movie_actor(){
		this.movie_actor = "김진우";
	}

	@Override
	public String getMovie_name() {
		
		return movie_name;
	}

	@Override
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	@Override
	public String getMovie_RunTime() {
		
		return movie_RunTime;
	}

	@Override
	public void setMovie_RunTime(String movie_RunTime) {
		this.movie_RunTime = movie_RunTime;
	}

	@Override
	public String getMovie_actor() {
		
		return movie_actor;
	}

	@Override
	public void setMovie_actor(String movie_actor) {
		this.movie_actor = movie_actor;
	}
	
}
