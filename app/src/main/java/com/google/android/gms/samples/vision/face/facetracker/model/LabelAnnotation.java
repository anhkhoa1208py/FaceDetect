package com.google.android.gms.samples.vision.face.facetracker.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LabelAnnotation {

@SerializedName("annotation")
@Expose
private Object annotation;
@SerializedName("similarity")
@Expose
private Double similarity;

public Object getAnnotation() {
return annotation;
}

public void setAnnotation(Object annotation) {
this.annotation = annotation;
}

public Double getSimilarity() {
return similarity;
}

public void setSimilarity(Double similarity) {
this.similarity = similarity;
}

}