package com.laioffer.tinnews.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.laioffer.tinnews.model.Article;

// db 是app层面上的东西
@Database(entities = {Article.class}, version = 1, exportSchema = false) // schema不export出去
public abstract class TinNewsDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao(); // We do not implement it the Room annotation processor will.

}
