/*
 * Copyright (C) 2019 Mobile Application Lab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.singletapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.singletapapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.clickListener = this

        // Set single click listener programmatically.
//        button.setOnSingleClickListener(View.OnClickListener {
//            // TODO handle click action.
//        })
//
//        button.setOnClickListener(OnSingleClickListener(View.OnClickListener {
//            // TODO handle click action.
//        }, intervalMs = 3000))
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                count++
                hw.text = "$count times clicked!!"
            }
        }
    }
}
