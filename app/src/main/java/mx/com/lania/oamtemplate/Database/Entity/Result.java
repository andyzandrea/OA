package mx.com.lania.oamtemplate.Database.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by macbook on 21/02/18.
 */

@Entity(tableName = "result", indices = {@Index(value = "exercise_id")}, foreignKeys = @ForeignKey(entity = Exercise.class, parentColumns = "id", childColumns = "exercise_id"))
public class Result {

    //TODO: Add or remove field´s for the Result entity

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "result")
    private String result;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "exercise_id")
    private int exerciseId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }
}
