package com.awakhiwe.smartpantrymanager.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Data Access Object: the CRUD operations for pantry ingredients.
 */
@Dao
public interface IngredientDao {

    @Insert
    long insert(Ingredient ingredient);            // Create

    @Query("SELECT * FROM ingredients ORDER BY name ASC")
    List<Ingredient> getAll();                     // Read (list)

    @Query("SELECT * FROM ingredients WHERE id = :id")
    Ingredient getById(int id);                    // Read (one item, for editing)

    @Update
    void update(Ingredient ingredient);            // Update

    @Delete
    void delete(Ingredient ingredient);            // Delete
}