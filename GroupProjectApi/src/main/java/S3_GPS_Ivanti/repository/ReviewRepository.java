package S3_GPS_Ivanti.repository;

<<<<<<< HEAD:GroupProjectApi/src/main/java/S3_GPS_Ivanti/repository/ReviewRepository.java
import S3_GPS_Ivanti.model.Review;
import S3_GPS_Ivanti.model.User;
=======

import com.example.S3_GPS_Ivanti.model.*;
>>>>>>> 75208ff8c276fbe9838fb7b8e36d120aec7926ff:GroupProjectApi/src/main/java/com/example/S3_GPS_Ivanti/repository/ReviewRepository.java

import java.util.ArrayList;

public interface ReviewRepository {

    ArrayList<Review> getReviews(String appName);

    boolean createReview(Review review);

    boolean updateReview(Review review);

    boolean deleteReview(int reviewID);
}
