package io.javabrains.ratingsdataservice.resources;

import io.javabrains.ratingsdataservice.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ratingsdataservice.models.Rating;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("550", 4),
				new Rating("400", 5),
				new Rating("500", 1)
		);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}

}
