package com.example.noterecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
   private val  notesList = ArrayList<Note>()
    private val adapter = NoteAdapter(notesList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        insert_btn.setOnClickListener {
            val newItem = Note(R.drawable.ic_time ,"new item", "details", Random.nextInt(10))
            notesList.add(newItem)
            adapter.notifyItemInserted(insert_edit_text.text.toString().toInt())
        }
        remove_btn.setOnClickListener {
         val index=  remove_edit_text.text.toString().toInt()
            notesList.removeAt(index)
            adapter.notifyItemRemoved(index)
        }
        buildArrayList()
        buildRecyclerView()


    }

    private fun buildArrayList(){

        notesList.add(Note(R.drawable.ic_time , "note1" , "note2" , 6))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 7))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 3))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 7))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 3))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 7))
        notesList.add(Note(R.drawable.ic_time , "note1" , "note2", 3))


    }

    private fun buildRecyclerView(){
        notes_recycler_view.adapter = adapter
        notes_recycler_view.layoutManager = LinearLayoutManager(this)
        notes_recycler_view.setHasFixedSize(true)
    }

}