package com.google.android.gms.samples.vision.face.facetracker.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

@SerializedName("labelAnnotations")
@Expose
private List<LabelAnnotation> labelAnnotations = null;

public List<LabelAnnotation> getLabelAnnotations() {
return labelAnnotations;
}

public void setLabelAnnotations(List<LabelAnnotation> labelAnnotations) {
this.labelAnnotations = labelAnnotations;
}

}