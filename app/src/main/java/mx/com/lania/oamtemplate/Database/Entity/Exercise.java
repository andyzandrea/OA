package mx.com.lania.oamtemplate.Database.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by macbook on 27/11/17.
 */

@Entity(tableName = "exercise", indices = {@Index(value = "learning_object_id")}, foreignKeys = @ForeignKey(entity = LearningObject.class, parentColumns = "id", childColumns = "learning_object_id"))
public class Exercise {

    //TODO: Add or remove field´s for the Exercise entity

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "indication")
    private String indication;

    @ColumnInfo(name = "indication_results")
    private String indicationResults;

    @ColumnInfo(name = "image_indication")
    private String imageIndication;

    @ColumnInfo(name = "learning_object_id")
    private int learningObjectId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getIndicationResults() {
        return indicationResults;
    }

    public void setIndicationResults(String indicationResults) {
        this.indicationResults = indicationResults;
    }

    public String getImageIndication() {
        return imageIndication;
    }

    public void setImageIndication(String imageIndication) {
        this.imageIndication = imageIndication;
    }

    public int getLearningObjectId() {
        return learningObjectId;
    }

    public void setLearningObjectId(int learningObjectId) {
        this.learningObjectId = learningObjectId;
    }
}
