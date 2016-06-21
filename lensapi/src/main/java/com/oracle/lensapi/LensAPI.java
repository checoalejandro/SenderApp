package com.oracle.lensapi;

import android.content.ClipData;
import android.content.ClipDescription;
import android.view.View;

import com.oracle.lensapi.models.JsonData;

/**
 * Created by seacosta on 16/05/2016.
 */
public class LensAPI {

    /**
     * On long click, start this method using the view supposed
     * to start the drag.
     * @param view
     * @param jsonData
     */
    public static void startDrag(View view, JsonData jsonData){
        ClipData.Item item = new ClipData.Item((CharSequence) view.getTag());
        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
        ClipData dragData = new ClipData(view.getTag().toString(), mimeTypes, item);
        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
        view.startDragAndDrop(dragData, shadowBuilder, null, View.DRAG_FLAG_GLOBAL);
    }

}
