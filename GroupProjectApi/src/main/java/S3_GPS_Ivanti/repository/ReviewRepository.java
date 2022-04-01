package S3_GPS_Ivanti.repository;

import S3_GPS_Ivanti.model.Review;
import S3_GPS_Ivanti.model.User;


import java.util.ArrayList;

public interface ReviewRepository {

    ArrayList<Review> getReviews(String appName);

    boolean createReview(Review review);

    boolean updateReview(Review review);

    boolean deleteReview(int reviewID);
}
