package java_1230;

public class Play {

	public static void main(String[] args) {
		Movie_info info = new Movie_info();
		Movie_actor actor = new Movie_actor();
		info.setMovie_name("나홀로집에 2");
		System.out.println("영화이름:"+info.movie_name);
		System.out.println("영화시간:"+info.movie_RunTime);
		System.out.println("주인공:"+actor.movie_actor);
	}

}
