package mx.com.lania.oamtemplate.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Adapter.ExpandableListAdapter;

public class MenuLessonActivity extends AppCompatActivity {

    private ExpandableListView lessonList;
    private ExpandableListAdapter lessonListAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listThemeHeader;

    public MenuLessonActivity() {
        listThemeHeader = new HashMap<>();
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lesson);
        showToolbar();
        fillThemes();
        initMenu();
        listenMenuThemeClick();
        listenMenuSubthemeClick();
    }*/

//    private void fillThemeTitles() {
//        listThemeHeader = new HashMap<>();
//        //TODO: Add themes and subthemes titles
//        listThemeHeader.put("Theme", new ArrayList<String>(){{ add("Subteme"); add("Subtheme"); }});
//        listThemeHeader.put("Antecedentes",new ArrayList<String>(){{ add("Subteme"); add("Subtheme"); }});
//        listThemeHeader.put("Antecedentes",new ArrayList<String>(){{ add("Subteme"); add("Subtheme"); }});
//
//    }

   /* private void initMenu() {
        lessonList = findViewById(R.id.theme_list);
        lessonListAdapter = new ExpandableListAdapter(this, new ArrayList<>(listThemeHeader.keySet()),listThemeHeader);
        lessonList.setAdapter(lessonListAdapter);
    }

    private void listenMenuThemeClick() {
        Intent intent = new Intent(this,LessonActivity.class);
        lessonList.setOnGroupClickListener((parent, v, groupPosition, id) -> {
            if (parent.getExpandableListAdapter().getChildrenCount(groupPosition) == 0) {
                switch (groupPosition) {
                    case 0:
                        intent.putExtra("LESSON_TITLE", "Antecedentes ");
                        intent.putExtra("LESSON_HTML", "Background/antecedentes.html");
                        break;
                    case 1:
                        intent.putExtra("LESSON_TITLE", "5.- Inventarios");
                        intent.putExtra("LESSON_HTML", "Introduction/Introduction.html");
                        break;

                }
                startActivity(intent);
            } else {
                if (parent.isGroupExpanded(groupPosition))
                    parent.collapseGroup(groupPosition);
                else
                    parent.expandGroup(groupPosition);
            }
            return true;
        });
    }

    private void listenMenuSubthemeClick(){
        Intent intent = new Intent(this,LessonActivity.class);
        lessonList.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            if (groupPosition == 2) {
                switch (childPosition) {
                    case 0:
                        // por dentro
                        intent.putExtra("LESSON_TITLE", "Concepto y características según NIF C-4 del IMCP");
                        intent.putExtra("LESSON_HTML", "SubtemaUno/ImmediateDependenceRelationship.html");
                        break;
                    case 1:
                        intent.putExtra("LESSON_TITLE", "Registro, auxiliares e informes aplicables a los inventarios.");
                        intent.putExtra("LESSON_HTML", "SubtemaDos/ImmediateDependenceRelationship.html");
                        break;
                    case 2:
                        intent.putExtra("LESSON_TITLE", "El procedimiento de inventarios perpetuos");
                        intent.putExtra("LESSON_HTML", "SubtemaTres/ImmediateDependenceRelationship.html");
                        break;
                    case 3:
                        intent.putExtra("LESSON_TITLE", "El procedimiento de inventarios periódicos");
                        intent.putExtra("LESSON_HTML", "SubtemaCuatro/ImmediateDependenceRelationship.html");
                        break;
                    case 4:
                        intent.putExtra("LESSON_TITLE", "Método del Promedio");
                        intent.putExtra("LESSON_HTML", "SubtemaSieteMetodo/ImmediateDependenceRelationship.html");
                        break;
                    case 5:
                        intent.putExtra("LESSON_TITLE", "Reglas de presentación de inventarios y normas de control interno");
                        intent.putExtra("LESSON_HTML", "Subtemaonce/ImmediateDependenceRelationship.html");
                        break;
                }
                startActivity(intent);
            }
            return true;
        });
    }
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lesson);
        showToolbar();
        lessonList = findViewById(R.id.theme_list);
        fillThemes();
        Intent intent = new Intent(MenuLessonActivity.this, LessonActivity.class);
        lessonListAdapter = new ExpandableListAdapter(this, listDataHeader, listThemeHeader);
        lessonList.setAdapter(lessonListAdapter);
        lessonList.setOnGroupClickListener((parent, v, groupPosition, id) -> {
            if (parent.getExpandableListAdapter().getChildrenCount(groupPosition) == 0) {
                switch (groupPosition) {
                    case 0:

                        intent.putExtra("LESSON_TITLE", "Inventarios");
                        intent.putExtra("LESSON_HTML", "Introduction/Introduction.html");
                        break;

                }
                startActivity(intent);
            } else {
                if (parent.isGroupExpanded(groupPosition))
                    parent.collapseGroup(groupPosition);
                else
                    parent.expandGroup(groupPosition);
            }
            return true;
        });
        lessonList.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            if (groupPosition == 1) {
                switch (childPosition) {
                    case 0:
                        // por dentro
                        intent.putExtra("LESSON_TITLE", "Concepto y características según NIF C-4 del IMCP");
                        intent.putExtra("LESSON_HTML", "SubtemaUno/ImmediateDependenceRelationship.html");
                        break;
                    case 1:
                        intent.putExtra("LESSON_TITLE", "Registro, auxiliares e informes aplicables a los inventarios.");
                        intent.putExtra("LESSON_HTML", "SubtemaDos/ImmediateDependenceRelationship.html");
                        break;
                    case 2:
                        intent.putExtra("LESSON_TITLE", "El procedimiento de inventarios perpetuos");
                        intent.putExtra("LESSON_HTML", "SubtemaTres/ImmediateDependenceRelationship.html");
                        break;
                    case 3:
                        intent.putExtra("LESSON_TITLE", "El procedimiento de inventarios periódicos");
                        intent.putExtra("LESSON_HTML", "SubtemaCuatro/ImmediateDependenceRelationship.html");
                        break;
                    case 4:
                        intent.putExtra("LESSON_TITLE", "Método del Promedio");
                        intent.putExtra("LESSON_HTML", "SubtemaSieteMetodo/ImmediateDependenceRelationship.html");
                        break;
                    case 5:
                        intent.putExtra("LESSON_TITLE", "Reglas de presentación de inventarios y normas de control interno");
                        intent.putExtra("LESSON_HTML", "Subtemaonce/ImmediateDependenceRelationship.html");
                        break;
                }
                startActivity(intent);
            }
            return true;
        });
    }

    private void fillThemes() {
        listDataHeader = new ArrayList<>();
        listThemeHeader = new HashMap<>();
        listDataHeader.add("Introducción a inventarios");
        listDataHeader.add("Subtemas");
        List<String> listTheme3 = new ArrayList<>();
        listTheme3.add("5.1 Concepto y características según NIF C-4 del IMCP");
        listTheme3.add("5.2 Registro, auxiliares e informes aplicables a los inventarios.");
        listTheme3.add("5.3 El procedimiento de inventarios perpetuos");
        listTheme3.add("5.4 El procedimiento de inventarios periódicos");
        listTheme3.add("5.7 Método del Promedio");
        listTheme3.add("5.11 Reglas de presentación de inventarios y normas de control interno");
        listThemeHeader.put(listDataHeader.get(0), null);

        listThemeHeader.put(listDataHeader.get(1), listTheme3); // se agrega a subtemas la sublista de subtemas

    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
