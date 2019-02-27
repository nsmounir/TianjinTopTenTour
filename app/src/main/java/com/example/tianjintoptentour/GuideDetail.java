package com.example.tianjintoptentour;

public class GuideDetail {
    private String mGuideDetailTitle;
    private String mGuideDetailBody;

    private int mGuideDetailImage;


    public GuideDetail(String guideDetailTitle, String guideDetailBody, int guideDetailImage) {

        mGuideDetailTitle = guideDetailTitle;
        mGuideDetailBody = guideDetailBody;
        mGuideDetailImage = guideDetailImage;


    }

    public String getGuideDetailTitle() {
        return mGuideDetailTitle;
    }

    public String getGuideDetailBody() {
        return mGuideDetailBody;
    }

    public int getGuideDetailImage() {
        return mGuideDetailImage;
    }
}



