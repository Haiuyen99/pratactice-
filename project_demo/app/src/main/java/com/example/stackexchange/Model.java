package com.example.stackexchange;

public class Model {
    private int imageView;
    private  String textView;
    private  String textView1;
 Model(int img, String textView, String textView1 ){
     this.imageView =img;
     this.textView= textView;
     this.textView1=textView1;

 }

    public int getimageView() {
        return imageView;
    }

    public String getTextView() {
        return textView;
    }

    public String getTextView1() {
        return textView1;
    }


}
