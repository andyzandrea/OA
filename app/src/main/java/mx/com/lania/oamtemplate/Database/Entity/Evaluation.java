package mx.com.lania.oamtemplate.Database.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by macbook on 27/11/17.
 */

@Entity(tableName = "evaluation", indices = {@Index(value = "learning_object_id")}, foreignKeys = @ForeignKey(entity = LearningObject.class, parentColumns = "id", childColumns = "learning_object_id"))
public class Evaluation {

    //TODO: Add or remove field´s for the Evaluation entity

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "correct_answer")
    private int correctAnswers;

    @ColumnInfo(name = "learning_object_id")
    private int learningObjectId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getLearningObjectId() {
        return learningObjectId;
    }

    public void setLearningObjectId(int learningObjectId) {
        this.learningObjectId = learningObjectId;
    }
}
