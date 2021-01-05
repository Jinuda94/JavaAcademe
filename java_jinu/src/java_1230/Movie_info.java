package java_1230;

public class Movie_info extends Movie {

	Movie_info(){
		this.movie_name = "나홀로 집에";
		this.movie_RunTime = "105분";
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
