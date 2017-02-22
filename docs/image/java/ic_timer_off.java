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
public class ic_timer_off extends SVGRenderer {

    public ic_timer_off(Context context) {
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
        
        mPath.moveTo(19.04f, 4.55f);
        mPath.rLineTo(-1.42f, 1.42f);
        mPath.cubicTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        mPath.rCubicTo(-1.83f, 0.0f, -3.53f, 0.55f, -4.95f, 1.48f);
        mPath.rLineTo(1.46f, 1.46f);
        mPath.cubicTo(9.53f, 6.35f, 10.73f, 6.0f, 12.0f, 6.0f);
        mPath.rCubicTo(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        mPath.rCubicTo(0.0f, 1.27f, -0.35f, 2.47f, -0.94f, 3.49f);
        mPath.rLineTo(1.45f, 1.45f);
        mPath.cubicTo(20.45f, 16.53f, 21.0f, 14.83f, 21.0f, 13.0f);
        mPath.rCubicTo(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        mPath.rLineTo(1.42f, -1.42f);
        mPath.rLineTo(-1.41f, -1.42f);
        mPath.close();
        mPath.moveTo(19.04f, 4.55f);
        mPath.moveTo(15.0f, 1.0f);
        mPath.lineTo(9.0f, 1.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.lineTo(15.0f, 1.0f);
        mPath.close();
        mPath.moveTo(15.0f, 1.0f);
        mPath.rMoveTo(-4.0f, 8.44f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.lineTo(13.0f, 8.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 1.44f);
        mPath.close();
        mPath.moveTo(11.0f, 9.44f);
        mPath.moveTo(3.02f, 4.0f);
        mPath.lineTo(1.75f, 5.27f);
        mPath.lineTo(4.5f, 8.03f);
        mPath.cubicTo(3.55f, 9.45f, 3.0f, 11.16f, 3.0f, 13.0f);
        mPath.rCubicTo(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        mPath.rCubicTo(1.84f, 0.0f, 3.55f, -0.55f, 4.98f, -1.5f);
        mPath.rLineTo(2.5f, 2.5f);
        mPath.rLineTo(1.27f, -1.27f);
        mPath.rLineTo(-7.71f, -7.71f);
        mPath.lineTo(3.02f, 4.0f);
        mPath.close();
        mPath.moveTo(3.02f, 4.0f);
        mPath.moveTo(12.0f, 20.0f);
        mPath.rCubicTo(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        mPath.rCubicTo(0.0f, -1.28f, 0.35f, -2.48f, 0.95f, -3.52f);
        mPath.rLineTo(9.56f, 9.56f);
        mPath.rCubicTo(-1.03f, 0.61f, -2.23f, 0.96f, -3.51f, 0.96f);
        mPath.close();
        mPath.moveTo(12.0f, 20.0f);
        
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