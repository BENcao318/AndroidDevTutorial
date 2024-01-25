package eu.tutorials.shoppinglist

import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApiService {
//https://maps.googleapis.com/maps/api/geocode/json?latlng=7.9839,-121.2284&key=AIzaSyCy99qA8pzKmXiv4HKhZ-BSKIjZD5cgUYc
    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latlng: String,
        @Query("key") apiKey: String
    ): GeocodingResponse
}