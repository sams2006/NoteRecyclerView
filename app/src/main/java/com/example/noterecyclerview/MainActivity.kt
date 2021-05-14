package com.example.noterecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
   private var  notesList = ArrayList<Note>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buildArrayList()
        buildRecyclerView()
        

    }

    private fun buildArrayList(){

        notesList.add(Note(R.drawable.ic_time , "note1" , "note2" , 6))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 7))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 3))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 1))
        notesList.add(Note(R.drawable.ic_time , "note81" , "note882", 10))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 8))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 7))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2",9))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 6))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 9))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 2))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2" , 4))
    }

    private fun buildRecyclerView(){
        notes_recycler_view.adapter = NoteAdapter(notesList)
        notes_recycler_view.layoutManager = LinearLayoutManager(this)
        notes_recycler_view.setHasFixedSize(true)
    }

}