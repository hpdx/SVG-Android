package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_speaker_phone extends SVGRenderer {

    public ic_speaker_phone(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(7.0f, 7.07f);
        mPath.lineTo(8.43f, 8.5f);
        mPath.rCubicTo(0.91f, -0.91f, 2.18f, -1.48f, 3.57f, -1.48f);
        mPath.rCubicTo(1.3899994f, 0.0f, 2.66f, 0.57f, 3.57f, 1.48f);
        mPath.lineTo(17.0f, 7.07f);
        mPath.cubicTo(15.72f, 5.79f, 13.95f, 5.0f, 12.0f, 5.0f);
        mPath.rCubicTo(-1.9499998f, 0.0f, -3.72f, 0.79f, -5.0f, 2.07f);
        mPath.close();
        mPath.moveTo(7.0f, 7.07f);
        mPath.moveTo(12.0f, 1.0f);
        mPath.cubicTo(8.98f, 1.0f, 6.24f, 2.23f, 4.25f, 4.21f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.cubicTo(7.28f, 4.0f, 9.53f, 3.0f, 12.0f, 3.0f);
        mPath.rCubicTo(2.4700003f, 0.0f, 4.72f, 1.0f, 6.34f, 2.62f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.cubicTo(17.76f, 2.23f, 15.02f, 1.0f, 12.0f, 1.0f);
        mPath.close();
        mPath.moveTo(12.0f, 1.0f);
        mPath.rMoveTo(2.86f, 9.01f);
        mPath.lineTo(9.14f, 10.0f);
        mPath.cubicTo(8.51f, 10.0f, 8.0f, 10.51f, 8.0f, 11.14f);
        mPath.rLineTo(0f, 9.71f);
        mPath.rCubicTo(0.0f, 0.63f, 0.51f, 1.14f, 1.14f, 1.14f);
        mPath.rLineTo(5.71f, 0f);
        mPath.rCubicTo(0.63f, 0.0f, 1.14f, -0.51f, 1.14f, -1.14f);
        mPath.rLineTo(0f, -9.71f);
        mPath.rCubicTo(0.01f, -0.63f, -0.5f, -1.13f, -1.13f, -1.13f);
        mPath.close();
        mPath.moveTo(14.86f, 10.01f);
        mPath.moveTo(15.0f, 20.0f);
        mPath.lineTo(9.0f, 20.0f);
        mPath.rLineTo(0f, -8.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.rLineTo(0f, 8.0f);
        mPath.close();
        mPath.moveTo(15.0f, 20.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}