package com.shrenik.example;

public class Movie {
	
	int moviecode;   // 193  42  193
	String moviename;
	int rating;
	
	public Movie()
	{}
	
	public Movie(int moviecode, String moviename, int rating) {
		super();
		this.moviecode = moviecode;
		this.moviename = moviename;
		this.rating = rating;
	}





	@Override
	public String toString() {
		return "Movie [moviecode=" + moviecode + ", moviename=" + moviename + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return moviename.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Movie another = (Movie)obj;
		if(this.moviecode == another.moviecode && this.moviename==another.moviename && this.rating==another.rating)
			return true;
		else
			return false;
	}


	
	
	

}
