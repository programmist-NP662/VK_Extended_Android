package com.extended.vk.fragments.messages_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.extended.vk.R
import com.extended.vk.activity.MainActivity

class MessagesFragment : Fragment() {
    val fragmentName = "Чаты"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragment_messages, container, false)
        return root
    }
}