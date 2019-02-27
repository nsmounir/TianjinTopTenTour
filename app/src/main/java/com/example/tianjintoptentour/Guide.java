package com.example.tianjintoptentour;

public class Guide  {
    private int mGuideImage = NO_IMAGE_PROVIDED;
    private String mGuideText;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Guide (int guideImage, String guideText){

        mGuideImage = guideImage;
        mGuideText = guideText;


    }

    public int getGuideImage () {return mGuideImage;}

    public String getGuideText(){
        return mGuideText;
    }


    public boolean hasImage(){
        return mGuideImage != NO_IMAGE_PROVIDED;


    }
}



