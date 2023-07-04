package csv.masters.mynotes.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import csv.masters.mynotes.databinding.ActivityMyNotesBinding

class MyNotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyNotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    // TODO: Task1 - Create an ActivityResultLauncher object that will handle the response of AddNoteActivity
    // TODO: Task2 - Create logic implementation for consuming the Note object received from AddNoteActivity and display it in Notes List

    override fun onStart() {
        super.onStart()
        binding.fabAdd.setOnClickListener {
            // TODO: Task3 - Replace with .launch call of ActivityResultLauncher object created on Task1
            startActivity(Intent(this, AddNoteActivity::class.java))
        }
    }
}