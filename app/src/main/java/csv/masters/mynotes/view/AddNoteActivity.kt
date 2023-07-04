package csv.masters.mynotes.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import csv.masters.mynotes.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.fabAdd.setOnClickListener {
            // TODO: Task6 - Create a Note instance from input fields
            // TODO: Task7 - Pass the result to MyNotesActivity
            finish()
        }
    }
}