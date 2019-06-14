package com.yang.databindingdemo.util;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;

/**
 * @author yangzc
 * @data 2019/6/14 16:18
 * @desc
 */
public class CustomBinds {

    @BindingAdapter(value = {"android:imageUrl", "android:placeHolder", "android:error"}, requireAll = false)
    public static void loadImage(ImageView view, String url, Drawable error, Drawable placeHolder) {
        Glide.with(view.getContext()).load(url).error(error).centerCrop().placeholder(placeHolder).into(view);
    }

}
