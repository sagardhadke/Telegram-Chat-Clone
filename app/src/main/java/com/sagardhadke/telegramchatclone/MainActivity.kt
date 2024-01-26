package com.sagardhadke.telegramchatclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.sagardhadke.telegramchatclone.Adapter.ChatsAdapter
import com.sagardhadke.telegramchatclone.Model.ChatsModel
import com.sagardhadke.telegramchatclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit  var chatsAdapter : ChatsAdapter
    lateinit var chatsArrayList: ArrayList<ChatsModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        chatsArrayList = ArrayList()
        chatsArrayList.add(ChatsModel(R.drawable.chat1,"Unique Computer","Hey Welcom to the Unique Computer","Jan 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat2,"Cake Shop","Your cake is ready come and collect your cake","Fed 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat3,"Joy","Hello I am using Telegram","Jun 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat4,"Priya","Hey bro, Priya Here","May 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat5,"Unique Computer","Hey Welcom to the Unique Computer","Apr 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chats6,"Nasa","Testing Chats","Nov 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chats7,"Zee5","subscribe Sagar Dhadke Youtube Channel","Dec 26"))

        chatsArrayList.add(ChatsModel(R.drawable.chat2,"Cake Shop","Your cake is ready come and collect your cake","Fed 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat3,"Joy","Hello I am using Telegram","Jun 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat4,"Priya","Hey bro, Priya Here","May 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat5,"Unique Computer","Hey Welcom to the Unique Computer","Apr 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chats6,"Nasa","Testing Chats","Nov 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chats7,"Zee5","subscribe Sagar Dhadke Youtube Channel","Dec 26"))

        chatsArrayList.add(ChatsModel(R.drawable.chat2,"Cake Shop","Your cake is ready come and collect your cake","Fed 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat3,"Joy","Hello I am using Telegram","Jun 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat4,"Priya","Hey bro, Priya Here","May 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chat5,"Unique Computer","Hey Welcom to the Unique Computer","Apr 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chats6,"Nasa","Testing Chats","Nov 26"))
        chatsArrayList.add(ChatsModel(R.drawable.chats7,"Zee5","subscribe Sagar Dhadke Youtube Channel","Dec 26"))

        chatsAdapter = ChatsAdapter(this,chatsArrayList)
        binding.chatsData.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.chatsData.adapter = chatsAdapter

    }
}