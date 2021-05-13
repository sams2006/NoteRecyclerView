package com.example.noterecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val notesList = ArrayList<Note>()
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2"))

       notes_recycler_view.adapter = NoteAdapter(notesList)
        notes_recycler_view.layoutManager = LinearLayoutManager(this)
        notes_recycler_view.setHasFixedSize(true)




    }

}