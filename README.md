### Introduction
A count down text view extends textView

### Preview
![](/art/device-2016-04-30-000549.png)

### Usage
``` java
        //custom your typeface
        Typeface mTypeface = Typeface.createFromAsset(this.getAssets(), "fonts/wawa.ttf");
        mTv.setTypeface(mTypeface);

        //set count number
        mTv.setCount(20);

        //set top and bottom color as the basis of the gradient
        mTv.setTopColor(Color.RED);
        mTv.setBottomColor(Color.GREEN);

        //start count
        mTv.run();

        //count pause
        mTv.pause();

        //stop count,and reset count number
        mTv.reset();
```