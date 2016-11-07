package thebigbang.com.icare.testData;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ericzhong on 30/10/16.
 */

public class ListingData {


    @SerializedName("ListingId")
    private int listingId;
    @SerializedName("Title")
    private String title;
    @SerializedName("Category")
    private String category;
    @SerializedName("ViewCount")
    private int viewCount;
    @SerializedName("RegionId")
    private int regionid;

    public void Listing(int listingId, String title, String category, int viewCount, int regionid) {
        this.listingId = listingId;
        this.title = title;
        this.category = category;
        this.viewCount = viewCount;
        this.regionid = regionid;
    }

    public int getListingId() {
        return listingId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }
}
