// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.android_webview;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/**
 * An interface that defines a subset of the {@link View} functionality.
 *
 * <p>This interface allows us to hook up drawing and input related methods to the
 * {@link AwContents}'s consumer in embedded mode, and to the {@link FullScreenView}
 * in fullscreen mode.
 */
interface AwViewMethods {

    /**
     * @see View#onDraw
     */
    void onDraw(Canvas canvas);

    /**
     * @see View#onMeasure
     */
    void onMeasure(int widthMeasureSpec, int heightMeasureSpec);

    /**
     * @see View#requestFocus
     */
    void requestFocus();

    /**
     * @see View#setLayerType
     */
    void setLayerType(int layerType, Paint paint);

    /**
     * @see View#onCreateInputConnection
     */
    InputConnection onCreateInputConnection(EditorInfo outAttrs);

    /**
     * @see View#onDragEvent
     */
    boolean onDragEvent(DragEvent event);

    /**
     * @see View#onKeyUp
     */
    boolean onKeyUp(int keyCode, KeyEvent event);

    /**
     * @see View#dispatchKeyEvent
     */
    boolean dispatchKeyEvent(KeyEvent event);

    /**
     * @see View#onTouchEvent
     */
    boolean onTouchEvent(MotionEvent event);

    /**
     * @see View#onHoverEvent
     */
    boolean onHoverEvent(MotionEvent event);

    /**
     * @see View#onGenericMotionEvent
     */
    boolean onGenericMotionEvent(MotionEvent event);

    /**
     * @see View#onConfigurationChanged
     */
    void onConfigurationChanged(Configuration newConfig);

    /**
     * @see View#onAttachedToWindow
     */
    void onAttachedToWindow();

    /**
     * @see View#onDetachedFromWindow
     */
    void onDetachedFromWindow();

    /**
     * @see View#onWindowFocusChanged
     */
    void onWindowFocusChanged(boolean hasWindowFocus);

    /**
     * @see View#onFocusChanged
     */
    void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect);

    /**
     * @see View#onSizeChanged
     */
    void onSizeChanged(int w, int h, int ow, int oh);

    /**
     * @see View#onVisibilityChanged
     */
    void onVisibilityChanged(View changedView, int visibility);

    /**
     * @see View#onWindowVisibilityChanged
     */
    void onWindowVisibilityChanged(int visibility);

    /**
     * @see View#onScrollChanged
     */
    void onContainerViewScrollChanged(int l, int t, int oldl, int oldt);

    /**
     * @see View#onOverScrolled
     */
    void onContainerViewOverScrolled(
            int scrollX, int scrollY, boolean clampedX, boolean clampedY);

    /**
     * @see View#computeHorizontalScrollRange
     */
    int computeHorizontalScrollRange();

    /**
     * @see View#computeHorizontalScrollOffset
     */
    int computeHorizontalScrollOffset();

    /**
     * @see View#computeVerticalScrollRange
     */
    int computeVerticalScrollRange();

    /**
     * @see View#computeVerticalScrollOffset
     */
    int computeVerticalScrollOffset();

    /**
     * @see View#computeVerticalScrollExtent
     */
    int computeVerticalScrollExtent();

    /**
     * @see View#computeScroll
     */
    void computeScroll();
}
