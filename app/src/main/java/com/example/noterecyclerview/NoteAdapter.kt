package com.example.noterecyclerview

import android.util.Log.i
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val notesList: List<Note>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    class NoteViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){

        val imageView:ImageView = itemView.findViewById(R.id.image_view)
        val text1: TextView = itemView.findViewById(R.id.not1_text_view)
        val text2: TextView = itemView.findViewById(R.id.not2_text_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.note_list_item , parent , false)
        return NoteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
       val currentNote = notesList[position]
        holder.imageView.setImageResource(currentNote.imageResource)
        holder.text1.text = currentNote.note1Text
        holder.text2.text = currentNote.note2Text


    }

    override fun getItemCount(): Int {
       return notesList.size
    }
}