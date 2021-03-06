/*
 *
 *  * Copyright (C) 2015 Eason.Lai (easonline7@gmail.com)
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.pizidea.imagepicker;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.yzh.mylibrary.R;

import java.io.File;

/**
 * <b>desc your class</b><br/>
 * Created by Eason.Lai on 2015/11/1 10:42 <br/>
 * contact：easonline7@gmail.com <br/>
 */
public class GlideImagePresenter implements ImagePresenter{
    @Override
    public void onImage(ImageView imageView, String imageUri) {

    }

    @Override
    public void onPresentImage(ImageView imageView, String imageUri) {

    }

    @Override
    public void onPresentImage(ImageView imageView, String imageUri, int size) {
        Glide.with(imageView.getContext())
                .load(new File(imageUri))
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                //.dontAnimate()
                .thumbnail(0.5f)
                .override(size/4*3, size/4*3)
                .placeholder(R.drawable.default_img)
                .error(R.drawable.default_img)
                .into(imageView);

    }

    @Override
    public void onPresentCircleImage(ImageView imageView, String imageUri, int size) {

    }

    @Override
    public void displayCircleDrawable(int resId, ImageView imageView) {

    }

}
