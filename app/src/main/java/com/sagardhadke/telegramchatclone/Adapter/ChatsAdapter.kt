package com.sagardhadke.telegramchatclone.Adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sagardhadke.telegramchatclone.Model.ChatsModel
import com.sagardhadke.telegramchatclone.databinding.DummyChatsBinding

class ChatsAdapter (val context: Context,val chatsArrayList:ArrayList<ChatsModel>):RecyclerView.Adapter<ChatsAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: DummyChatsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = DummyChatsBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chatsArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.teleImg.setImageResource(chatsArrayList[position].image)
        holder.binding.teleChatName.text =chatsArrayList[position].name
        holder.binding.teleDiss.text = chatsArrayList[position].lastmessage
        holder.binding.teleDate.text = chatsArrayList[position].time
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "${position}", Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnLongClickListener {
            Toast.makeText(context, "Test", Toast.LENGTH_SHORT).show()
            val builder = AlertDialog.Builder(context)
            builder.setTitle("Delete")
            builder.setMessage("Are you sure you want to delete this item?")
            builder.setPositiveButton("Yes") { dialog, which ->
                chatsArrayList.removeAt(position)
                notifyDataSetChanged()
            }
            builder.setNegativeButton("No") { dialog, which ->
                dialog.dismiss()
            }
            true
        }

    }

}