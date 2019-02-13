package mx.com.lania.oamtemplate.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "example", indices = {@Index(value = "learning_object_id")}, foreignKeys = @ForeignKey(entity = LearningObject.class, parentColumns = "id", childColumns = "learning_object_id"))
public class Example {

    //TODO: Add or remove field´s for the Example entity

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "content")
    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLearningObjectId() {
        return learningObjectId;
    }

    public void setLearningObjectId(int learningObjectId) {
        this.learningObjectId = learningObjectId;
    }
}
